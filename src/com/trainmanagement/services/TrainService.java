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
     * Groups bogies by their name/type.
     * @return A Map where keys are Bogie names and values are Lists of those Bogies.
     */
    public Map<String, List<Bogie>> groupBogiesByType() {
        // stream() initiates the pipeline
        // groupingBy() classifies elements based on the Bogie name
        return formation.stream()
                .collect(Collectors.groupingBy(Bogie::getName));
    }
    
    public void removeBogieById(String id) {
        formation.removeIf(b -> b.getId().equals(id));
    }
    
}
