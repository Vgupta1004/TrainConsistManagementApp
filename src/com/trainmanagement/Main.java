package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;
import com.trainmanagement.exceptions.*;

/**
 * Use Case 20: Exception Handling During Search Operations
 * Description: This use case demonstrates robust exception handling 
 * during search operations in the Train Consist Management App. 
 * It simulates a scenario where a user attempts to search for a 
 * bogie in a sorted consist using binary search. 
 * The code includes error handling to manage cases where the 
 * target bogie is not found, ensuring that the application remains 
 * stable and provides informative feedback to the user.
 *
 * @author Developer
 * @version 20.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("---------------------------------------");
		System.out.println("Train Consist Management App");
		System.out.println("---------------------------------------");
		
		SearchService searchService = new SearchService();
        List<String> trainConsist = new ArrayList<>();

        try {
            System.out.println("Triggering search on an empty train consist...");
            // This triggers the IllegalStateException
            searchService.findBogieWithStateCheck(trainConsist, "BG-101");

        } catch (IllegalStateException e) {
            // Catching the runtime exception to show a meaningful message
            System.err.println("STOPPED: " + e.getMessage()); 
        }

        System.out.println("\nUC20: System protected from invalid search state.");
    }

}
