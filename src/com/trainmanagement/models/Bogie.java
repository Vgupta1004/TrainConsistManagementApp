package com.trainmanagement.models;
import com.trainmanagement.exceptions.*;

public class Bogie {

	private String id;
    private String name;
    private int capacity;

    public Bogie(String id, String name, int capacity) throws InvalidCapacityException {
    	if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero. Provided: " + capacity); // [cite: 1618]
        }
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }
    
    public String getId() { return id; }
    public String getName() { return name; }
    public int getCapacity() { return capacity; }

    @Override
    public String toString() {
        return String.format("Bogie[ID=%s, Name=%s, Capacity=%d]", id, name, capacity);
    }

}
