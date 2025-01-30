package com.practice;

public class Employee {

        protected String name;
        protected double salary;

        // Constructor
        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        // Method to get details
        public String getDetails() {
            return "Name: " + name + ", Salary: $" + salary;
        }
    }

    // Subclass: Manager
    class Manager extends Employee {
        private int teamSize;

        // Constructor
        public Manager(String name, double salary, int teamSize) {
            super(name, salary); // Call the base class constructor
            this.teamSize = teamSize;
        }

        // Override getDetails to include team size
        @Override
        public String getDetails() {
            return super.getDetails() + ", Team Size: " + teamSize;
        }
    }

    // Subclass: Intern
    class Intern extends Employee {
        private String universityName;

        // Constructor
        public Intern(String name, double salary, String universityName) {
            super(name, salary); // Call the base class constructor
            this.universityName = universityName;
        }

        // Override getDetails to include university name
        @Override
        public String getDetails() {
            return super.getDetails() + ", University: " + universityName;
        }
    }




