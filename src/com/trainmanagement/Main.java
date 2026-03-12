package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;

/**
 * UC12: Checks if the entire train formation is safety-compliant.
 * Rule: Cylindrical bogies MUST only carry Petroleum.
 *
 * @author Developer
 * @version 12.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("---------------------------------------");
		System.out.println("Train Consist Management App");
		System.out.println("---------------------------------------");
		
		TrainService trainService = new TrainService();
		
		trainService.addGoodsBogie(new GoodsBogie("G1", "Cylindrical", "Petroleum"));
        trainService.addGoodsBogie(new GoodsBogie("G2", "Open", "Coal"));
        trainService.addGoodsBogie(new GoodsBogie("G3", "Box", "Grain"));
        trainService.addGoodsBogie(new GoodsBogie("G4", "Cylindrical", "Coal"));
        
        trainService.printGoodsConsist();
        boolean isSafe = trainService.isTrainSafetyCompliant();

        System.out.println("\nSafety Compliance Status: " + isSafe);
        if (!isSafe) {
            System.out.println("ALERT: Train formation is NOT SAFE. Check Cylindrical bogies.");
        }
        
	}

}
