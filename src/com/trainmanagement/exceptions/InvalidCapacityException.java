package com.trainmanagement.exceptions;

/**
 * Custom checked exception for invalid bogie seating capacity.
 * Extending Exception makes this a checked exception.
 */
public class InvalidCapacityException extends Exception {

	public InvalidCapacityException(String message) {
		super(message);
	}

}
