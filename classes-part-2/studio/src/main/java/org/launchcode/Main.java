package org.launchcode;
import java.util.Date;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Date today = new Date();
        ArrayList<MenuItem> restaurantMenu = new ArrayList<>();
        MenuItem test = new MenuItem(7.00, "good", "dessert", false);
        MenuItem test2 = new MenuItem(8.00, "delicious", "entree", true);
        Menu testMenu = new Menu(today, restaurantMenu);

        testMenu.addItem(today, test);
        testMenu.addItem(today, test2);
        testMenu.removeItem(test);

        System.out.println(testMenu.getItems().get(0).getDescription());

    }
}
