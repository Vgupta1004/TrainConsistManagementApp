package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;

/**
 * Use Case 2: Add Passenger Bogies to Train.
 * This service layer implements dynamic management of the train's 
 * physical composition using the ArrayList collection. It maps 
 * standard CRUD (Create, Read, Update, Delete) operations to 
 * realistic railway scenarios.
 *
 * @author Developer
 * @version 2.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("---------------------------------------");
		System.out.println("Train Consist Management App");
		System.out.println("---------------------------------------");
		
		TrainService trainService = new TrainService();
		
		trainService.addBogie(new Bogie("Sleeper", 72));
        trainService.addBogie(new Bogie("AC Chair", 56));
        trainService.addBogie(new Bogie("First Class", 24));
        
        trainService.printConsistSummary();
        trainService.removeBogie("AC Chair");
        System.out.println("Is 'Sleeper' available? " + trainService.hasBogieType("Sleeper"));
        trainService.printConsistSummary();
		
		
	}

}
