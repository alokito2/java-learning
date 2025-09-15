import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float userIn,tax;
		System.out.println("Please Enter your income ");
		userIn = sc.nextFloat();
		if(userIn < 250000) {
			System.out.println("you don't need to pay Income tax");
		}
		else if(userIn >25000 && userIn <=500000) {
			tax = 5*userIn/100;
			System.out.println("As your income is "+userIn+"\n\t that's why you have to pay 5% of your income which is "+tax);
		}
		else if(userIn >500000 && userIn <=1000000) {
			tax = 20*userIn/100;
			System.out.println("As your income is "+userIn+"\n\t that's why you have to pay 20% of your income which is "+tax);
		}
		else if(userIn >1000000 ) {
			tax = 30*userIn/100;
			System.out.println("As your income is "+userIn+"\n\t that's why you have to pay 30% of your income which is "+tax);
		}
		
	}

}
