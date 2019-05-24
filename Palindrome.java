package ws1;
import java.util.Scanner;

public class Palindrome{
	
	public static String reverseInput(String input) {
		Stack stack = new Stack(100);
		
		String tempStr = "";
		
		for(int i=0; i<input.length();i++) {
			stack.push(input.charAt(i));	
		}
		
		while (!stack.isEmpty()){
			tempStr = tempStr + stack.pop();
		}
		
		return tempStr;		
	}
	
	public static void checkPalindrome(String str){
		String reversedInput = reverseInput(str);
				
	  if(reversedInput.equals(str)) 
		  System.out.println( str + " is a palindrome.");	  
	  
	  else
		  System.out.println( str + " is not a palindrome.");
	}

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Please enter your string or number:");		 
		 String input = scanner.nextLine();		 
		 checkPalindrome(input);		
	}
}



