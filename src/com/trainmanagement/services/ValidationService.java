package com.trainmanagement.services;

import java.util.regex.Pattern;

public class ValidationService {

	private static final String TRAIN_ID_REGEX = "^TRN-\\d{4}$";
	private static final String CARGO_CODE_REGEX = "^PET-[A-Z]{2}$";
	
	/**
     * Validates the Train ID format.
     */
	public static boolean isValidTrainId(String trainId) {
        return Pattern.matches(TRAIN_ID_REGEX, trainId);
    }
	
	/**
     * Validates the Cargo Code format.
     */
    public static boolean isValidCargoCode(String cargoCode) {
        return Pattern.matches(CARGO_CODE_REGEX, cargoCode);
    }

}
