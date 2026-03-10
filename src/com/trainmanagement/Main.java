package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;

/**
 * Use Case 3: Track unique Bogie IDs
 * Track Unique Bogie IDs with full CRUD support.
 * This service manages the train consist, ensuring each bogie ID is 
 * unique and providing methods for removal and verification.
 *
 * @author Developer
 * @version 3.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("---------------------------------------");
		System.out.println("Train Consist Management App");
		System.out.println("---------------------------------------");
		
		TrainService trainService = new TrainService();
		
		trainService.addBogie(new Bogie("BG101", "Sleeper", 72));
        trainService.addBogie(new Bogie("BG102", "AC Chair", 56));
        trainService.addBogie(new Bogie("BG103", "First Class", 24));
        
        trainService.addBogie(new Bogie("BG101", "General", 90)); 

        System.out.println("Is 'BG102' in the train? " + trainService.hasBogie("BG102"));

        trainService.removeBogieById("BG102");

        trainService.printConsistSummary();
		
		
	}

}
