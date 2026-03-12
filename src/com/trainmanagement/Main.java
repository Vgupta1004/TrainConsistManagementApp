package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;
import com.trainmanagement.exceptions.*;

/**
 * Use Case 15: Safe Cargo Assignment Using try-catch-finally 
 * Description: This use case demonstrates how to safely handle exceptions 
 * when assigning cargo to a bogie.
 * 
 * @author Developer
 * @version 15.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("---------------------------------------");
		System.out.println("Train Consist Management App");
		System.out.println("---------------------------------------");
		
		GoodsBogie bogieG1 = new GoodsBogie("G-501", "Rectangular");
		
		try {
            // Attempt an unsafe assignment
            System.out.println("Attempting to load Petroleum into Rectangular Bogie...");
            bogieG1.assignCargo("Petroleum");

        } catch (CargoSafetyException e) {
            // Catch and report the error without crashing the app
            System.err.println("STOPPED: " + e.getMessage());

        } finally {
            // Mandatory logic that runs no matter what (logging/cleanup)
            System.out.println("Cargo validation completed for " + bogieG1.getShape() + " bogie.");
        }

        System.out.println("\nUC15: System remains operational after safety check.");
        
	}

}
