package com.trainmanagement.models;
import com.trainmanagement.exceptions.CargoSafetyException;

/**
 * Represents a goods-specific bogie with shape and cargo attributes.
 */

public class GoodsBogie {

	private String id;
    private String shape; 
    private String currentCargo;

    public GoodsBogie(String id, String shape) {
        this.id = id;
        this.shape = shape;
    }
    
    /**
     * Logic for safe cargo assignment.
     * Throws CargoSafetyException if the shape/cargo combination is hazardous.
     */
    public void assignCargo(String cargo) {
        // Business Rule: Rectangular bogies cannot carry Petroleum
        if (this.shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
            throw new CargoSafetyException("Hazard Alert: Rectangular bogies cannot carry Petroleum!");
        }
        this.currentCargo = cargo;
        System.out.println("Cargo successfully assigned: " + cargo + " to " + id);
    }
    
    public String getShape() { return shape; }
    public String getCargo() { return currentCargo; }
    public String getId() { return id; }

    @Override
    public String toString() {
        return String.format("Bogie[%s]: %s -> %s", id, shape, currentCargo);
    }

}
