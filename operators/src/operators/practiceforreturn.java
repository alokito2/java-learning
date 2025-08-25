package operators;

public class practiceforreturn {
	
	// odd number
	public static void odd(int sNum,int eNum) {
		for(int i = sNum; i <= eNum; i++) {
			if(i%2 !=0) {
				System.out.println(i);
			}
		}	
	}
	
	
	// even number
	public static void even(int sNum,int eNum) {
		int sume=0;
		for(int i = sNum; i <= eNum; i++) {
			if(i%2 == 0) {
				sume += i;
				System.out.print(" "+i);
			}
			
		}System.out.println(sume);	
	}
	
	public static void bool(boolean soft,boolean dom) {
		if(soft == true || dom == true) {
			System.out.println("Students have to visit Center");
		}
		else {
			System.out.println("no one came at center ");
		}
	}
	// factorial
	public static void fac(int num) {
		int fact = 1;
		for(int i = 1; i <= num; i++) {
			fact = fact*i;
			System.out.println(fact);
		}
	}
	
	
	public static void main(String[] args) {
		odd(50,100);
		even(2,50);
		bool(true,false);
		fac(5);
		
	}

}
