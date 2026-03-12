package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;

/**
 * Use Case 8: Filter Passenger Bogies Using Streams.
 * This service applies functional filtering to the train consist
 * to isolate bogies based on specific capacity requirements.
 *
 * @author Developer
 * @version 8.0
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
        trainService.addBogie(new Bogie("B-104", "General", 90));
        
        int limit = 60;
        List<Bogie> highCapBogies = trainService.filterHighCapacityBogies(limit);
        
        System.out.println("\nFiltered Bogies (Capacity > " + limit + "):");
        highCapBogies.forEach(b -> System.out.println(b.getName() + " -> " + b.getCapacity()));
        
        System.out.println("UC8 filtering completed.");
        
	}

}
