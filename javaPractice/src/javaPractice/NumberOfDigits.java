package javaPractice;

public class NumberOfDigits {

	public static void main(String[] args) {
		
		  int count = 0, num = 123456;

		    while (num != 0) {
		      
		      num /= 10;
		      ++count;
		    }

		    System.out.println("Number of digits: " + count);

	}

}
