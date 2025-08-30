package operators;

public class methodfun {
	
	// 1 - 10
	public static void oneToTen() {
		int i;
		for(i=1;i<=10;i++) {
			System.out.println(" "+i);
		}
	}
	
	// natural no.
	public static void naturalNo() {
		int sumNatural = 0;
		for(int j = 100; j >= 1; j--){
			sumNatural += j;
			
		}
		System.out.println("Sum of Natuarl No. "+sumNatural);
	}
	
	// 20 - 2 square
	public static void square() {
		 for(int z= 20; z>= 2; z--) {
			 if(z%2 == 0) {
				 System.out.println(z +" x "+z+" = "+ z*z);
			 }
		 }
	}
	
	// argument int num is parameter
	// i did not add static thats why i need to create an a object for the class to 
	// access this methods
	public void table(int num) {
		for(int i = 1 ;i<= 10;i++) {
			System.out.println(num + " x "+ i+"="+num*i);
		}
	}
	// with string
	public static void hello(String name) {
		System.out.println("hello "+name);
	}
	
	// using return
	public  String hi(String name) {
		return "hello "+name;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	// varargs:
	// rule 1: only 1 varargs allowed per method (int... num ,int... days)X
	//2: varargs parameter always come last (int... num ,String name)X
	public static int add(int... num) {
		int total = 0;
		for(int i : num) {
			total += i;
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		// creating objects
		
		methodfun meth = new methodfun();
		oneToTen();
		System.out.println();
		naturalNo();
		System.out.println();
		square();
		
		// 5 is argument
		
		meth.table(5);
		meth.table(6);
		// sachin is argument 
		hello("sachin");
		hello("patel");
		System.out.println(meth.hi("sac"));// where i did not declare the the method as a static
		// i need to add object name before it as you can see in the above program
		System.out.println(add(5,4,5));// here calling varargs
		System.out.println(add(5,7));
		
		
		
	}

}
