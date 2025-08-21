package operators;

public class dowhile {
	public static void main(String[] args) {
		int b =3;
		do {
			System.out.println("Java");
			b--;
		}while(b==0);
		
		
		do {
			System.out.println("Python");
			b--;
		}while(b>=0);
		
		
		// sum of Natural No.
		int a = 100;
		int sumN = 0;
		do {
			 sumN += a;
			a--;
		}while(a>=1);
		System.out.println(sumN);
		
		// square 20 - 2
		int n = 20;
		
		do {
			if(n%2 == 0) {
				System.out.println(n*n);
				
			}
			n--;	
		}while(n>=2);
		
		// A-Z
		
		int alpha = 65;
			do {
				System.out.print(" "+(char)alpha);
				alpha++;
			}while(alpha <= 90);
			
		//a-z
		System.out.println();
		int alphaS = 97;
			do {
				System.out.print(" "+(char)alphaS);
				alphaS++;
			}while(alphaS <= 122);
			
		// 1-50
		System.out.println();
		int no = 1;
		do {
			System.out.print(" "+no);
			no++;
		}while(no<=50);
		
		
		//even
		System.out.println();
		int even = 1;
		do {
			if(even%2 == 0) {
				System.out.print(" "+even);
				
			}
			even++;	
		}while(even<=100);
		
		//odd
		System.out.println();
		int odd = 1;
		do {
			if(odd%2 != 0) {
				System.out.print(" "+odd);
						
				}
			odd++;	
		}while(odd<=100);
		
		
		//sum of even
		System.out.println();
		int evenn = 1;
		int SumE =0;
		do {
			if(evenn%2 == 0) {
				SumE += evenn;
				
			}
			evenn++;	
		}while(evenn<=100);
		System.out.println(" "+SumE );
		
		
		//sum of odd
		System.out.println();
		int oddN = 1;
		int SumO = 0;
		do {
			if(oddN%2 != 0) {
				SumO += oddN;
				
				}
				oddN++;	
		}while(oddN<=100);
		System.out.println(SumO);
		
		
		// 1-50
		System.out.println();
		int num = 50;
		do {
			System.out.print(" "+num);
			num--;
		}while(num>=1);
		
				
	}
	
	

}
