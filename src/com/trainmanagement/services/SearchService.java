package com.trainmanagement.services;

public class SearchService {

	/**
     * Performs a binary search on a sorted array of IDs.
     * @param sortedIds The alphabetically sorted array of Bogie IDs.
     * @param targetId The ID to find.
     * @return The index of the ID, or -1 if not found.
     */
    public int binarySearchBogie(String[] sortedIds, String targetId) {
        int low = 0;
        int high = sortedIds.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = targetId.compareToIgnoreCase(sortedIds[mid]);

            if (comparison == 0) {
                return mid; // Found the target
            } else if (comparison > 0) {
                low = mid + 1; // Target is in the upper half
            } else {
                high = mid - 1; // Target is in the lower half
            }
        }
        return -1; // Not found
    }
}
