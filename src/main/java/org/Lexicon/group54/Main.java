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
            System.out.println("SEK to USD         : 1");
            System.out.println("USD to SEK         : 2");
            System.out.println("SEK to Euro        : 3");
            System.out.println("Euro to Sek        : 4");
            System.out.println("Exit: 5");
            System.out.println("Choose one of the following operation: ");
            choice = terminalInput.nextInt();

            //The following code checks user input and calls correct method
            if (choice == 1) {
                System.out.println("SEK to USD: ");
                sekToUsd();
            } else if (choice == 2) {
                System.out.println("USD to SEK: ");
                usdToSek();
            } else if (choice == 3) {
                System.out.println("SEK to EURO: ");
                sekToEuro();
            } else if (choice == 4) {
                System.out.println("EURO to SEK: ");
                euroToSek();
            } else {
                System.out.println("Quitting Currency Converter! ");
                exit = true;

            }
        }
    }

    //Method for addition takes two integer and adds
    static void sekToUsd() {
        Scanner terminalInput = new Scanner(System.in); //Check if it is possible to declare global so that we can remove this line of code
        System.out.println("Enter two numbers");
        int num1 = terminalInput.nextInt();
        int num2 = terminalInput.nextInt();
        System.out.println("Result: " + (num1 + num2));
    }

    // Method for subtraction, takes two integer and subracts
    static void usdToSek() {
        Scanner terminalInput = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = terminalInput.nextInt();
        int num2 = terminalInput.nextInt();
        System.out.println("Result: " + (num1 - num2));
    }

    // Method for multiplication takes two integer and multiply
    static void sekToEuro() {
        Scanner terminalInput = new Scanner(System.in); //Check if it is possible to declare global so that we can remove this line of code
        System.out.println("Enter two numbers");
        int num1 = terminalInput.nextInt();
        int num2 = terminalInput.nextInt();
        System.out.println("Result: " + (num1 * num2));
    }

    // Method for division takes two integer and devides
    static void euroToSek() {
        Scanner terminalInput = new Scanner(System.in); //Check if it is possible to declare global so that we can remove this line of code
        System.out.println("Enter two numbers");
        int num1 = terminalInput.nextInt();
        int num2 = terminalInput.nextInt();
        System.out.println("Result: " + (num1 / num2));
    }

}