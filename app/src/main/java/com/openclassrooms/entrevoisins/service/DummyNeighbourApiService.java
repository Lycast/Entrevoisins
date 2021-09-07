package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.List;

/**
 * Dummy mock for the Api
 */
public class DummyNeighbourApiService implements  NeighbourApiService {

    private List<Neighbour> neighbours = DummyNeighbourGenerator.generateNeighbours();

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Neighbour> getNeighbours() {
        return neighbours;
    }

    @Override
    public List<Neighbour> getFavoriteNeighbour() {
        List<Neighbour> favoriteNeighbour = new ArrayList<>();
        for(Neighbour neighbour : neighbours){
            if (neighbour.isFavorite()) {
                favoriteNeighbour.add(neighbour);
            }
        }
        return favoriteNeighbour;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteNeighbour(Neighbour neighbour) {
        neighbours.remove(neighbour);
    }

    /**
     * {@inheritDoc}
     * @param neighbour
     */
    @Override
    public void createNeighbour(Neighbour neighbour) {
        neighbours.add(neighbour);
    }

    /**
     * set is favorite
     * @param neighbour
     * @param value
     */
    public void setIsFavorite(Neighbour neighbour, boolean value){
          int position = neighbours.indexOf(neighbour);
          neighbours.get(position).setFavorite(value);
    }
}
