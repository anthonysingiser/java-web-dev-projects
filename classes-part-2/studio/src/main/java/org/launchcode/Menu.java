package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem(Date d, MenuItem tempItem) {
        if (!items.contains(tempItem)) {
            items.add(tempItem);
            setLastUpdated(d);
        } else {
            System.out.println("Warning: Item already exists in the menu.");
        }
    }
    public void removeItem(MenuItem tempItem){
        items.remove(tempItem);
    }

    public void printMenu() {
        for (MenuItem item : items) {
            System.out.println(item);
        }
    }

    public void printMenuItem(MenuItem item) {
        System.out.println(item);
    }


}