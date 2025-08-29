package operators;

public class number {
	public static void main(String[] args) {
		for(int i = 1 ; i <= 50 ; i++ ) {
			if(i%4 == 0 && i % 5 == 0) {
				System.out.print(" FizzBuzz");
			}
			else if(i%5 == 0) {
				System.out.print(" Buzz");
				
			}
			else if(i%4 == 0) {
				System.out.print(" Fizz");
			}
			else {
				System.out.print(" "+i);
			}
			
			
			
		}
		
	}
	

}
