package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;

/**
 * Use Case 10: Count Total Seats in Train.
 * This service performs quantitative analysis by aggregating numeric 
 * properties across the collection using functional reduction.
 *
 * @author Developer
 * @version 10.0
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
        System.out.println("UC10 aggregation completed successfully.");
	}

}
