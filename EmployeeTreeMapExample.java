package javaassignment4;

import java.util.*;

public class EmployeeTreeMapExample {
	    public static void main(String[] args) {
	        // Step 1: Create a TreeMap to store employee IDs and names
	        TreeMap<Integer, String> employeeMap = new TreeMap<>();

	        // Step 2: Add some employee IDs and names
	        employeeMap.put(102, "Alice");
	        employeeMap.put(101, "David");
	        employeeMap.put(104, "Bob");
	        employeeMap.put(103, "Charlie");

	        // Step 3: Extract names into a list
	        List<String> employeeNames = new ArrayList<>(employeeMap.values());

	        // Step 4: Sort the names alphabetically
	        Collections.sort(employeeNames);

	        // Step 5: Print names in alphabetical order
	        System.out.println("Employee Names in Alphabetical Order: ");
	        for (String name : employeeNames) {
	            System.out.println(name);
	        }
	    }
	}


