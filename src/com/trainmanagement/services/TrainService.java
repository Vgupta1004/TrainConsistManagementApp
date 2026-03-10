package com.trainmanagement.services;

import com.trainmanagement.models.*;
import java.util.*;

public class TrainService {

	private Set<Bogie> formation = new LinkedHashSet<>();

	/**
     * CREATE: Attaches a bogie in order. If the bogie ID already exists, 
     * the method ignores the insertion automatically. [cite: 404, 435]
     */
    public void addBogie(Bogie bogie) {
        // LinkedHashSet handles the duplicate check internally
        if (!formation.add(bogie)) {
            System.out.println("Duplicate Blocked: Bogie ID " + bogie.getId() + " is already in the formation.");
            return;
        }
        System.out.println("Attached in Sequence: " + bogie.getId());
    }
	
    /**
     * DELETE: Removes a specific bogie from the formation.
     */
    public void removeBogieById(String id) {
        boolean removed = formation.removeIf(b -> b.getId().equals(id));
        if (removed) {
            System.out.println("Detached Bogie ID: " + id);
        } else {
            System.out.println("Error: Bogie ID " + id + " not found.");
        }
    }
	
    /**
     * READ: Verifies if a specific bogie ID is present.
     */
    public boolean hasBogie(String id) {
        return formation.stream().anyMatch(b -> b.getId().equals(id));
    }
    
    /**
     * READ: Displays final train formation in original order. [cite: 407, 428]
     */
    public void printFormationSummary() {
        System.out.println("\n--- UC5 Final Train Formation ---");
        // Iteration returns bogies in the same order they were connected [cite: 445]
        formation.forEach(System.out::println);
        System.out.println("Total Bogies: " + formation.size());
    }
}
