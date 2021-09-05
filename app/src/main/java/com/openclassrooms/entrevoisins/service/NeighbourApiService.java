package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.List;


/**
 * Neighbour API client
 */
public interface NeighbourApiService {

    /**
     * Get all my Neighbours
     * @return {@link List}
     */
    List<Neighbour> getNeighbours();

    /**
     * Get Neighbour favorite
     * @return {@link List}
     */
    List<Neighbour> getFavoriteNeighbour();
    //TODO

    /**
     * Deletes a neighbour
     * @param neighbour
     */
    void deleteNeighbour(Neighbour neighbour);

    /**
     * Create a neighbour
     * @param neighbour
     */
    void createNeighbour(Neighbour neighbour);

    /**
     * add a favorite neighbour
     * @param neighbour
     */
    void addFavoriteNeighbour(Neighbour neighbour);

    /**
     * delete a favorite neighbour
     * @param neighbour
     */
    void deleteFavoriteNeighbour(Neighbour neighbour);
}
