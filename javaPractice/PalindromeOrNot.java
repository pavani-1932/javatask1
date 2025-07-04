package javaassignment2;

public class PalindromeOrNot {

	public static void main(String[] args) {
		 String str = "madam";  
	        boolean isPalindrome = true;

	        int length = str.length();

	        for (int i = 0; i < length / 2; i++) {
	            
	            if (str.charAt(i) != str.charAt(length - 1 - i)) {
	                isPalindrome = false;
	                break;
	            }
	        }

	        if (isPalindrome) {
	            System.out.println(str + " is a palindrome.");
	        } else {
	            System.out.println(str + " is not a palindrome.");
	        }

	}

}
