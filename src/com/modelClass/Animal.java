package com.modelClass;

abstract class Animal {
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method for the sound that an animal makes
    public abstract String sound();
}
class Dog extends Animal{
    // Constructor
    public Dog (String name, int age ){
        super(name, age);
    }
    // Implementation of the abstract method
    @Override
    public String sound() {
        return "Bark";
    }
}

class Cat extends Animal {

    // Constructor
    public Cat(String name, int age) {
        super(name, age);
    }

    // Implementation of the abstract method
    @Override
    public String sound() {
        return "Meow";
    }
}