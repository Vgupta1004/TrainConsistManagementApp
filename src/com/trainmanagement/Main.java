package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;

/**
 * Use Case 11: Validate Train ID and Cargo Code.
 * This service uses Pattern matching to ensure data integrity 
 * across the application.
 *
 * @author Developer
 * @version 11.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("---------------------------------------");
		System.out.println("Train Consist Management App");
		System.out.println("---------------------------------------");
		
		TrainService trainService = new TrainService();
		
		trainService.addBogie(new Bogie("B-101", "Sleeper", 72));
        trainService.addBogie(new Bogie("B-102", "AC Chair", 56));
        trainService.addBogie(new Bogie("B-103", "First Class", 24));
        trainService.addBogie(new Bogie("B-104", "Sleeper", 70));
        
        int totalCapacity = trainService.calculateTotalSeats();

        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);
        System.out.println("UC10 aggregation completed successfully.\n");
        
        String[] testTrainIds = {"TRN-6524", "TRAIN-12", "TRN-99999"};
        
        for (String id : testTrainIds) {
            boolean isValid = ValidationService.isValidTrainId(id);
            System.out.println("Train ID [" + id + "] Valid: " + isValid);
        }
        
        String validCargo = "PET-FH";
        String invalidCargo = "PET-12";

        System.out.println("\nCargo Code [" + validCargo + "] Valid: " + 
                           ValidationService.isValidCargoCode(validCargo));
        System.out.println("Cargo Code [" + invalidCargo + "] Valid: " + 
                           ValidationService.isValidCargoCode(invalidCargo));

        System.out.println("\nUC11 validation completed successfully.");
        
	}

}
