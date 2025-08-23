package operators;
import java.util.Scanner;

public class PercentageCal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the  Subject1 No. ");
		int s1 = s.nextInt();
		
		System.out.println("Enter the  Subject2 No. ");
		int s2 = s.nextInt();
		
		System.out.println("Enter the  Subject3 No. ");
		int s3 = s.nextInt();
		
		System.out.println("Enter the  Subject4 No. ");
		int s4 = s.nextInt();
		
		System.out.println("Enter the  Subject5 No. ");
		int s5 = s.nextInt();
		
		System.out.println("Enter the  Subject Out Of  No. "); // from 100 or 80
		int outof = s.nextInt();
		
		
		int t = (s1+s2+s3+s4+s5);
		float per = (t*100)/(outof*5);
		System.out.println("total marks "+per +"%");
		System.out.println(t +" outof " + outof*5);
		
		
		
	}

}
