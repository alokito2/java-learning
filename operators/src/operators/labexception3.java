package operators;

import java.util.InputMismatchException;
import java.util.Scanner;

public class labexception3 {
	public static void main(String[] args) {
//		3. Write a program to access an element from a list by index.
//		Handle the case when the index is out of range.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Your name :");
		String name = sc.nextLine().trim();
		System.out.println("Please Enter the Index: ");
		try {
		int index = sc.nextInt();
		char ch = name.charAt(index);
		System.out.println("At The "+index+" Positin The Char is "+ch);
		}catch(StringIndexOutOfBoundsException ioe) {
			System.out.println("Please Enter Valid Index");
			ioe.printStackTrace();
			
		}catch(InputMismatchException ime) {
			ime.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thanks For Using Our App");
		
		
	}

}
