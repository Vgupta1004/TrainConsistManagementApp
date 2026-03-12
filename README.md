# TrainConsistManagementApp
The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

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