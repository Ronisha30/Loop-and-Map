import java.util.HashMap;
import java.util.Scanner;

public class carHashMap { public static void main(String args[]) { 
    //our sample map 
    HashMap<String, String> cars = new HashMap<String, String>() { 
        { 
            put("Toyota", "Premio"); 
            put("Nissan", "Avensis"); 
            put("Honda", "Civic");
            put("Isuzu", "Dmax");
        } 
    }; 
    // user input car model
    Scanner scnr = new Scanner(System.in); 
    System.out.println("Please enter the car model?"); 
    String key = scnr.nextLine(); 
    // checking if car model exists in HashMap 
    if (cars.containsKey(key)) { 
        System.out.println("Oh, you're looking for a "+ key+ " ? Our " + cars.get(key)+ " selection is right over here..."); 
    //if car model does not exist in HashMap
    } else { 
        System.out.println("Sorry, "+ key +" is not available at this moment, try another model"); 
    } 
    //close scanner to prevent resource leakage
    scnr.close(); 
} }