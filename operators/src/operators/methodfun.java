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
	public static void table(int num) {
		for(int i = 1 ;i<= 10;i++) {
			System.out.println(num + " x "+ i+"="+num*i);
		}
	}
	// with string
	public static void hello(String name) {
		System.out.println("hello "+name);
	}
	
	// using return
	public static String hi(String name) {
		return "hello "+name;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		oneToTen();
		System.out.println();
		naturalNo();
		System.out.println();
		square();
		
		// 5 is argument
		table(5);
		table(6);
		// sachin is argument 
		hello("sachin");
		hello("patel");
		System.out.println(hi("sac"));
		System.out.println(add(5,4));
		
		
		
	}

}
