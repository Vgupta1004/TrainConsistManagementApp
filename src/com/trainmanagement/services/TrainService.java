package com.trainmanagement.services;

import com.trainmanagement.models.*;
import java.util.*;
import java.util.stream.Collectors;

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
     * Filters bogies by capacity using the Stream API.
     * @param threshold The minimum seating capacity required
     * @return A list of bogies meeting the criteria.
     */
    public List<Bogie> filterHighCapacityBogies(int threshold) {
        // stream() converts the set into a pipeline
        // filter() selects elements meeting the condition
        // collect() transforms the result back into a List
        return formation.stream()
                .filter(b -> b.getCapacity() > threshold) // Lambda condition 
                .collect(Collectors.toList()); 
    }
    
    public void removeBogieById(String id) {
        formation.removeIf(b -> b.getId().equals(id));
    }
    
}
