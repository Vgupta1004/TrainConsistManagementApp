package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;

/**
 * Use Case 9: Group Bogies by Type.
 * This service transforms flat collections into hierarchical structures
 * suitable for reporting and operational analysis.
 *
 * @author Developer
 * @version 9.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("---------------------------------------");
		System.out.println("Train Consist Management App");
		System.out.println("---------------------------------------");
		
		TrainService trainService = new TrainService();
		
		trainService.addBogie(new Bogie("B-101", "Sleeper", 72));
        trainService.addBogie(new Bogie("B-102", "AC Chair", 56));
        trainService.addBogie(new Bogie("B-103", "Sleeper", 70));
        trainService.addBogie(new Bogie("B-104", "AC Chair", 60));
        trainService.addBogie(new Bogie("B-105", "First Class", 24));
        
        Map<String, List<Bogie>> groupedBogies = trainService.groupBogiesByType();
        
        System.out.println("\n--- Categorized Bogie Report ---");
        groupedBogies.forEach((type, list) -> {
            System.out.println("Category: " + type + " (Count: " + list.size() + ")");
            list.forEach(b -> System.out.println("  -> ID: " + b.getId() + ", Capacity: " + b.getCapacity()));
        });
        
        System.out.println("\nUC9 classification logic completed.");
	}

}
