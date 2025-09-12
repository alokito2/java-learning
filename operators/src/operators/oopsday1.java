package operators;

import java.util.Scanner;

public class oopsday1 {
	 static String name;
	 static int age;
	
public  oopsday1(String n,int a) {
	oopsday1.name = n;
	oopsday1.age = a;
	
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		ClassName ObjName = new ClassName();
		oopsday1 obj = new oopsday1("sachin",18);
//		obj.name = "Sachin";
//		obj.age = 15;
		
		oopsday1 py = new oopsday1("python",5);
		System.out.println(obj);
	}

}
