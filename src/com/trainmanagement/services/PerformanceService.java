package com.trainmanagement.services;
import java.util.*;
import com.trainmanagement.models.*;

public class PerformanceService {

	/**
     * Benchmarks filtering using a traditional for-each loop
     */
    public long benchmarkLoop(List<Bogie> dataset, int threshold) {
        long startTime = System.nanoTime(); // [cite: 1494]
        List<Bogie> result = new ArrayList<>();
        for (Bogie b : dataset) {
            if (b.getCapacity() > threshold) {
                result.add(b);
            }
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    
    /**
     * Benchmarks filtering using the Java Stream API
     */
    public long benchmarkStream(List<Bogie> dataset, int threshold) {
        long startTime = System.nanoTime();
        dataset.stream()
               .filter(b -> b.getCapacity() > threshold)
               .toList();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

}
