package com.trainmanagement.services;

import com.trainmanagement.models.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TrainService {
	
	private List<GoodsBogie> goodsConsist = new ArrayList<>();

    public void addGoodsBogie(GoodsBogie bogie) {
        goodsConsist.add(bogie);
    }

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
        // stream() initiates the pipeline
        // map(Bogie::getCapacity) extracts numeric values
        // reduce(0, Integer::sum) aggregates values into a total
        return formation.stream()
                .map(Bogie::getCapacity) 
                .reduce(0, Integer::sum); 
    }
    
    public void removeBogieById(String id) {
        formation.removeIf(b -> b.getId().equals(id));
    }
    
    /**
     * Checks if the entire train formation is safety-compliant.
     * Rule: Cylindrical bogies MUST only carry Petroleum.
     */
    public boolean isTrainSafetyCompliant() {
        // allMatch() evaluates if every bogie satisfies the condition 
        return goodsConsist.stream().allMatch(b -> {
            if (b.getShape().equalsIgnoreCase("Cylindrical")) {
                return b.getCargo().equalsIgnoreCase("Petroleum");
            }
            return true; // Other shapes are considered safe for this UC 
        });
    }
    
    public void printGoodsConsist() {
        System.out.println("\n--- Goods Consist Safety Report ---");
        goodsConsist.forEach(System.out::println);
    }
    
}
