package javaassignment2;

public class MirrorImagePattern {

	public static void main(String[] args) {
		
		 int rows = 5;
	        int cols = 5;

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= cols; j++) {
	                // Print * based on pattern positions
	                if ((i ==1 || i == 5) && (j == 1 || j == 5)) {
	                    System.out.print("*");
	                }else if((i==2||i==4)&&(j==2||j==4)){
	                	System.out.print("*");
	                }
	                else if (i == 3 && j == 3) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // Move to next line
	        }

	}

}
