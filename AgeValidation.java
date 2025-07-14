package javaassignment4;



import java.util.Scanner;

public class AgeValidation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Age");
		
		int age= sc.nextInt();
		
		try {
			if(age<18)
			{
				
			throw new InvalidAgeException("Invalid age! Age must be 18 or above:");
			}
			else {
				
	                System.out.println("You are eligible! Age entered: " + age);
			}
			}catch(InvalidAgeException ie) {
				
				System.out.println("Error: " + ie.getMessage());
				
			}finally {
				sc.close();
			}
			
		}
	}		