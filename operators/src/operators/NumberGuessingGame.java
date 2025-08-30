package operators;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int numberToGuess = rand.nextInt(100) + 1; // generate 1 - 100
		int userGuess = 0;
		int attempts = 0;
		
		
		System.out.println(" 🎯 Welcome to the Number Guessing Game!");
	    System.out.println("I have chosen a number between 1 and 100. Try to guess it!");
	    
	    while(userGuess != numberToGuess) {
	    	System.out.println("Enter your Guess : ");
	    	userGuess = sc.nextInt();
	    	attempts ++;
	    	
	    	if(userGuess < numberToGuess) {
	    		System.out.println("Too low! Try Again ");
	    	}
	    	else if(userGuess > numberToGuess) {
	    		System.out.println("Too high! Try Again ");
	    	}else {
	    		System.out.println("Congratulation Your Guess Is Right!, You Guess The Number in "+attempts+" Attempts");
	    	}
	    }
		
		sc.close();
	}

}
