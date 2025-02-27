package org.launchcode;

public class Main {

    public static void main(String[] args) {
	    // instantiate a menu object called menu1
        Menu menu1 = new Menu();

        // instantiate several menu items
        MenuItems appetizer1 = new MenuItems("Nachos", 10.99, "New-Mexico syle nachos with all the fixings", "appetizer");
        MenuItems main1 = new MenuItems("Teriyaki Salmon", 20.99, "Teriyaki glazed salmon filet", "main", true);
        MenuItems dessert1 = new MenuItems("Tres leches", 8.99, "Three layered cake", "dessert");

        // add items to menu
        menu1.addItem(appetizer1);
        menu1.addItem(main1);
        menu1.addItem(dessert1);

        // add last update date to menu

        // print menu
        menu1.printMenu();

        // remove items from menu
        menu1.removeItem(appetizer1);

        // print menu with removed item
        menu1.printMenu();

        // print item in menu
        menu1.printItemInMenu(main1);

        // call Last Update
        //menu1.lastUpdate();

        // call equal method

    }
}
