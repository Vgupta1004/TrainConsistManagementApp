# TrainConsistManagementApp
The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

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