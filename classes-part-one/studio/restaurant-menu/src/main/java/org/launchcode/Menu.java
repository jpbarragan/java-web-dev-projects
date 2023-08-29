package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    // initialize Fields: arraylist of menuitems & date field
    ArrayList<MenuItems> itemsInMenu = new ArrayList<>();

    Date date = new Date();


    // do we need a constructor? I think the default constructor is enough.

    // instance method to add items to the menu
    public void addItem (MenuItems item){
        itemsInMenu.add(item);
    }
    // instance method to explain whan was last updated
    public void lastUpdate(){
        System.out.println("Menu was last updated on " +date);
    }

    // instance method to pring the menu
    public void printMenu(){
        System.out.println("\nMENU");
        for (MenuItems item : itemsInMenu){
            System.out.println(item.getName() + " - $" + item.getPrice());
            System.out.println("\t" + item.getCategory() + " - " + item.getDescription());
            if (item.isNovelty()){
                System.out.println("\t New!");
            }
        }
    }
}
