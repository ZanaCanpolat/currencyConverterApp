package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable declarations
        Scanner terminalInput = new Scanner(System.in);
        int choice;
        boolean exit = false;


        while (!exit) {

            // Printing user choice
            System.out.println("Currency Converter");
            System.out.println("Addition        + : 1");
            System.out.println("Subtraction     - : 2");
            System.out.println("Multiplication  * : 3");
            System.out.println("Division        / : 4");
            System.out.println("Exit: 5");
            System.out.println("Choose one of the following operation: ");
            choice = terminalInput.nextInt();

            //The following code checks user input and calls correct method
            if (choice == 1) {
                System.out.println("Addition: ");
                addition();
            } else if (choice == 2) {
                System.out.println("Subtraction: ");
                subtraction();
            } else if (choice == 3) {
                System.out.println("Multiplication: ");
                multiplication();
            } else if (choice == 4) {
                System.out.println("Division: ");
                division();
            } else {
                System.out.println("Closing calculator! ");
                exit = true;

            }
        }
    }

    //Method for addition takes two integer and adds
    static void addition() {
        Scanner terminalInput = new Scanner(System.in); //Check if it is possible to declare global so that we can remove this line of code
        System.out.println("Enter two numbers");
        int num1 = terminalInput.nextInt();
        int num2 = terminalInput.nextInt();
        System.out.println("Result: " + (num1 + num2));
    }

    // Method for subtraction, takes two integer and subracts
    static void subtraction() {
        Scanner terminalInput = new Scanner(System.in); //Check if it is possible to declare global so that we can remove this line of code
        System.out.println("Enter two numbers");
        int num1 = terminalInput.nextInt();
        int num2 = terminalInput.nextInt();
        System.out.println("Result: " + (num1 - num2));
    }

    // Method for multiplication takes two integer and multiply
    static void multiplication() {
        Scanner terminalInput = new Scanner(System.in); //Check if it is possible to declare global so that we can remove this line of code
        System.out.println("Enter two numbers");
        int num1 = terminalInput.nextInt();
        int num2 = terminalInput.nextInt();
        System.out.println("Result: " + (num1 * num2));
    }

    // Method for division takes two integer and devides
    static void division() {
        Scanner terminalInput = new Scanner(System.in); //Check if it is possible to declare global so that we can remove this line of code
        System.out.println("Enter two numbers");
        int num1 = terminalInput.nextInt();
        int num2 = terminalInput.nextInt();
        System.out.println("Result: " + (num1 / num2));
    }

}