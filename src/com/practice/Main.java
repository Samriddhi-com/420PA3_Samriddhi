package com.practice;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = getValidatedInt( scanner, "Enter an int:" , "Error  not valid" , 0, 10);
        int option = getValidatedInt( scanner, "Enter an int:" , "Error  not valid" , 0, 10);
        scanner.close();

    }
    public static int getValidatedInt(Scanner scanner, String prompt, String errorMessage, int min, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.println("Error: " + errorMessage);
                }
            } else {
                System.out.println("Error: " + errorMessage);
                scanner.next(); // Consume invalid input
            }
        }
    }
}