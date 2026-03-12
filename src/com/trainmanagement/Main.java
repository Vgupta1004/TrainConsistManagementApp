package com.trainmanagement;
import java.util.*;
import com.trainmanagement.models.*;
import com.trainmanagement.services.*;

/**
 * Use Case 13: Performance Comparison.
 * This service benchmarks high-resolution execution time to compare 
 * imperative loops and declarative streams
 *
 * @author Developer
 * @version 13.0
 */

public class Main {

	public static void main(String args[]) {
		System.out.println("---------------------------------------");
		System.out.println("Train Consist Management App");
		System.out.println("---------------------------------------");
		
System.out.println("=== UC13: Performance Benchmarking (Loops vs Streams) ===");
        
        // 1. Create a large test dataset (10,000 bogies)
        List<Bogie> testData = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            testData.add(new Bogie("ID-" + i, "Sleeper", (int)(Math.random() * 100)));
        }

        PerformanceService perfService = new PerformanceService();
        int threshold = 50;

        // 2. Measure Loop Performance
        long loopTime = perfService.benchmarkLoop(testData, threshold);
        System.out.println("Loop Execution Time (ns): " + loopTime);

        // 3. Measure Stream Performance
        long streamTime = perfService.benchmarkStream(testData, threshold);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        // 4. Comparison Summary
        System.out.println("\nPerformance Insight:");
        if (loopTime < streamTime) {
            System.out.println("Result: Traditional loop was faster for this dataset.");
        } else {
            System.out.println("Result: Stream API was faster for this dataset.");
        }
        
        System.out.println("UC13 benchmarking completed.");
        
	}

}
