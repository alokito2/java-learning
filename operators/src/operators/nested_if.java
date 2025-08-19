package operators;
import java.util.*;


public class nested_if {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a =s.nextInt();
		if (a>0) {
			System.out.println("The Number is Positive ");
		}else if(a==0) {
			System.out.println("0 is neither positive nor negative");
			
		}
		else if (a<0) {
			System.out.println("the number is negative ");
		}
		System.out.print("Write age to know life stage : ");
		int b =s.nextInt();
		if (b <= 1) {
			System.out.println("You're Baby");	
		}
		else if(b<=3 && b>1) {
			System.out.println("You're Toddler");	
		}
		else if(b<=12 && b>3) {
			System.out.println("You're Child");	
		}
		else if(b<=19 && b>12) {
			System.out.println("You're Teen/Teenager");
		}
		else if(b<=39 && b>19) {
			System.out.println("You're Young Adult");
		}
		else if(b<=59 && b>39) {
			System.out.println("You're Middle-aged Adult");
		}
		else if(b>=60 && b<180) {
			System.out.println("You're Senior");
		}
		else {
			System.out.println(" !!! Please enter valid age");
		}
		
	}

}
