package com.trainmanagement.services;

import com.trainmanagement.models.*;
import java.util.*;

public class TrainService {

	private Set<Bogie> formation = new LinkedHashSet<>();

	/**
     * Adds a bogie to the formation.
     */
    public void addBogie(Bogie bogie) {
        if (!formation.add(bogie)) {
            System.out.println("Duplicate ID: " + bogie.getId() + " rejected.");
            return;
        }
        System.out.println("Added: " + bogie.getId());
    }
    
    /**
     * Sorts and displays bogies by capacity in ascending order.
     * Uses Comparator.comparingInt() for clean, declarative logic.
     */
    public void sortBogiesByCapacity() {
        // Step 1: Convert Set to List to allow sorting
        List<Bogie> bogieList = new ArrayList<>(formation);

        // Step 2: Apply sorting logic using a Lambda Expression
        bogieList.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\n--- Bogies Sorted by Capacity (Ascending) ---");
        bogieList.forEach(b -> System.out.println(b.getName() + " -> " + b.getCapacity()));
    }
    
    public void removeBogieById(String id) {
        formation.removeIf(b -> b.getId().equals(id));
    }
    
}
