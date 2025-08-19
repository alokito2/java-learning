package operators;

public class switch_ {
	public static void main(String[] args) {
		int MonthNo = 5;
		switch (MonthNo) {
		case 1 :
			System.out.println("Jan");
			break;
		case 2 :
			System.out.println("Feb");
			break;	
		case 3 :
			System.out.println("Mar");
			break;
		case 4 :
			System.out.println("Apr");
			break;
		case 5 :
			System.out.println("May");
			break;
		case 6 :
			System.out.println("Jun");
			break;
		case 7 :
			System.out.println("Jul");
			break;
		case 8 :
			System.out.println("Aug");
			break;
		case 9 :
			System.out.println("Sep");
			break;
		case 10 :
			System.out.println("Oct");
			break;
		case 11 :
			System.out.println("Nov");
			break;
		case 12 :
			System.out.println("Dec");
			break;
		default :
			System.out.println("Please Enter Month No. between [1-12]");
		}
		char VowelName = 'a';
		switch (VowelName) {
		case 'a','e','i','o','u' :
			System.out.println("a,e,i,o,u are Vowels");
			break;
		default:
			System.out.println("Consonants");
		
		}
	}

}
