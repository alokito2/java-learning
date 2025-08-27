package operators;
import java.util.*;

public class ProjectCalculator {
	//add
	public static int add(int num1,int num2) {
		return num1+num2;
		
	}
	//sub
	public static int sub(int num1,int num2) {
		return num1-num2;
	
	}
	//mul	
	public static int mul(int num1,int num2) {
		return num1*num2;
		
	}
	//div
	public static int div(int num1,int num2) {
		return num1/num2;
		
	}
	//mod
	public static int mod(int num1,int num2) {
		return num1%num2;
		
	}
	//square
	public static void square(int n) {
		
		System.out.println("Square of "+ n+ " is "+n*n);
		
	}
	// factorial
	public static void fac(int n) {
		int fact = 1;
		for(int i = 1;i<=n ; i++) {
			fact = fact*i;
			System.out.println(fact);
		}System.out.println("Factorial of "+n+ " in Total "+fact);
		
	}
	// even odd pos negative
	public static void  nepo(int n){
		if(n<0) {
			System.out.println(n+" is Negative");
		} else if(n>0) {
			System.out.println(n+" is Postive");
		}else if(n%2 == 0) {
			System.out.println("number is even");
		}else if(n%2 != 0) {
			System.out.println("number is odd");
		}
		
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("******Calculator******");
		System.out.println("Enter 1 for +-*/% 2 for square,factorial,even,odd,Positive,Negative");
		int choose =s.nextInt();
		switch(choose) {
		case 1:
			System.out.print("Enter the First Number : ");
			int num1 = s.nextInt();
			System.out.print("Enter the Second Number : ");
			int num2 = s.nextInt();
			System.out.print("Enter the + - * / % : ");
			int operation = s.next().charAt(0);
			switch(operation) {
			case '+' :
				System.out.println(add(num1,num2));
				break;
			case '-' :
				System.out.println(sub(num1,num2));
				break;
			case '*' :
				System.out.println(mul(num1,num2));
				break;
			case '/' :
				System.out.println(div(num1,num2));
				break;
			case '%' :
				System.out.println(add(num1,num2));
				break;
			default :
				System.out.println("Please enter valid operator");
			}
		
		case 2:
			System.out.println("*****Welcome*****");
			System.out.println("Please choose 1-square,2-fact,3-Pos,Neg,Even,Odd");
			int userIn = s.nextInt();
			System.out.println("Please Enter the Number");
			int n = s.nextInt();
			switch(userIn) {
			case 1:
				square(n);
				break;
			case 2:
				fac(n);
				break;
			case 3:
				nepo(n);
				break;
			default:
				System.out.println("please enter the between 1 2 3");
			}
		case 3:
			System.out.println("Exited");
			s.close();
			return;
		default :
			System.out.println("Please Enter the Correct option 1 or 2");
			
			
			
		}
		
		
		
		
	}

}
