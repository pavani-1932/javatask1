package javaassignment2;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int n = sc.nextInt();
        sc.close(); 

        int currentNumber = 1; 

        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber);
                currentNumber++; 
            }
            System.out.println(); 
        }

	}

}
