package com.Assignment2;

import java.util.ArrayList;
import java.util.List;

// Define the Payable interface
public interface Payable {
    double calculatePay(); // Abstract method
}

// Implementing the interface in an Employee class
 class Employee implements Payable {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }
}

// Implementing the interface in a Freelancer class
class Freelancer implements Payable {
    private double hourlyRate;
    private int hoursWorked;

    public Freelancer(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

// PayrollSystem class that stores Payable objects


class PayrollSystem {
    private List<Payable> employees = new ArrayList<>();

    public void addPayable(Payable payable) {
        employees.add(payable);
    }

    public double calculateTotalPayroll() {
        double total = 0;
        for (Payable employee : employees) {
            total += employee.calculatePay();
        }
        return total;
    }
}

// Using the interface
/*public class Main {
    public static void main(String[] args) {
        Payable employee1 = new Employee(5000);
        Payable freelancer1 = new Freelancer(50, 100); // 50 per hour for 100 hours

        PayrollSystem payroll = new PayrollSystem();
        payroll.addPayable(employee1);
        payroll.addPayable(freelancer1);

        System.out.println("Total payroll: $" + payroll.calculateTotalPayroll());
    }
}*/
