package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        Date today = new Date();
        ArrayList<MenuItem> restaurantMenu = new ArrayList<>();
        MenuItem test = new MenuItem(7.00, "good", "dessert", false);
        MenuItem test2 = new MenuItem(8.00, "delicious", "entree", true);
        Menu testMenu = new Menu(today, restaurantMenu);

        // Add items to the menu
        testMenu.addItem(today, test);
        testMenu.addItem(today, test2);

        // Attempt to add a duplicate item
        testMenu.addItem(today, test); // This should print a warning message

        // Print the entire menu
        System.out.println("Printing the entire menu:");
        testMenu.printMenu();

        // Print a single menu item
        System.out.println("Printing a single menu item:");
        testMenu.printMenuItem(test2);

        // Remove an item from the menu
        testMenu.removeItem(test);

        // Print the menu after removing an item
        System.out.println("Printing the menu after removing an item:");
        testMenu.printMenu();

        // Check if an item is new
        System.out.println("Checking if an item is new:");
        System.out.println(test2.isNewItem());

        // Check the last updated date of the menu
        System.out.println("Checking the last updated date of the menu:");
        System.out.println(testMenu.getLastUpdated());
    }
}
