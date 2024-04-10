package org.launchcode;

public class Main {
    public static void main(String[] args) {
        MenuItem test = new MenuItem(9.00, "delicious", "dessert", true);
        MenuItem test2 = new MenuItem(7.00, "wonderful", "dinner", false);
        System.out.println(test.dateCreated);
    }
}