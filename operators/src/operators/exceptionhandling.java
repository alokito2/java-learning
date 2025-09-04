package operators;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionhandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		
		int c = a/b;
		System.out.println(c);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(InputMismatchException ie) {
			System.out.println(ie.getMessage());
		}catch(Exception e) {
			e.getStackTrace();
		}
		System.out.println("thank you for using");
		}
		
		
	}


