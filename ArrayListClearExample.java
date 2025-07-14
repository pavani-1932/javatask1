package javaassignment4;

import java.util.ArrayList;

public class ArrayListClearExample {
	
	
	    public static void main(String[] args) {
	        // Step 1: Create an ArrayList of Strings
	        ArrayList<String> fruits = new ArrayList<>();

	        // Step 2: Add elements to the list
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        fruits.add("Mango");

	        // Step 3: Display the original list
	        System.out.println("Original List: " + fruits);

	        // Step 4: Remove all elements from the list
	        fruits.clear();

	        // Step 5: Display the list after clearing
	        System.out.println("List after removing all elements: " + fruits);
	    }
	}


