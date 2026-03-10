package com.trainmanagement.services;

import com.trainmanagement.models.*;
import java.util.ArrayList;
import java.util.List;

public class TrainService {

	private List<Bogie> trainConsist = new ArrayList<>();

    // CREATE: Add a new bogie to the end of the train
    public void addBogie(Bogie bogie) {
        trainConsist.add(bogie);
        System.out.println("Attached: " + bogie.getName());
    }
    
    // DELETE: Remove a specific bogie from the consist
    public void removeBogie(String name) {
        // Find and remove by name
        boolean removed = trainConsist.removeIf(b -> b.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Detached: " + name);
        }
    }
    
    // READ: Check if a certain type of bogie is present
    public boolean hasBogieType(String name) {
        return trainConsist.stream()
                .anyMatch(b -> b.getName().equalsIgnoreCase(name));
    }
    
    // READ: Display the final consist summary
    public void printConsistSummary() {
        System.out.println("Current Train Formation: " + trainConsist);
        System.out.println("Total Bogie Count: " + trainConsist.size());
    }

}
