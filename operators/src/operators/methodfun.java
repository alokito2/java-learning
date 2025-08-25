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
	
	public static void main(String[] args) {
		oneToTen();
		System.out.println();
		naturalNo();
		System.out.println();
		square();
		
		
		
	}

}
