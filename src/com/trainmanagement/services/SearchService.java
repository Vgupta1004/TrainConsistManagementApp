package com.trainmanagement.services;
import java.util.List;

public class SearchService {

	/**
     * Performs a search only if the train consist is populated.
     * @param consist The current list of bogies.
     * @param targetId The ID to find.
     * @throws IllegalStateException if the train is empty.
     */
    public int findBogieWithStateCheck(List<String> consist, String targetId) {
        // STATE VALIDATION: Check if the collection is empty
        if (consist == null || consist.isEmpty()) {
            // FAIL-FAST: Throw runtime exception immediately
            throw new IllegalStateException("Search Error: Cannot search an empty train consist.");
        }

        // Search logic only runs if validation passes
        for (int i = 0; i < consist.size(); i++) {
            if (consist.get(i).equalsIgnoreCase(targetId)) {
                return i;
            }
        }
        return -1;
    }
}
