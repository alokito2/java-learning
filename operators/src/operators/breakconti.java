package operators;

public class breakconti {
	public static void main(String[] args) {
		// break
		for(int i = 1; i<=10 ;i++) {
			if(i==7) {
				break; // will stop the loop 
			}
			System.out.print(" "+i);
		}
		
		// continue
		System.out.println();
		for(int j = 1;j<=10;j++) {
			if(j==7) {
				continue; // skip 7 then  loop continue
			}
			System.out.print(" "+j);
		}
	}

}
