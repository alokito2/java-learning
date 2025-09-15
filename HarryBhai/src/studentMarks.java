import java.util.Scanner;

public class studentMarks {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	float m1,m2,m3,mf,avg,per;
	System.out.println("Please Enter Your Marks in Physics ");
	m1 = sc.nextInt();
	System.out.println("Please Enter Your Marks in Chemestry ");
	m2 = sc.nextInt();
	System.out.println("Please Enter Your Marks in Maths ");
	m3 = sc.nextInt();
	System.out.println("Please Enter the Out of you get like from 80 or 100");
	mf = sc.nextInt();
	
	avg = m1+m2+m3;
	per = (avg*100)/(mf*3);
	if(per > 40 && (m1*100)/mf > 33  ) {
		if((m2*100)/mf > 33 || (m3*100)/mf > 33) {
			System.out.println("you are passed with "+per+"% "+"get "+avg+" out off"+mf*3);
		}
		
	}
	else {
		System.out.println("you are failed with "+per+"% "+"get "+avg+" out off "+mf*3);
	}
	
	
	
	
	
	}

}
