package com.trainmanagement.services;

public class SearchService {

	/**
     * Performs a linear search for a target ID.
     * @param bogieIds The array of IDs to search through.
     * @param targetId The specific ID we are looking for.
     * @return The index of the ID if found, otherwise -1.
     */
    public int findBogieIndex(String[] bogieIds, String targetId) {
        // Iterate through the array from index 0 to length - 1
        for (int i = 0; i < bogieIds.length; i++) {
            // Use .equals() for string comparison, not ==
            if (bogieIds[i].equalsIgnoreCase(targetId)) {
                return i; // Target found, return current position
            }
        }
        return -1; // Target not found after checking the entire list
    }
}
