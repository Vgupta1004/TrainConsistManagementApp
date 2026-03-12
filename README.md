# TrainConsistManagementApp
The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

## Use Case 1:Initialize Train and Display Consist Summary
### Description
The goal is to Initialize the Train Consist Management App and display the initial state of the train.
The flow -
 - User runs the program
 - Application prints welcome message
 - Train consist is initialize
 - The initial bogie count is displayed
 - Program continues.

## Use Case 2: Add Passenger Bogies to Train (ArrayList Operations)
### Description
The goal is to Allow dynamic insertion and removal of passenger bogies using ArrayList.
The flow -
 - User runs the program
 - Passenger bogies are added
 - Bogies are displayed
 - A bogie is removed
 - Existence is checked
 - Program continues

## Use Case 3: Track Unique Bogie IDs (Set – HashSet)
### Description
The goal is to Ensure no duplicate bogie IDs are added to the train.
The flow -
 - User adds bogie IDs
 - System inserts into HashSet
 - Duplicates are ignored
 - Unique IDs are displayed.

## Use Case 4: Maintain Ordered Bogie IDs (TreeSet & SortedSet)
### Description
The goal is to Ensure no duplicate bogie IDs are added to the train.
The flow -
 - User adds bogie IDs
 - System inserts into HashSet
 - Duplicates are ignored
 - Unique IDs are displayed.

## Use Case 5: Preserve Insertion Order of Bogies (LinkedHashSet)
### Description
The goal is to Maintain insertion order while enforcing uniqueness.
The flow -
 - User adds bogies
 - LinkedHashSet stores them
 - Formation is printed in original order

## Use Case 6: Map Bogie to Capacity (HashMap)
### Description
The goal is to Associate each bogie with its seating or load capacity using a key–value mapping structure.
The flow -
 - User creates a bogie-capacity mapping.
 - System stores bogie names as keys and capacities as values.
 - Entries are inserted into a HashMap.
 - System iterates through the map.
 - Capacity details are displayed for each bogie.
 - Program continues.

## Use Case 7: Sort Bogies by Capacity (Comparator)
### Description
The goal is to Sort passenger bogies based on their seating capacity using a custom Comparator.
The flow -
 - User creates passenger bogie objects.
 - Bogies are stored in a List.
 - The system applies a Comparator to sort by capacity.
 - Sorted bogies are displayed in order.
 - Program continues.

## Use Case 8: Filter Passenger Bogies Using Streams
### Description
The goal is to Filter passenger bogies using Stream pipelines based on seating capacity.
The flow -
 - User creates a list of bogies.
 - The system converts the list into a stream.
 - filter() is applied with a condition.
 - Matching bogies are collected into a new list.
 - Filtered bogies are displayed.
 - Program continues.

## Use Case 9: Group Bogies by Type (Collectors.groupingBy)
### Description
The goal is to Group bogies into categories using Stream collectors.
The flow -
 - User creates a list of bogies.
 - System converts the list into a stream.
 - groupingBy() collector is applied.
 - Bogies are grouped into a Map.
 - Grouped result is displayed.
 - Program continues.

## Use Case 10: Count Total Seats in Train (reduce)
### Description
The goal is to Aggregate seating capacities into a single total value using Stream reduction.
The flow -
 - User creates a list of bogies.
 - System converts the list into a stream
 - map() extracts capacity values
 - reduce() sums the capacities.
 - Total seating capacity is displayed.
 - Program continues.

## Use Case 11: Validate Train ID & Cargo Codes (Regex)
### Description
The goal is to Validate Train ID and Cargo Code formats using Regular Expressions.
The flow -
 - The user enters the Train ID and Cargo Code.
 - System compiles a regex pattern.
 - Matcher checks input against the pattern.
 - If the format matches, input is accepted.
 - If not, validation fails, and an error message is shown.
 - Program continues.

## Use Case 12: Safety Compliance Check for Goods Bogies
### Description
The goal is to Encapsulate bogie rules using functional interfaces and apply them using lambda expressions.

The flow -
 - User prepares a list of goods bogies.
 - System converts the list into a stream.
 - allMatch() checks every bogie against safety rules.
 - Conditional logic verifies cylindrical bogie cargo.
 - If all checks pass, the train is marked safe.
 - Result is displayed to the user.
 - Program continues.

## Use Case 13: Performance Comparison (Loops vs Streams)
### Description
The goal is to Compare performance of loop-based logic versus stream-based logic using time measurement.

The flow -
 - User prepares a collection of bogies.
 - System records start time using System.nanoTime().
 - Filtering is performed using a loop or stream.
 - System records end time.
 - Elapsed time is calculated.
 - Execution time is displayed.
 - Program continues.

## Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
### Description
The goal is to Prevent invalid passenger bogies from being added to the train by enforcing capacity rules using a custom exception.

The flow -
 - User attempts to create a passenger bogie.
 - System validates the capacity value.
 - If capacity ≤ 0, a custom exception is thrown.
 - If capacity is valid, the bogie is created successfully
 - System continues execution safely.

## Use Case 15: Safe Cargo Assignment Using try-catch-finally
### Description
The goal is to Safely handle unsafe cargo assignments without crashing the Train Consist Management App.

The flow -
 - User attempts to assign cargo to a goods bogie.
 - System checks shape and cargo compatibility.
 - If unsafe, an exception is thrown.
 - Exception is caught in the catch block.
 - An error message is displayed.
 - finally block executes cleanup or logging.
 - Program continues safely.

## Use Case 16: Sort Passenger Bogies by Capacity (Bubble Sort – Algorithm Intro)
### Description
The goal is to Sort passenger bogie capacities using a basic algorithm (Bubble Sort) instead of library methods.

The flow -
 - User provides passenger bogie capacities.
 - System iterates through the array.
 - Adjacent values are compared.
 - If out of order, values are swapped.
 - Multiple passes continue until sorted.
 - Sorted result is displayed.
 - Program continues.

## Use Case 17: Sort Bogie Names Using Arrays.sort()
### Description
The goal is to Sort bogie type names alphabetically using Java’s built-in Arrays.sort() method.

The flow -
 - User provides bogie type names.
 - System calls Arrays.sort() on the array.
 - Java internally sorts the values.
 - Sorted bogie names are displayed.
 - Program continues.

## Use Case 18: Linear Search for Bogie ID (Array-Based Searching)
### Description
The goal is to Search and identify a specific bogie ID from an unsorted list using Linear Search.

The flow -
 - User provides a list of bogie IDs.
 - User provides a search key.
 - System traverses the array sequentially.
 - Each element is compared with the search key.
 - If match found, search stops.
 - Result is displayed.
 - Program continues.

## Use Case 19: Binary Search for Bogie ID (Optimized Searching)
### Description
The goal is to Find a bogie ID efficiently using binary search on sorted data.

The flow -
 - User provides sorted bogie IDs.
 - User provides a search key.
 - System initializes low and high indexes.
 - System finds the middle index.
 - Key is compared with middle value.
 - Search range is halved.
 - Steps repeat until found or exhausted.
 - Result is displayed.
 - Program continues.

## Use Case 20: Exception Handling During Search Operations
### Description
The goal is to Prevent search operations on an empty train by throwing an exception early.

The flow -
 - User triggers a search operation.
 - System checks whether the bogie collection is empty.
 - If no bogies are available, the system throws an IllegalStateException.
 - The operation stops immediately.
 - User receives a meaningful error message.
