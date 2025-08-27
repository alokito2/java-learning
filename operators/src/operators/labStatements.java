package operators;

public class labStatements {
	public static void main(String[] args) {

//1. Write a Java program that takes an integer input and prints whether 
//it’s odd or even using an if expression statement inside the main method.
		int num = 5;
		if( num%2 == 0) {
			System.out.println(num + " is a Even Number ");
		}
		else {
			System.out.println(num + " is a Odd Number");
		}
		
//2. Declare variables to store marks in 5 subjects. Take user input and calculate the average.
//Print whether the student passed (average ≥ 40) or failed.
		
		int sub1 = 65;
		int sub2 = 75;
		int sub3 = 65;
		int sub4 = 55;
		int sub5 = 45;
		int avgMarks =  (sub1 + sub2 + sub3 + sub4 + sub5)/5;
		if (avgMarks >= 40) {
			System.out.println("Avg marks is "+avgMarks+" , Student Passed !!");
		}else {
			System.out.println("Avg marks is "+avgMarks+" , Student Failed !!!");
		}
		
//3. Write a program where you first initialize a number n = 10, then repeatedly
//update n = n \* 2 inside a loop until n becomes greater than 500. Print all values of n.
		int n = 10;
		while(n <=500) {
			System.out.println(n);
			n= n*2;
		}
			
//4. Write a program to print the first 20 terms of the Fibonacci series using a for loop.		
		
		int n1 = 0;
		int n2 = 1;
		for(int i = 1; i <= 20; i++) {
			System.out.println(" "+n1);
			int nextN = n1 + n2;
			n1 = n2;
			n2 = nextN;
			
		}
		
//5. Write a program that takes a number as input. If the number is negative,
//immediately exit the program using return. Otherwise, print the square of the number.	
		
		int no = -5;
		if(no <0) {
			System.out.println(no+" Number is Negative");
			return;
		}
		else {
			int square = no*no;
			System.out.println("Square of "+no+ " is "+square);
		}
	}
	

}
