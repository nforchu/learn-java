package com.learnjava.assignment;

import com.learnjava.students.Drink;

import java.io.IOException;
import java.util.Scanner;

public class CoffeeMachine {

    Drink drink1  =  new Drink(1, "Hot cocoa", 1.2F);
    Drink drink2  =  new Drink(2, "Espresso", 2.2F);
    Drink drink3  =  new Drink(3, "Cappuccino", 3.2F);

    Drink [] drinks = {drink1, drink2, drink3};
    boolean running = true;

    public void start() {

        while (running) {
            this.run();
        }

    }

    private void run() {
        try {
            System.out.println("Welcome to Anderson coffee corner!!!!!");
            System.out.println("Please, pick an item from the menu.");
            for (Drink drink : drinks) {
                System.out.println(String.format("%s. %s %s", drink.id, drink.name, drink.price));
            }

            System.out.print("Enter your choice 1, 2 or 3. To exit enter 0: ");
            Scanner scanner = new Scanner(System.in);
            int exp = Integer.parseInt(scanner.nextLine());

            switch (exp) {
                case 1:
                    displayOrder("Here is is cup of Hot cocoa for you");
                    break;
                case 2:
                    displayOrder("Here is is cup of espresso for you");
                    break;
                case 3:
                    displayOrder("Here is is cup of Cappuccino for you");
                    break;
                case 0:
                    System.out.println("The coffee machine will now shutdown");
                    System.out.println("Bye............");
                    System.exit(0);
                    break;
                default:
                    System.out.println("**** Sorry we do not have an offer for that. Enter 1, 2 or 3 *****\n");
            }

        } catch (NumberFormatException ex) {
            //log the error
            System.out.println("=========================================================");
            System.out.println("Sorry, I can't understand your request. Please try again");
            System.out.println("=========================================================");
            run();
        }


    }

    public void displayOrder(String message){
        System.out.println(message);
        System.out.println("**************** Thanks for shopping with us ***************\n");
    }

}