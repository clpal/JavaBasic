package basicProgram;

import java.util.Stack;

public class PalindromeTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String inputString="aabbaa";
		String reverseString="";
		Stack stack= new Stack();
		int length=inputString.length();
		

	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverseString = reverseString + inputString.charAt(i);

	      if (inputString.equals(reverseString))
	         System.out.println("Input string is a palindrome.");
	      else
	         System.out.println("Input string is not a palindrome.");
	}

}
