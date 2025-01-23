package com.modelClass;

public class Calculator {
    private double result;

    //Constructor
    public Calculator()
    {
        this.result = 0.0;
    }

    // Add two numbers and return the result
    public double add(double num1, double num2)
    {
        result = num1 +num2;
        return result;
    }

    // Subtract two numbers and return the result
    public double subtract(double num1, double num2)
    {
        result = num1 - num2;
        return result;
    }

    // Multiply two numbers and return the result
    public double multiply(double num1, double num2)
    {
        result = num1 * num2;
        return result;
    }

    //Divide two numbers and return the result
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        result = num1 / num2;
        return result;
    }
}
