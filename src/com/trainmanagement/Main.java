package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;
import com.trainmanagement.exceptions.*;

/**
 * Use Case 19: Binary Search for Bogie ID (Optimized Searching)
 * Description:
 * This use case demonstrates an optimized search 
 * operation within the train consist using binary search.
 *
 * @author Developer
 * @version 19.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("---------------------------------------");
		System.out.println("Train Consist Management App");
		System.out.println("---------------------------------------");
		
		String[] sortedConsist = {"AC-202", "ENG-01", "GR-99", "PC-500", "SL-101"};
        System.out.println("Sorted Consist: " + Arrays.toString(sortedConsist));

        SearchService searchService = new SearchService();
        String target = "GR-99";

        int resultIndex = searchService.binarySearchBogie(sortedConsist, target);

        if (resultIndex != -1) {
            System.out.println("Bogie " + target + " found at index: " + resultIndex);
        } else {
            System.out.println("Bogie " + target + " not found.");
        }
    }

}
