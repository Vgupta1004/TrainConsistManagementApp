# TrainConsistManagementApp
The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

## Use Case 20: Exception Handling During Search Operations
### Description
The goal is to Prevent search operations on an empty train by throwing an exception early.

The flow -
 - User triggers a search operation.
 - System checks whether the bogie collection is empty.
 - If no bogies are available, the system throws an IllegalStateException.
 - The operation stops immediately.
 - User receives a meaningful error message.