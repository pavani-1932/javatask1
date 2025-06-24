package javaPractice;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	        
	        System.out.print("Enter your age: ");

	     
	        int age = input.nextInt();

	        
	        if (age >= 60) {
	            System.out.println("You are a Senior Citizen.");
	        } else {
	            System.out.println("You are not a Senior Citizen.");
	        }

	        
	        input.close();

	}

}
