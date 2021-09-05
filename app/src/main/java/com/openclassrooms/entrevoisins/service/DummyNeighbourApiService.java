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

    @Override
    public void addFavoriteNeighbour(Neighbour neighbour) {
        setIsFavorite(neighbour, true);
    }

    @Override
    public void deleteFavoriteNeighbour(Neighbour neighbour) {
        setIsFavorite(neighbour, false);
    }

    /**
     * set is favorite
     * @param neighbour
     * @param value
     */
    private void setIsFavorite(Neighbour neighbour, boolean value){
        neighbour.setFavorite(value);
        for(Neighbour n : neighbours){
            if(n.getId() == neighbour.getId()){
                n.setFavorite(value);
                break;
            }
        }
    }
}
