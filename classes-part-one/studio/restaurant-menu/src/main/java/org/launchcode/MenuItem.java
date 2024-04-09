package org.launchcode;

public class MenuItem {
    private Double price = 0.00;
    private String description = "";
    private String category = "";
    private Boolean isNew = false;

    public String testMethod() {
        return "hello";
    }

    public MenuItem(Double price, String description, String category, Boolean isNew){
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

}
