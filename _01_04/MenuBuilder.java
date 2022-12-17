package _01_04;

import java.util.ArrayList;

import java.util.HashMap; 
/**
 * JC 171222
 */
public class MenuBuilder {
  public static void main(String[] args) {

    // Create a variable called menuTitle of type String and assign it the value "My
    // Dream Menu:".
    String menuTitle = "My Dream Menu:";

    // Print the menuTitle variable to the console.
    System.out.println(menuTitle);

    // Create a variable called menu of type ArrayList.
    HashMap<String, String> menu = new HashMap<String, String>();

    // Create a variable called starter of type MenuItem and pass in the name of
    // your favourite starter.
    menu.put("Starter", "Pakora");


    // Create a variable called mainCourse of type MenuItem and pass in the name of
    // your favourite main course.
    menu.put("Main", "Chicken Dhansak");

    // Create a variable called dessert of type MenuItem and pass in the name of
    // your favourite dessert.
    menu.put("Dessert", "Chocolate IceCream");

    // Print the menu variable to the console.
      System.out.println(menu);
  }
}
