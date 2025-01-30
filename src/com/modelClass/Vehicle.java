package com.modelClass;

public class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    // Method to get a description of the vehicle
    public String getDescription() {
        return year + " " + make + " " + model;
    }
}

class CarV extends Vehicle {
    private  int numberOfDoors;

    // Constructor
    public CarV(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Override getDescription to include number of doors
    @Override
    public String getDescription() {
        return super.getDescription() + " with " + numberOfDoors + " doors";
    }
}
class Truck extends Vehicle {
    private final double payloadCapacity;

    // Constructor
    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    // Override getDescription to include payload capacity
    @Override
    public String getDescription() {
        return super.getDescription() + " with a payload capacity of " + payloadCapacity + " tons";
    }
}

