package org.launchcode;

public class MenuItems {
    // initialize Fields
    private String name;
    private double price;
    private String description;
    private String category;
    boolean novelty;

    // add Constructor

    public MenuItems(String name, double price, String description, String category, boolean novelty) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.novelty = novelty;
    }

    // add Overloaded Constructor with default false isNew
    public MenuItems(String name, double price, String description, String category){
        this(name, price, description, category, false);
    }

    // add Getters and Setters
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public boolean isNovelty() {
        return novelty;
    }

    // add Instance Methods

}
