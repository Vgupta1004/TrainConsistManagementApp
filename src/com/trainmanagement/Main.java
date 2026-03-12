package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;
import com.trainmanagement.exceptions.*;

/**
 * Use Case 16: Sort Passenger Bogies by Capacity (Bubble Sort)
 * Implements the Bubble Sort algorithm for educational purposes 
 * to demonstrate O(n^2) time complexity.
 * 
 * @author Developer
 * @version 16.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("---------------------------------------");
		System.out.println("Train Consist Management App");
		System.out.println("---------------------------------------");
		
		int[] capacities = {72, 56, 24, 70, 60};
        
        System.out.println("Original Capacities: " + Arrays.toString(capacities));

        // 2. Perform manual sorting
        SortingService sortingService = new SortingService();
        sortingService.bubbleSort(capacities);

        // 3. Display sorted result
        System.out.println("Sorted Capacities (Ascending): " + Arrays.toString(capacities));
        System.out.println("UC16 sorting completed successfully.");
        
	}

}
