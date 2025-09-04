package operators;

import java.util.Scanner;

public class knowledgecheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		5.  Create a Java program to handle multiple exceptions:
//		    NullPointerException, ArithmeticException, and
//		    StringIndexOutOfBoundsException.
		
		System.out.println("Please enter your name to find lenght :");
		try {
		String name = sc.nextLine();
		if(name == "") {
			name = null;
		}
		int len = name.length();
		System.out.println(len);
		
		
		System.out.println("enter the index to get char ");
		int index = sc.nextInt();
		char a = name.charAt(index);
		System.out.println("at "+index+"the char is "+a);
		
		System.out.println("please enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("please enter the second number :");
		int num2 = sc.nextInt();
		int div = num1/num2;
		System.out.println(num1+"/"+num2+" = "+div);
		
		}catch(NullPointerException ne) {
			ne.printStackTrace();
		}catch(StringIndexOutOfBoundsException se) {
			se.printStackTrace();
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
