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
     * Calculates the total seating capacity of the train.
     * Uses map() to extract capacities and reduce() to sum them.
     */
    public int calculateTotalSeats() {
        // stream() initiates the pipeline [cite: 1074]
        // map(Bogie::getCapacity) extracts numeric values [cite: 1075]
        // reduce(0, Integer::sum) aggregates values into a total [cite: 1076]
        return formation.stream()
                .map(Bogie::getCapacity) 
                .reduce(0, Integer::sum); 
    }
    
    public void removeBogieById(String id) {
        formation.removeIf(b -> b.getId().equals(id));
    }
    
}
