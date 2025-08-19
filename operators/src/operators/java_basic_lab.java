package operators;

public class java_basic_lab {
	boolean age;
	byte by;
	short sh;
	int in;
	long mob;
	float per;
	double doub;
	char charV;
	public static void main(String[] args) {
		// Q1

		byte b1 = 20;
		short s1 = 100;
		int i1 = 50;
		long l1 = 25005;
		float f1 = 20.15f;
		double d1 = 1252.252;
		char c1 = 'A';
		boolean bool = true;
		System.out.println("Q1");
		System.out.println("byte: " + b1);
		System.out.println("short: " + s1);
		System.out.println("int: " + i1);
		System.out.println("long: " + l1);
		System.out.println("float: " + f1);
		System.out.println("double: " + d1);
		System.out.println("char: " + c1);
		System.out.println("boolean: " + bool);

		// Widening conversions 
		int fromByte = b1;
		long fromInt = i1;
		float fromLong = l1;
		double fromFloat = f1;


		System.out.println("Widening");
		System.out.println("int (from byte): " + fromByte);
		System.out.println("long (from int): " + fromInt);
		System.out.println("float (from long): " + fromLong);
		System.out.println("double (from float): " + fromFloat);


		// Narrowing conversions (explicit casting)
		byte fromIntToByte = (byte) i1;
		int fromFloatToInt = (int) f1;
		float fromDoubleToFloat = (float) d1;
		char fromIntToChar = (char) i1;


		System.out.println("narrowing");
		System.out.println("byte (from int): " + fromIntToByte);
		System.out.println("int (from float): " + fromFloatToInt);
		System.out.println("float (from double): " + fromDoubleToFloat); 
		System.out.println("char (from int): " + fromIntToChar);

		// Converting char to int
		int charToInt = c1;
		System.out.println("int (from char): " + charToInt);

		
		
	    System.out.println();
		System.out.println("Q2");
		String FirstName="Sachin";
		String LastName="Patel";
		String City ="Mumbai";

		String d = FirstName +LastName + City;
		System.out.println(d);
		System.out.println(FirstName +" " +LastName+ " live in "+City);
		


	    System.out.println();
		System.out.println("Q3");

		java_basic_lab obj = new  java_basic_lab();
		System.out.println(obj.age);
		java_basic_lab obj1 = new  java_basic_lab();
		System.out.println(obj1.by);
		java_basic_lab obj2 = new  java_basic_lab();
		System.out.println(obj2.sh);
		java_basic_lab obj3 = new  java_basic_lab();
		System.out.println(obj3.in);
		java_basic_lab obj4 = new  java_basic_lab();
		System.out.println(obj4.mob);
		java_basic_lab obj5 = new  java_basic_lab();
		System.out.println(obj5.per);
		java_basic_lab obj6 = new  java_basic_lab();
		System.out.println(obj6.doub);
		java_basic_lab obj7 = new  java_basic_lab();
		System.out.println("[" +obj7.charV + "]");
		
		
	    System.out.println();
		System.out.println("Q4");
		int a = 10;
        int b = 3;
        float c = 4.5f;
        double d5 = 2.25;

        System.out.println("Arithmetic Operations:");

        // int and int
        System.out.println("a + b = " + (a + b));      
        System.out.println("a - b = " + (a - b));       
        System.out.println("a * b = " + (a * b));       
        System.out.println("a / b = " + (a / b));      

        // int and float
        System.out.println("a + c = " + (a + c));     
        System.out.println("b * c = " + (b * c));      

        // float and double
        System.out.println("c + d5 = " + (c + d5));      
        System.out.println("c / d5 = " + (c / d5));     

        // int and double
        System.out.println("a * d5 = " + (a * d5));     
        System.out.println("b - d5 = " + (b - d5));
        
        System.out.println();
        System.out.println("Q5");
        
        String s2 = " Hello I am sachin ";
        
        System.out.println(" To Uppercase : " + s2.toUpperCase());
        System.out.println(" To Lowercase : " +s2.toLowerCase());
        System.out.println("The Length of the sentence : " + s2.length());
        System.out.println("use of replace" +s2.replace(" ","*"));
        System.out.println(s2.charAt(5));
        
        
        System.out.println();
        System.out.println("Q6");
        
        int a1 = 10;
        int b3 = 3;
        double x = 5.5;
        double y = 2.0;
       
        System.out.println("a1 + b1 = " + (a1 + b3));
        System.out.println("a1 - b1 = " + (a1 - b3));
        System.out.println("a1 * b1 = " + (a1 * b3));
        System.out.println("a1 / b1 = " + (a1 / b3));
        System.out.println("a1 % b1 = " + (a1 % b3));

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
        
        
        
        System.out.println();
        System.out.println("Q7");
        
        float f5 = 5.5f;
        float f2 = 7.2f;
        char c3 = 'A';  
        char c2 = 'B'; 

        System.out.println("Is f1 == f2: " + (f5 == f2));
        System.out.println("Is f1 != f2: " + (f5 != f2));
        System.out.println("Is f1 > f2: " + (f5 > f2));
        System.out.println("Is f1 < f2: " + (f5 < f2));
        System.out.println("Is f1 >= f2: " + (f5 >= f2));
        System.out.println("Is f1 <= f2: " + (f5 <= f2));

        System.out.println(" Is c1 == c2: " + (c3 == c2));
        System.out.println("Is  c1 != c2: " + (c3 != c2));
        System.out.println("Is c1 > c2: " + (c3 > c2));
        System.out.println("Is c1 < c2: " + (c3 < c2));
        System.out.println("Is c1 >= c2: " + (c3 >= c2));
        System.out.println("Is c1 <= c2: " + (c3 <= c2));
        
        
        System.out.println();
        System.out.println("Q8");
        
        boolean b5 = true;
        boolean b6 = false;
        boolean b7 = true;

        System.out.println("Logical AND (&&):");
        System.out.println("b5 && b6 = " + (b5 && b6)); 
        System.out.println("b5 && b7 = " + (b5 && b7)); 

        System.out.println("\nLogical OR (||):");
        System.out.println("b5 || b6 = " + (b5 || b6));
        System.out.println("b5 || b7 = " + (b5 || b7)); 

        System.out.println("\nLogical NOT (!):");
        System.out.println("!b5 = " + (!b5)); 
        System.out.println("!b6 = " + (!b6));

        
        
		
		



	}

}
