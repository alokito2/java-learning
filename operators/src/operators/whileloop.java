package operators;

public class whileloop {
	public static void main(String args[]) {
		int a = 1;
		while(a<=10) {
			System.out.println("hello");
			a++;
		}
		
		
		System.out.println();
		// sum of natural no.
		int b = 1;
		int sumn = 0;
		while(b<=100) {
			sumn += b;
			b++;
		}
		System.out.println("sum of natural no. "+sumn);
		
		System.out.println();
		// square 20 - 2
		
		int c = 20;
		while(c>=2) {
			if(c%2 == 0) {
				System.out.println(" "+ c*c);
			}
			c--;
		}
		
		
		System.out.println();
		// alphabet
		
		int d = 65;
		while(d<=90) {
			System.out.print(" "+(char)d);
			d++;
		}
		
		
		System.out.println();
		// a-z small
		int e = 97;
		while(e<=122) {
			System.out.print(" "+(char)e);
			e++;
		}
		
		
		System.out.println();
		// 1 -50
		int f = 1;
		while(f<=50) {
			System.out.print(" "+f);
			f++;
		}
		
		System.out.println();
		// even
		int g = 1;
		while(g<=100) {
			if(g%2 == 0) {
				System.out.print(" "+g);
			}
			g++;
		}
		
		//odd
		System.out.println();
		int h = 1;
		while(h<=100) {
			if(h%2 != 0) {
				System.out.print(" "+h);
			}
			h++;
		}
		System.out.println();
		// sum of even
		int sume = 0;
		int i = 1;
		while(i<=100) {
			if(i%2 == 0) {
				sume += i;
			}
			i++;
	}System.out.println("even sum "+sume);
	
	System.out.println();
	// sum of odd
	int sumodd = 0;
	int j = 1;
	while(j<=100) {
		if(j%2 != 0) {
			sumodd += j;
		}
		j++;
}		System.out.println("odd sum "+sumodd);
		
	}
}
