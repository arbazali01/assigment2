package assignment2;

import java.util.Scanner;

public class CheckingWhetherPalindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {


		
        Scanner sc = new Scanner(System.in);
		
//..........................First Method............................
        
		System.out.println("Enter the Word here...");
		String input1 = sc.nextLine();
		boolean isPallindrome = true;
		input1 = input1.toLowerCase();
		
		int na = input1.length();
		for(int i=0; i<na; i++) {
			
			if(input1.charAt(i) != input1.charAt(na-i-1)) {
				isPallindrome = false;
				break;
			}
			
		}
		
		if(isPallindrome) {
			System.out.println("Given word is Pallindrome");
		}else {
			System.out.println("Given word is not a Pallindrome");
		}
		
		
		
		
	
//..........................Second Method............................
	
		
		
		
		System.out.println("Enter the word here...");
		String input2 = sc.nextLine();
		input2 = input2.toLowerCase();
		int nb = input2.length();
		
		String reverseInput = "";
		
		for(int i=nb-1; i>=0; i--) {
			reverseInput = reverseInput + input2.charAt(i);
		}
		
		
		if(input2.equals(reverseInput)) {
			System.out.println("Given word is palindrome");
		}else {
			System.out.println("Given word is not a palindrome");
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
