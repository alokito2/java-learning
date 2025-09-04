package operators;

import java.util.Scanner;

public class labexception2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******Welcome*******");
		System.out.println("Please Enter the Number:");
		String s = sc.nextLine();
		try {
		int number = Integer.parseInt(s);
		System.out.println("You Enter the "+number);
		}catch(NumberFormatException ne) {
			ne.printStackTrace();
			System.out.println("Please Enter Valid Number");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
