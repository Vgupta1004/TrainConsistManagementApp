package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;
import com.trainmanagement.exceptions.*;

/**
 * Use Case 18: Linear Search for Bogie ID (Array-Based Searching)
 * Description: This use case demonstrates a linear search algorithm 
 * to find a specific bogie ID within an array of bogie names. 
 * The linear search iterates through each element in the array sequentially 
 * until it finds a match or reaches the end of the array. 
 * This is a fundamental searching technique that is easy to 
 * implement and understand, making it suitable for small datasets or unsorted arrays.
 * 
 * 
 * @author Developer
 * @version 18.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("---------------------------------------");
		System.out.println("Train Consist Management App");
		System.out.println("---------------------------------------");
		
		String[] trainConsist = {"ENG-01", "SL-101", "AC-202", "PC-500", "GR-99"};
        
        SearchService searchService = new SearchService();
        String target = "PC-500"; // Searching for the Pantry Car

        int resultIndex = searchService.findBogieIndex(trainConsist, target);

        if (resultIndex != -1) {
            System.out.println("Bogie " + target + " located at Position: " + resultIndex);
        } else {
            System.out.println("Bogie " + target + " not found in the current consist.");
        }
        
        System.out.println("UC18 search operation completed.");
        
	}

}
