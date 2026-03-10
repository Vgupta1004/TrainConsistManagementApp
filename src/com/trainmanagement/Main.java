package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;

/**
 * Use Case 4: Maintain Ordered Bogie Consist.
 * This class models the physical chaining of train bogies using LinkedList 
 * for ordered and positional operations
 *
 * @author Developer
 * @version 4.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("---------------------------------------");
		System.out.println("Train Consist Management App");
		System.out.println("---------------------------------------");
		
		TrainService trainService = new TrainService();
		
		trainService.addBogie(new Bogie("B101", "Sleeper", 72));
        trainService.addBogie(new Bogie("B102", "AC Chair", 56));
        
        trainService.addFirst(new Bogie("ENG-01", "Engine", 0));

        trainService.addAtPosition(2, new Bogie("P-500", "Pantry Car", 0));

        System.out.println("Has AC Chair (B102)? " + trainService.hasBogie("B102"));
        
        trainService.printConsistSummary();
		
		
	}

}
