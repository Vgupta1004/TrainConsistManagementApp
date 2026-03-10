package com.trainmanagement.services;

import com.trainmanagement.models.*;
import java.util.*;

public class TrainService {

	private Set<Bogie> formation = new LinkedHashSet<>();
	private Map<String, Integer> capacityRules = new HashMap<>();

	/**
     * Defines the capacity rule for a specific type of bogie
     */
    public void setCapacityRule(String type, int capacity) {
        capacityRules.put(type, capacity); // [cite: 548, 562]
        System.out.println("Rule Defined: " + type + " bogies carry " + capacity + " units.");
    }
    
    /**
     * CREATE: Attaches a bogie to the train
     */
    public void addBogie(Bogie bogie) {
        if (!formation.add(bogie)) { // [cite: 435]
            System.out.println("Error: Bogie " + bogie.getId() + " is already attached.");
            return;
        }
        System.out.println("Attached: " + bogie.getId());
    }
    
    /**
     * DELETE: Detaches a bogie by its ID
     */
    public void removeBogieById(String id) {
        boolean removed = formation.removeIf(b -> b.getId().equals(id));
        if (removed) {
            System.out.println("Detached: " + id);
        } else {
            System.out.println("Error: Bogie " + id + " not found.");
        }
    }
    
    /**
     * READ: Verifies if a bogie is in the consist
     */
    public boolean hasBogie(String id) {
        return formation.stream().anyMatch(b -> b.getId().equals(id));
    }
    
    
    /**
     * READ: Displays the full consist with capacity lookups
     */
    public void printFullStatus() {
        System.out.println("\n--- Current Train Status ---");
        for (Bogie bogie : formation) {
            // Lookup capacity based on the bogie name/type from our Map
            Integer cap = capacityRules.get(bogie.getName());
            System.out.println(bogie.getId() + " [" + bogie.getName() + "] -> Capacity: " + (cap != null ? cap : "Unknown"));
        }
        System.out.println("Total Bogies: " + formation.size());
    }
    
}
