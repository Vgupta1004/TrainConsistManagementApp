package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;

/**
 * Use Case 6: Map Bogie to Capacity (HashMap)
 * Associates each bogie with seating or load capacity using a key-value mapping.
 * Maintains all previous features including unique formation and removal
 *
 * @author Developer
 * @version 5.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("---------------------------------------");
		System.out.println("Train Consist Management App");
		System.out.println("---------------------------------------");
		
		TrainService service = new TrainService();
		
		service.setCapacityRule("Sleeper", 72);
        service.setCapacityRule("AC Chair", 56);
        service.setCapacityRule("Cargo", 120);
        
        service.addBogie(new Bogie("B-101", "Sleeper", 0));
        service.addBogie(new Bogie("B-102", "AC Chair", 0));
        service.addBogie(new Bogie("B-103", "Cargo", 0));
		
        System.out.println("Is B-102 present? " + service.hasBogie("B-102"));
        service.removeBogieById("B-103");
        
        service.printFullStatus();
	}

}
