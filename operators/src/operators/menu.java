package operators;
import java.util.*;

public class menu {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int userIn;
		do {
			System.out.println("*********Menu*********");
			System.out.println("For Addition Enter 1 ");
			System.out.println("For Subtraction Enter 2 ");
			System.out.println("To Exit Enter 3 ");
			userIn = s.nextInt();
			
		if(userIn == 1) {
			System.out.println("Enter the Fisrt No. ");
			int firstNo = s.nextInt();
			System.out.println("Enter the Second No. ");
			int secondNo = s.nextInt();
			int addition = firstNo + secondNo;
			System.out.println(addition);
			
		}
		else if(userIn == 2) {
			System.out.println("Enter the Fisrt No. ");
			int firstNo = s.nextInt();
			System.out.println("Enter the Second No. ");
			int secondNo = s.nextInt();
			int subtraction = firstNo - secondNo;
			System.out.println(subtraction);
			
		}
		else if (userIn == 3) {
			System.out.println("You are Exit ");	
		}
		else {
			System.out.println("Enter no. between 1 -3");
		}
		}while(userIn !=3);
		s.close();
		
	}

}
