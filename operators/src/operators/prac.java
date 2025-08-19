package operators;
import java.util.*;

public class prac {
	public static void main(String[] args) {
		// 1)
		int cost = 50000;
		String brand = "Iphone";
		if (cost <= 50000 && brand.equalsIgnoreCase("Iphone")) {
			System.out.println("Buy it");
		}else {
			System.out.println("Don't Buy");
		}
		
		// 2)
		String Caste = "Kshatriyas";
		String Carrier = "Engineer";
		String Class = "Upper";
		String Religion  = "Hindu" ;
		
		if (Caste.equalsIgnoreCase("Kshatriyas") && Carrier.equalsIgnoreCase("Engineer")) {
			System.out.println(" Caste and Carrier Matche go ahead ");
		}
		else if(Caste.equalsIgnoreCase("Kshatriyas") && Class.equalsIgnoreCase("Middle")) {
			System.out.println(" Caste and  Class Matche go ahead  ");
		}
		else if(Caste.equalsIgnoreCase("Kshatriyas") && Religion.equalsIgnoreCase("Hindu")) {
			System.out.println("Caste and Religion Matche go ahead ");
		}
		else if ( Religion.equalsIgnoreCase("Hindu") && Carrier.equalsIgnoreCase("Engineer")) {
			System.out.println("Religion and Carrier Matche go ahead ");
		}
		else if ( Religion.equalsIgnoreCase("Hindu") && Class.equalsIgnoreCase("Middle")) {
			System.out.println("Religion and Class Matche go ahead ");
		}
		else if ( Religion.equalsIgnoreCase("Hindu") &&Carrier.equalsIgnoreCase("Engineer")) {
			System.out.println("Religion and Carrier Match go ahead ");
			
		}
		else {
			System.out.println("no match found");
		}
	}

}
