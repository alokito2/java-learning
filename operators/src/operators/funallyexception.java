package operators;

import java.util.InputMismatchException;
import java.util.Scanner;

public class funallyexception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1.  Write a program that takes two numbers as input and performs
//	    division. Handle the case when the denominator is zero using
//	    exception handling.
		
		System.out.println("Enter the numerator : ");
		try {
		int nume = sc.nextInt();
		System.out.println("Enter the Denominator");
		int deno = sc.nextInt();
		int c = nume/deno;
		System.out.println(nume+"/"+deno+" = "+c);
		}catch(InputMismatchException ie) {
			ie.printStackTrace();
			System.out.println("please enter integer");
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
//		2.  Write a program to access a character from a string at a given
//	    index. Handle the case when the index is out of range using
//	    exception handling.
//		
		
		
		
		System.out.println();
		String s = "Hello, World!";
		System.out.println("Please Enter the index : ");
		try {
		int index = sc.nextInt();
		char a = s.charAt(index);
		System.out.println("Character at "+index+" is "+a);
		}catch(StringIndexOutOfBoundsException obe) {
			obe.printStackTrace();
		}catch(InputMismatchException ime) {
			ime.printStackTrace();
		}
		
		
		
//		3.  Create a program where you define a custom exception class
//	    InvalidAgeException. Throw this exception if the age entered is less
//	    than 18.
		
		
		System.out.println();
		System.out.println("please enter your age :");
		try {
		int age = sc.nextInt();
		if(age<18) {
			throw new InvalidAgeException("Your Cannot Vote");
		}
		else {
			System.out.println("You can Vote");
			}
		}catch(InvalidAgeException iae) {
			iae.printStackTrace();
		}
		
		
//		4.  Write a program to demonstrate the use of finally block by printing
//	    a message regardless of exception occurrence.
		
		System.out.println();
		int c = 0;
		System.out.println("please enter first no :");
		try {
		int a = sc.nextInt();
		System.out.println("Enter second no. ");
		int b = sc.nextInt();
		 c = a*b;
		 }catch(InputMismatchException ime2) {
			 ime2.printStackTrace();
		 }
		 finally {
		System.out.println(c);
		
		System.out.println("Thanks For using");
		 }
		
		
		
		
		}
		
		
		
		
	}


