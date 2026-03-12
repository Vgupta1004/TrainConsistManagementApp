package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;
import com.trainmanagement.exceptions.*;

/**
 * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
 * Description: Ensure that the application gracefully handles cases where a 
 * bogie is created with an invalid (negative) seating capacity. 
 * Implement a custom exception to manage this scenario and prevent the addition 
 * of such bogies to the train formation.
 *
 * @author Developer
 * @version 14.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("---------------------------------------");
		System.out.println("Train Consist Management App");
		System.out.println("---------------------------------------");
		
		TrainService service = new TrainService();
		
		try {
            // 1. Valid Creation
            Bogie sleeper = new Bogie("B-101", "Sleeper", 72);
            service.addBogie(sleeper);
            System.out.println("Created Bogie: " + sleeper);

            // 2. Invalid Creation (This will trigger the exception)
            Bogie invalidBogie = new Bogie("B-999", "Economy", -10);
            service.addBogie(invalidBogie);

        } catch (InvalidCapacityException e) {
            // 3. Handle the error safely without crashing the app
            System.err.println("Error: " + e.getMessage()); 
        }

        System.out.println("UC14 exception handling completed...");
        
	}

}
