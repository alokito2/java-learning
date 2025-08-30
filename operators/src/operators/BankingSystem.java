package operators;

import java.util.Scanner;

public class BankingSystem {
	private String accountHolder;
	private String accountNumber;
	private double balance;
	
	public BankingSystem(String accountHolder, String accountNumber , double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw successful of "+amount);
		}else {
			System.out.println("Insufficient Balance or Enter Valid Amount");
		}
	}
	public void Deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposit Successful of "+amount  );
		}else {
			System.out.println("Invalid Deposit Amount ");
		}
	}
	public void checkBalance() {
		System.out.println("Your account Balance is "+ balance);
	}
	public void acountdetails() {
		System.out.println("Account Holder : "+accountHolder);
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Balance : "+balance);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Account Holder Name : ");
		String name = sc.nextLine();
		System.out.println("Enter the Account Number :");
		String accNum = sc.nextLine();
		System.out.println("Enter the Intial Balance :");
		double intialbalance = sc.nextDouble();
		BankingSystem account = new BankingSystem(name,accNum,intialbalance);
		
		int choice;
		do {
			System.out.println("Welcome to Banking Menu");
			System.out.println("1. Deposit Amount ");
			System.out.println("2. Withdraw Amount ");
			System.out.println("3. Balance Check");
			System.out.println("4. Account Info");
			System.out.println("5. Exit");
			System.out.print("Choose an option : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("Enter the Amount :");
				double depositamount = sc.nextDouble();
				account.Deposit(depositamount);
				break;
			case 2 :
				System.out.println("Enter the Amount");
				double withdrawamount = sc.nextDouble();
				account.withdraw(withdrawamount);
				break;
			case 3 :
				account.checkBalance();
				break;
			case 4 :
				account.acountdetails();
				break;
			case 5 :
				System.out.println("Thank you ! for using our Banking System ");
				break;
			default :
				System.out.println("Please Select Valid Option");
			}
			
		}while(choice != 5);
		
		sc.close();
	}

}
