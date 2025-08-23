package operators;
import java.util.Scanner;

public class flowcontrol {
	public static void main(String[] args) {

//1.  Number Classification Write a program that takes an integer input
//    and prints:
//
//    -   “Positive even” if it’s positive and even
//    -   “Positive odd” if it’s positive and odd
//    -   “Negative” if it’s negative
//    -   “Zero” if it’s 0
		Scanner s =new Scanner(System.in);
		System.out.print("Please Enter the Number : ");
		int num = s.nextInt();
		if(num >0) {
			if(num%2 ==0) {
				System.out.println("No. is Positive Even");
			}
			else if(num%2 != 0) {
				System.out.println("NO. is Positive Odd");
			}
		}
		else if(num < 0) {
			System.out.println("No. is Negative ");
		}
		else if(num == 0) {
			System.out.println("Zero");
		}
		
//		2.  Simple Calculator Create a console-based calculator:
//
//		    -   Accept two numbers and an operator (+, -, *, /, %).
//		    -   Use a switch statement to perform the correct operation.
//		    -   Handle invalid operators with a default case.
//		
//		
		System.out.println("*****Calculator*****");
		System.out.println("Enter the First NO.: ");
		float num1 = s.nextInt();
		System.out.println("Enter Second No.");
		float num2 = s.nextInt();
		System.out.println("Enter Operator +, -, *, /, % : ");
		char op = s.next().charAt(0);
		switch(op) {
		case '+' :
			float add = num1+num2;
			System.out.println("Addition of "+num1+ "+" +num2 +" is "+add);
			break;
		case '-' :
			float sub = num1-num2;
			System.out.println("Subtraction of "+num1+ "-" +num2 +" is "+sub);
			break;
		case '*' :
			float mul = num1*num2;
			System.out.println("Multiplication of "+num1+ "*" +num2 +" is "+mul);
			break;
		case '/' :
			float div = num1/num2;
			System.out.println("Division of "+num1+ "/" +num2 +" is "+div);
			break;
		case '%' :
			float mod = num1%num2;
			System.out.println("Subtraction of "+num1+ "%" +num2 +" is "+mod);
			break;
		default:
			System.out.println("Enter the Correct Opertator ");
			
			
			
		}
		
//		3.  Multiplication Table Write a program that prints the multiplication
//	    table of a given number up to 10. Example for 5: 5 x 1 = 5 5 x 2 =
//	    10 … 5 x 10 = 50
		
		System.out.println("Enter the No. ");
		int unum = s.nextInt();
		for(int i = 0; i<=10 ;i++) {
			System.out.println(" "+unum +" X "+i+ " = "+unum*i);
		}
		
//		4.  Prime Number Check Input a number and check whether it is prime.
//
//	    -   Use a while loop for divisor checking.
//	    -   Print “Prime” if it has no divisors other than 1 and itself,
//	        otherwise “Not Prime”.
		
		System.out.println("Enter the number : ");
		int number = s.nextInt();
		boolean isPrime = true;
		if(number <=1 ) {
			isPrime = false;
		}
		else {
			int i = 2;
			while(i <= number/2) {
				isPrime = false;
				break;
				
			}
			i++;
		}
		if (isPrime == true) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a Prime");
		}
		
//		5.  Menu-driven Program (without switch) Create a menu:
//
//		    1.  Find factorial
//		    2.  Check palindrome number
//		    3.  Exit
//
//		    -   Use a do-while loop with if-else to handle choices.
//		    -   Keep repeating until the user chooses Exit.
//	
		
		
		
		int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Find factorial");
            System.out.println("2. Check palindrome number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            if (choice == 1) {
                System.out.print("Enter a number to find factorial: ");
                int numF = s.nextInt();
                if (numF < 0) {
                    System.out.println("Factorial is not defined for negative numbers.");
                } else {
                    int fact = 1;
                    for (int i = 1; i <= numF; i++) {
                        fact *= i;
                    }
                    System.out.println("Factorial of " + numF + " is " + fact);
                }

            } else if (choice == 2) {
                System.out.print("Enter a number to check palindrome: ");
                int numP = s.nextInt();
                int original = numP, reversed = 0;

                while (numP != 0) {
                    int digit = numP % 10;
                    reversed = reversed * 10 + digit;
                    numP /= 10;
                }

                if (original == reversed) {
                    System.out.println(original + " is a palindrome.");
                } else {
                    System.out.println(original + " is not a palindrome.");
                }

            } else if (choice == 3) {
                System.out.println("Exiting the program.");
            } else {
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }

        } while (choice != 3);

		
	}

}
