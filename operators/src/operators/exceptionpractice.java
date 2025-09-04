package operators;


import java.util.Scanner;


public class exceptionpractice {
	public static int Division(int a,int b)throws ArithmeticException {
		return a/b;
		
	}
	public static void StringToIt(Scanner sc) {
//		3. String to Integer Conversion
//
//		Take a string input from the user and try to convert it to an integer u
		
		
		System.out.println("Please Enter  String :");
		try {
		String userIn = sc.nextLine();
		
		int num = Integer.parseInt(userIn);
		System.out.println("The Integer format of "+userIn+" is "+num);
		}catch(NumberFormatException ne) {
			System.out.println(ne.fillInStackTrace());
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		try {
//			Division(5,0);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		
		
		
		
		// throw
		
		try {
			System.out.println("please Enter your age :");
			int age = sc.nextInt();
			if(age < 18) {
				//System.out.println("you cannot vote");
				throw new ArithmeticException("you cannot vote");
			}else {
				System.out.println("you can Vote");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		// CustomException
		
		int pass = 123;
		System.out.println("Please Enter the Password :");
		int userPass = sc.nextInt();
		try {
		if(pass != userPass) {
			throw new IncorrectPasswordException("Incorrect Password");
			
		}else {
			System.out.println("Login Successfully");
		}
		}catch(IncorrectPasswordException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		

//		1. Division by Zero
//
//		Write a program that takes two integers from the user and performs division.
//		Use try-catch to handle the case when the denominator is zero and display a proper error message.
//		System.out.println("*****Welcome******");
//		try{
//		System.out.println("Please enter first No. ");
//		int a = sc.nextInt();
//		System.out.println("Please Enter the second No. ");
//		int b = sc.nextInt();
//		int c = a/b;
//		System.out.println("Result of "+a+"/"+b+"= "+c);
//		
//		}catch(InputMismatchException ie){
//			System.out.println("Please enter Valid No.");	
//		}
//		catch(ArithmeticException ze) {
//			System.out.println(ze.fillInStackTrace());
//		}
//		catch(Exception e) {
//			System.out.println(e.fillInStackTrace());
//		}
////		System.out.println("Thanks");
////		
////		 2. String Index Out of Bounds
////
////		 Write a program that initializes an string
////		 Ask the user for an index and try to print the char at that index.
////		 Handle the case when the user enters an invalid index.
//		
//		String s = "Hello, World";
//		System.out.println("Please Enter the index");
//		try {
//		int index = sc.nextInt();
//		char c = s.charAt(index);
//		System.out.println("character at "+index+" is "+c);
//		}catch(StringIndexOutOfBoundsException ioe) {
//			System.out.println("please Enter Valid index");
//			System.out.println(ioe.fillInStackTrace());
//		}catch(InputMismatchException ie){
//			System.out.println("Please enter Valid No.");	
//		}catch(Exception e) {
//			System.out.println(e.fillInStackTrace());
//		}
//		
		StringToIt(sc);

		
		
		
		sc.close();
		}
	

}
