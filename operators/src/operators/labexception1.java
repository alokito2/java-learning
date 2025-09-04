package operators;

import java.util.Scanner;

public class labexception1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******Welcome*******");
		System.out.println("Please Enter Numerator :");
		try {
		int numerator = sc.nextInt();
		System.out.println("Please Enter Denominator");
		int denominator = sc.nextInt();
		int division = numerator/denominator;
		System.out.println(numerator+"/"+denominator+" = "+division);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thanks For Using Our App ");
	}

}
