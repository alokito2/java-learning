package operators;

import java.util.InputMismatchException;
import java.util.Scanner;

public class labexception5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		5. Write a program to demonstrate the use of multiple except blocks
//		by handling both ValueError and ZeroDivisionError in a single program.
		
		System.out.println("******Welcome*******");
		System.out.println("Please Enter Numerator :");
		try {
		int numerator = Integer.parseInt(sc.nextLine());
		System.out.println("Please Enter Denominator");
		int denominator = Integer.parseInt(sc.nextLine());
		int division = numerator/denominator;
		System.out.println(numerator+"/"+denominator+" = "+division);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}catch(NumberFormatException ne) {
			System.out.println("Please Enter Valid Number");
			ne.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}System.out.println("Thanks For Using App");
		
	}

}
