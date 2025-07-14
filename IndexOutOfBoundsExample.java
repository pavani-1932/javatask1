package javaassignment4;

public class IndexOutOfBoundsExample {
	
	
	    public static void main(String[] args) {
	        // Example 1: ArrayIndexOutOfBoundsException
	        try {
	            int[] numbers = {10, 20, 30};
	            System.out.println("Accessing index 5 of array: " + numbers[5]); // Invalid index
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
	        }

	        // Example 2: StringIndexOutOfBoundsException
	        try {
	            String text = "Hello";
	            System.out.println("Accessing char at index 10: " + text.charAt(10)); // Invalid index
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
	        }
	    }
	}


