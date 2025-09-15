import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the string : ");
		String name = sc.nextLine().toLowerCase();
		System.out.println(name);
		String re = name.replace(" ","_");
		System.out.println(re);
		String hello = "Hello, <|name|>  welcome   to java ";
		System.out.println("Enter the name to replace");
		String name1 = sc.nextLine();
		String fill = hello.replace("<|name|>",name1);
		System.out.println(fill);
		System.out.println(hello.indexOf(" "));
		System.out.println(hello.indexOf("    "));
		
		
		String my = "\tDear Sachin,\n\t This Java Course is Nice .\n\t Thanks";
		System.out.println(my);
		
	}

}
