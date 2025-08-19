package operators;

public class forloop {
	public static void main(String[] args) {
		System.out.println("---------for loop ---------");
		int i;
		for(i = 1; i<=10 ; i++ ) {
			int b = 5*i;
			System.out.println(5 + "*" + i + "=" +b);
			
		}
		char j;
		for(j = 65; j<=90 ; j++ ) {
			
			System.out.println(j);
			
		}
		char z;
		for(z = 97; z<=122 ; z++ ) {
			System.out.println(z);
			
		}
		
		// using int
		int a;
		for(a = 65; a<=90 ; a++ ) {
			
			System.out.println((char)a);
			
		}
		int b;
		for(b = 97; b<=122 ; b++ ) {
			System.out.println((char)b);
			
		}
		
		// 1 - 50 
		int c;
		for(c = 1; c<=50 ; c++ ) {
			System.out.print(" "+c);
	}
		int d;
		int sumeven = 0;
		int sumodd = 0;
		for(d = 1; d<=100 ; d++ ) {
			if (d % 2 == 0) {
				sumeven += d;
				System.out.println(d+" even ");
				}
			else {
				sumodd += d;
				System.out.println(d+" odd ");
			}
			}
		System.out.println(sumeven);
		System.out.println(sumodd);
		
		int sumna = 0;
		for (i = 100 ; i>= 1 ; i--) {
			sumna += i;
			
		}
		System.out.println("sum of natural no. " +sumna);
		
		for(i = 20 ;i >= 2 ;i--) {
			if(i % 2 == 0) {
				System.out.print(" "+i*i);
			}
		}
		

}
}
