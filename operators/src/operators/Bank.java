package operators;

import java.util.Scanner;

public class Bank {
	
	private String accountNo;
	public void setAccountNo(String acNo) {
		this.accountNo = acNo;	
	}
	public String getAccountNo() {
		return this.accountNo;
	}
	
	
	private String holderName;
	public void setHolderName(String name) {
		this.holderName = name;
	}
	public String getHolderName() {
		return this.holderName;
	}
	
	
	
	private String Ifsc;
	//  to set the value
	public void setIfsc(String ifsc) {
		this.Ifsc = ifsc;
		
	}
	public String getIfsc() {
		return this.Ifsc;
	}
	
	public String toString() {
		return "Account Details : "+ "Account No : "+accountNo+" , "+" Holder Name : "+holderName+" , "+" Ifsc Code : "+Ifsc;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bank b = new Bank();
		b.setAccountNo("123456789");
		b.setHolderName("Sachin");
		b.setIfsc("abc123");
		
		//from user 
		Bank userIn = new Bank();
		System.out.println("Enter the account no ");
		String a = sc.nextLine();
		userIn.setAccountNo(a);
		
		System.out.println("Enter the name ");
		String n = sc.nextLine();
		userIn.setHolderName(n);
		
		System.out.println("Enter the Ifsc ");
		String i = sc.nextLine();
		userIn.setIfsc(i);
		
		System.out.println(b);
		System.out.println(userIn);
		
//		System.out.println(b.getHolderName());
	}

}
