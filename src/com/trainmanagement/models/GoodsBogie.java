package com.trainmanagement.models;

/**
 * Represents a goods-specific bogie with shape and cargo attributes.
 */

public class GoodsBogie {

	private String id;
    private String shape; 
    private String cargo;

    public GoodsBogie(String id, String shape, String cargo) {
        this.id = id;
        this.shape = shape;
        this.cargo = cargo;
    }
    
    public String getShape() { return shape; }
    public String getCargo() { return cargo; }
    public String getId() { return id; }

    @Override
    public String toString() {
        return String.format("Bogie[%s]: %s -> %s", id, shape, cargo);
    }

}
