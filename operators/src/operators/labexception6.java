package operators;

import java.util.Scanner;

public class labexception6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		6. Create a program where a function raises a custom exception 
//		if a number is negative. Handle this exception in the main code.
		
		System.out.println("Enter the Positive Number ");
		try {
		int num = sc.nextInt();
		if(num < 0) {
			throw new NumberNegativeException("Number is Negative ");
			
		}else {
			System.out.println("You Enter "+num);
		}
		
		}catch(NumberNegativeException ne) {
			ne.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}System.out.println("Thanks For Using App");
		
	}

	
}
