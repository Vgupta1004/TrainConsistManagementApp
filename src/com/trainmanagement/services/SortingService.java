package com.trainmanagement.services;

public class SortingService {

	/**
     * Sorts an array of integers using the Bubble Sort algorithm.
     * @param capacities The array of bogie capacities to be sorted.
     */
	public void bubbleSort(int[] capacities) {
        int n = capacities.length;
        // Outer loop controls the number of passes through the array [cite: 1831, 1853]
        for (int i = 0; i < n - 1; i++) {
            // Inner loop performs adjacent comparisons and swaps [cite: 1801, 1867]
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap logic: Move the larger element to the right [cite: 1802, 1868]
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

}
