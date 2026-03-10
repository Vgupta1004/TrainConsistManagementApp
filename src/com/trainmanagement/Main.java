package com.trainmanagement;
import java.util.*;

/**
 * Use Case 1: Initialize Train and Display Consist Summary
 * This class represents the entry point of the application.
 * It introduces collection initialization and basic program flow.
 * 
 * @author Developer
 * @version 1.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("---------------------------------------");
		System.out.println("Train Consist Management App");
		System.out.println("---------------------------------------");
		
		List<String> trainConsist = new ArrayList<>();
		
		System.out.println("Train initialized successfully...");
		System.out.println("Initial Bogie Count: " + trainConsist.size());
		System.out.println("System ready for operations...");
	}

}
