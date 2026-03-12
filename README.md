# TrainConsistManagementApp
The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

## Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
### Description
The goal is to Prevent invalid passenger bogies from being added to the train by enforcing capacity rules using a custom exception.

The flow -
 - User attempts to create a passenger bogie.
 - System validates the capacity value.
 - If capacity ≤ 0, a custom exception is thrown.
 - If capacity is valid, the bogie is created successfully
 - System continues execution safely.