package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;

/**
 * Use Case 5: Preserve Insertion Order of Bogies.
 * This service maintains the exact attachment order of bogies 
 * while also preventing duplicate entries using LinkedHashSet.
 *
 * @author Developer
 * @version 5.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("---------------------------------------");
		System.out.println("Train Consist Management App");
		System.out.println("---------------------------------------");
		
		TrainService trainService = new TrainService();
		
		trainService.addBogie(new Bogie("B101", "Engine", 0));
        trainService.addBogie(new Bogie("B102", "Sleeper", 72));
        trainService.addBogie(new Bogie("B103", "Cargo", 120));
        trainService.addBogie(new Bogie("B104", "Guard", 0));
        
        trainService.addBogie(new Bogie("B102", "Sleeper", 72)); 

        trainService.printFormationSummary();
        System.out.println("UC5 formation setup completed.");
		
		
	}

}
