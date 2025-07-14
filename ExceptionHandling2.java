package javaassignment4;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number");
		int a= sc.nextInt();
		System.out.println("Enter the Second Number");
		int b= sc.nextInt();
		int c = a/b;
		
		System.out.println(c);
		
		}
		catch(Exception e) {
			
			System.out.println("Arithmetic Exception occurs when devided by Zero" + e.getMessage());
		}
		

	}

}
