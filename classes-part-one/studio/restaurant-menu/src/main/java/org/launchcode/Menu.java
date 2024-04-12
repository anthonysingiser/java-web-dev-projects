package org.launchcode;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    public ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
    private Date dateLastUpdated = Date();
    public MenuItem buildMenuItem () {
        Scanner input = new Scanner(System.in);
        System.out.println("Item price?");
        Double price = input.nextDouble();
        System.out.println("Description?");
        String description = input.next();
        System.out.println("Appetizer, Entree, or Dessert?");
        String category = input.next();

        return new MenuItem(price, description, category, false);
    }
}
