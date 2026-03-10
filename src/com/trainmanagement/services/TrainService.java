package com.trainmanagement.services;

import com.trainmanagement.models.*;
import java.util.*;

public class TrainService {

	private LinkedList<Bogie> trainConsist = new LinkedList<>();
	private Set<String> registeredIds = new HashSet<>();

	/**
     * CREATE: Adds a bogie only if the ID is unique.
     */
	public void addBogie(Bogie bogie) {
        if (!registeredIds.add(bogie.getId())) {
            System.out.println("Duplicate Blocked: " + bogie.getId());
            return;
        }
        trainConsist.addLast(bogie); // Attaches to the rear
        System.out.println("Attached to Rear: " + bogie.getId());
    }
	
	public void addFirst(Bogie bogie) {
        if (registeredIds.add(bogie.getId())) {
            trainConsist.addFirst(bogie);
            System.out.println("Attached to Front: " + bogie.getId());
        }
    }
	
	public void addAtPosition(int index, Bogie bogie) {
        if (index >= 0 && index <= trainConsist.size() && registeredIds.add(bogie.getId())) {
            trainConsist.add(index, bogie);
            System.out.println("Inserted at position " + index + ": " + bogie.getId());
        }
    }
    
    /**
     * DELETE: Removes a bogie from both the consist and the unique ID tracker.
     */
    public void removeBogieById(String id) {
        // Find the bogie in the list to remove it
        boolean removed = trainConsist.removeIf(b -> b.getId().equals(id));
        
        if (removed) {
            // Also remove from the Set to allow this ID to be reused if needed
            registeredIds.remove(id);
            System.out.println("Detached Bogie ID: " + id);
        } else {
            System.out.println("Error: Bogie ID " + id + " not found in consist.");
        }
    }
    
    /**
     * READ: Checks whether a specific bogie ID exists in the train.
     */
    public boolean hasBogie(String id) {
        // Sets provide O(1) lookup time, making this more efficient than list traversal
        return registeredIds.contains(id);
    }
    
    /**
     * READ: Displays the summary of the train formation.
     */
    public void printConsistSummary() {
        System.out.println("\n--- Train Consist Summary ---");
        if (trainConsist.isEmpty()) {
            System.out.println("The train is currently empty.");
        } else {
            trainConsist.forEach(System.out::println);
        }
        System.out.println("Total Unique Bogies: " + registeredIds.size());
    }
    
    

}
