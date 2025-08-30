package operators;

public class Concat {
	
//	Write a method concat(String... words) that takes multiple strings and joins them with a space.
	public static String con(String... name) {
		String a = "";
		for(String i : name) {
			a +=  i + " ";
		} return a;
	}
	
//	Write a method max(int... numbers) to find the largest number.
	public static int max(int... numbers) {
		int large = numbers[0];
		for(int i : numbers) {
			if(i>large) {
				large = i;	
			}
		}return large;
	}
	
//	Write a method to find even and odd using varargs
	
	public static void evenOdd(int... num) {
		for(int i : num) {
			if( i % 2 == 0) {
				System.out.println( i + " is Even");
			}else {
				System.out.println( i + " is Odd");
			}
		}
	}
	//
	public static String evenOd(int... num) {
		StringBuilder sb = new StringBuilder();
		for(int i :num) {
			if( i % 2 == 0) {
			sb.append("Even ").append(i).append(" ");	
			}else {
				sb.append("Odd ").append(i).append(" ");
			}
		}
		return sb.toString().trim() ;
	}
//	public static String evenOd(int... num) {
//	    for (int i : num) {
//	        return (i % 2 == 0 ? "Even " + i : "Odd " + i);
//	    }
//	    return ""; 
//	}
	
	
	
	public static void main(String[] args) {
		System.out.println(con("Sachin","Patel"));
		System.out.println(max(25,65,4,2,5,92));
		//evenOdd(5,65,4,6,46,8,2,8,5,7);
		System.out.println(evenOd(2,6,7,2,8));
	}

}
