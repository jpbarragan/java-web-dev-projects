package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Menu {
    // initialize Fields: arraylist of menuitems & date field
    ArrayList<MenuItems> itemsInMenu = new ArrayList<>();



    // do we need a constructor? I think the default constructor is enough.

    // instance method to add items to the menu
    public void addItem (MenuItems item){
        itemsInMenu.add(item);
    }

    // instance method to remove items from the menu
    public void removeItem (MenuItems item) {
        itemsInMenu.removeAll(Collections.singleton(item));
    }

    // instance methods to include and print when was last updated
    //public void lastUpdate(int year, int month, int day){
      //  LocalDate date = new LocalDate.of(year, month, day);
    }

    // instance method to print the menu and if statement to say if an item is new
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

    // instance method to print item in menu
    public void printItemInMenu(MenuItems item){
        System.out.println("\nONE OF OUR BEST DISHES!");
        System.out.println(item.getName() + " - $" + item.getPrice());
        System.out.println("\t" + item.getCategory() + " - " + item.getDescription());
    }

    // equals method
    public boolean equals (Object toBeCompared){
        if (toBeCompared == this){
            return true;
        }

        if (toBeCompared == null){
            return false;
        }

        if (toBeCompared.getClass() != getClass()){
            return false;
        }

        // cast
        Menu theMenu = (Menu) toBeCompared;

        // compare them
       // return theMenu.size() == size();
    }

}
