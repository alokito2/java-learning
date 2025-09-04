package operators;
import java.util.Scanner;

public class SingleDigitSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int result = num;
		while(result > 10) {
			int sum = 0;
			while(result > 0) {
				sum += result % 10;
				result /= 10;
				
			}
			result = sum;
		}
		System.out.println("The single-digit sum is : "+ result);
		}catch(Exception e) {
			System.out.println("please enter valid number");
		}
		
		sc.close();
		}
	

}
