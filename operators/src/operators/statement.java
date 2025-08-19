package operators;
import java.util.Scanner;

public class statement {

	// statement
	//type
	//1) declarative statements:
	static int age;
	static String name;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	// 2) Assignment statement
		age = 20;
		name = "Sachin ";
	//3) expression
		int dd = 3+19;
		//4) control flow
		if (age >= 18) {
			System.out.println("You are eligible ");	
			}
		else {
			System.out.println("Cannot Vote");
	}
		String p1 = "P";
		String a1 = "A";
		System.out.print("enter the Word : ");
		String x = s.nextLine();
		if (x.equalsIgnoreCase(p1)){
			System.out.println("Is Present");
		}
		if (x.equalsIgnoreCase(a1)) {
			System.out.println("Absent");
		}
		else {
			System.out.println("Enter A or P");
		}
		
		System.out.println("Enter the No : ");
		
		int sa =s.nextInt();
		if (sa > 0) {
			System.out.println("No is Positive");
			
		}
		else {
			System.out.println("No is Negative");
		}
		s.close();
		
		
		System.out.println();
		String c1 = "India";
		int age1 = 20;
		if (c1.equalsIgnoreCase("India") & age1 >= 18) {
			System.out.println("You are Qualify");
		}
		else {
			System.out.println("You are Not qualify");
		}
		
		System.out.println();
		boolean isSoft = true;
		boolean isDom = false;
		if(isSoft == true || isDom == true ) {
			System.out.println("Present at Center");
		}
		else {
			System.out.println(" Not present");
		}
// nested if
		
		
		int m = 10;
		int n = 5;
		int c;
		char o = '+';
		if (o == '+') {
			c = m + n;
			System.out.println("Addition Of m and n is :" +c);
			
		}else if (o == '-') {
			c = m - n;
			System.out.println("Subtraction Of m and n is :" +c);
			
		}else if (o == '*') {
			c = m * n;
			System.out.println("Multiplication Of m and n is :" +c);
			
		}else if (o == '/') {
			c = m / n;
			System.out.println("Division Of m and n is :" +c);
			
		}
		
		// switch
		int dayNo = 8;
		switch (dayNo) {
		case 1 :
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuesday");
			break;
		case 3 :
			System.out.println("Wednesday");
			break;
		case 4 :
			System.out.println("Thursday");
			break;
		case 5 :
			System.out.println("Friday");
			break;
		case 6 :
			System.out.println("Saturday");
			break;
		case 7 :
			System.out.println("Sunday");
			break;
		default :
			System.out.println("Please Enter No. between [1-7]");
		}
		// Ternary
		int old = 19;
		String op = old >= 18? "You can Vote " : "you cannot Vote ";
		System.out.println(op);
		

	}
		


}
