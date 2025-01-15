package org.Lexicon.group54;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        menu();
       
    }


    // This method shows a menu to the user
    static void menu()
    {

        //variable declarations
        Scanner terminalInput = new Scanner(System.in);
        int choice;
        boolean exit = false;

        while (!exit)
        {
            // Printing user choice
            System.out.println();          //This line is only for formatting and make it easier to read
            System.out.println("Currency Converter");
            System.out.println("SEK to USD         : 1");
            System.out.println("USD to SEK         : 2");
            System.out.println("SEK to Euro        : 3");
            System.out.println("Euro to Sek        : 4");
            System.out.println("Exit: 5");
            System.out.println("Choose one of the following operation: ");
            choice = terminalInput.nextInt();

             //The following code checks user input and calls correct method
             if (choice < 1 || choice > 5){
                 System.out.println("Choose a selection between 1 - 5");
             }
             else if (choice == 1) {
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

    //This method shows date and day in a formatted way
    static void dayAndDate(){
        String formattedTime; // Variable that will contain the formatted time
        LocalTime timeNow = LocalTime.now();  // Gets current time form java.time

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" HH:mm:ss ");    // sets the format for how the time should be displayed
        formattedTime = timeNow.format(formatter);
        System.out.println(LocalDate.now() +" " +formattedTime);
    }

    //Method for exchanging SEK to EURO
    static void sekToUsd() {
        double rateSekToUsd =  0.09;
        Scanner terminalInput = new Scanner(System.in);
        System.out.println("How much Sek would you like to exchange: ");
        int num1 = terminalInput.nextInt();
        dayAndDate();
        System.out.println(num1 + " SEK is " + (num1 * rateSekToUsd) +" USD");
    }


    //Method for exchanging USD to SEK
    static void usdToSek() {
        double rateUsdToSek = 11.15;
        Scanner terminalInput = new Scanner(System.in);
        System.out.println("How much USD would you like to exchange");
        int num1 = terminalInput.nextInt();
        dayAndDate();
        System.out.println(num1 +" USD is " + (num1 * rateUsdToSek) +" SEK");
    }

    //Method for exchanging SEK to EURO
    static void sekToEuro() {
        double rateSekToEuro = 0.087;
        Scanner terminalInput = new Scanner(System.in);
        System.out.println("How much Sek would you like to exchange");
        int num1 = terminalInput.nextInt();
        dayAndDate();
        System.out.println(num1 +" Sek is " +(num1 * rateSekToEuro) + " Euro" );
    }


    //Method for exchanging Euro to SEK
    static void euroToSek() {
      double rateSekToEuro = 11.49;
      Scanner terminalInput = new Scanner(System.in);
      System.out.println("How much Sek would you like to exchange");
      int num1 = terminalInput.nextInt();
      dayAndDate();
      System.out.println(num1 +" Euro is " +(num1 * rateSekToEuro) + " SEK" );
    }

}