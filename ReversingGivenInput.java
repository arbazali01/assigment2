package assignment2;
import java.util.*;

public class ReversingGivenInput {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int input = sc.nextInt();
		int reverse = 0;
		while(input > 0) {
			int lastDigit = input % 10;
			input /= 10;
			reverse = reverse * 10 + lastDigit;
		}
		System.out.println("Reverse of the given number is: " + reverse);
		
		
		
	}

}
