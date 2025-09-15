import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class StonePaperScissor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("*********Welcome to Game*********");
		
		
		int n = 1;
		while( n <=5 ) {
			System.out.println("Please Enter \n\t 1 for Stone \n\t 2 for Paper \n\t 3 for Scissor");
			int userIn = sc.nextInt();
			int a  = rand.nextInt(3)+1;
			switch(userIn) {
			case 1 :
				switch(a) {
				case 1 -> System.out.println("Match Tie, you Choose Stone and Computer Choose Stone ");
				case 2 -> System.out.println("Match Loss, you Choose Stone and Computer Choose Paper ");
				case 3 -> System.out.println("Match Won, you Choose Stone and Computer Choose Scissor ");
				
				}
				break;
			
			case 2 :
				switch(a) {
				case 1 -> System.out.println("Match Won, you Choose Paper and Computer Choose Stone ");
				case 2 -> System.out.println("Match Tie, you Choose Paper and Computer Choose Paper ");
				case 3 -> System.out.println("Match Loss, you Choose Paper and Computer Choose Scissor ");
				}
				break;
			
			case 3 :
				switch(a) {
				case 1 -> System.out.println("Match Loss, you Choose Scissor and Computer Choose Stone ");
				case 2 -> System.out.println("Match Won, you Choose Scissor and Computer Choose Paper ");
				case 3 -> System.out.println("Match Tie, you Choose Scissor and Computer Choose Scissor ");
				}
				break;
			default :
				System.out.println("Please Choose Between 1 2 3");
			
			
		
			}
			n++;
		}
	}

}
