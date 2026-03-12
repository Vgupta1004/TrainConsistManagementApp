package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;

/**
 * Use Case 7: Sort Bogies by Capacity.
 * Uses Comparator to rearrange bogies based on seating capacity.
 * Maintains separation of data and logic for better maintainability
 *
 * @author Developer
 * @version 7.0
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
        
        trainService.sortBogiesByCapacity();
	}

}
