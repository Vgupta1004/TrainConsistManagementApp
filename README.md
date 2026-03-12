# TrainConsistManagementApp
The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

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