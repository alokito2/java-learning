package operators;

public class Ternary {
	public static void main(String[] args) {
		// 1)
		int cost = 50000;
		String brand = "Iphone";
		String op = cost <= 50000 && brand.equalsIgnoreCase("Iphone")? "Buy It" : "Don't Buy";
		System.out.println(op);
		
		System.out.println();
		// 2)
		char p1 = 'A';
		String re = p1 == 'P'? "Prsent " : p1 == 'A'? "Absent" : "Enter A or P";
		System.out.println(re);
		
		System.out.println();
		//3
		String c1 = "India";
		int age1 = 20;
		String qu = c1.equalsIgnoreCase("India") && age1 >= 18? "You are Qualify" : "Not Qualify";
		System.out.println(qu);
		
		System.out.println();
		//4
		boolean isSoft = true;
		boolean isDom = false;
		String att = isSoft == true || isDom == true? "Present at Center" : "Not Present" ;
		System.out.println(att);
		
		//5
		int a = 2;
		String sig = a > 0? "No. is Positive " : a < 0? "No. is Negative " :  "0 is Not a Negative nor Positive";
		System.out.println(sig);
		
		//6
		int b = 4;
		String si = b % 2 == 0 ? "Even" : "odd";
		System.out.println(si);

}
}