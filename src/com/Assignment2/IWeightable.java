package com.Assignment2;

import java.util.ArrayList;
import java.util.List;

// Define the interface
public interface IWeightable {
    double getWeight(); // Abstract method
}

// Implementing the interface in a Cargo class
class Cargo implements IWeightable {
    private double weight;

    public Cargo(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}

// Implementing the interface in a Person class
 class Person implements IWeightable {
    private double weight;

    public Person(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}

// Implementing the interface in a Luggage class
 class Luggage implements IWeightable {
    private double weight;

    public Luggage(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}

// Airplane class that stores IWeightable objects



 class Airplane {
    private List<IWeightable> weightables = new ArrayList<>();

    public void addWeightable(IWeightable item) {
        weightables.add(item);
    }

    public double getTotalWeight() {
        double total = 0;
        for (IWeightable item : weightables) {
            total += item.getWeight();
        }
        return total;
    }
}

// Using the interface
/*class Main {
    public static void main(String[] args) {
        IWeightable cargo = new Cargo(500);
        IWeightable person = new Person(80);
        IWeightable luggage = new Luggage(30);

        Airplane airplane = new Airplane();
        airplane.addWeightable(cargo);
        airplane.addWeightable(person);
        airplane.addWeightable(luggage);

        System.out.println("Total weight on airplane: " + airplane.getTotalWeight() + " kg");
    }
}*/
