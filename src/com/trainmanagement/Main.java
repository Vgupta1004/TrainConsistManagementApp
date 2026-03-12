package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;
import com.trainmanagement.exceptions.*;

/**
 * Use Case 17: Sort Bogie Names Using Arrays.sort()
 * Description:
 * This use case demonstrates the sorting of bogie capacities 
 * using a manual implementation of the bubble sort algorithm. 
 * The application initializes an array of bogie capacities, 
 * sorts them in ascending order, and displays the sorted result. 
 * This illustrates the concept of sorting algorithms and their 
 * application in managing train consist data.
 * 
 * @author Developer
 * @version 17.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("---------------------------------------");
		System.out.println("Train Consist Management App");
		System.out.println("---------------------------------------");
		
		String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};
        
        System.out.println("Original Bogie Names: " + Arrays.toString(bogieNames));

        SortingService sortingService = new SortingService();
        sortingService.sortBogieNames(bogieNames);

        System.out.println("Sorted Bogie Names (Alphabetical): " + Arrays.toString(bogieNames));
        System.out.println("UC17 sorting completed.");
        
	}

}
