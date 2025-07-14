package javaassignment4;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayExample {

	
	public static void main(String[] args) {
        // Create a List of Strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Display the List
        System.out.println("List: " + fruits);

        // Convert List to Array
        String[] fruitsArray = fruits.toArray(new String[0]);

        // Display the Array
        System.out.print("Array: ");
        for (String fruit : fruitsArray) {
            System.out.print(fruit +" ");
        }
    }
}

