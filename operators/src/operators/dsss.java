package operators;
import java.io.*;
public class dsss {
	public static void main(String[] args) {
		int a =10, b = 3, x =20;
		int re = a/b;
		System.out.println("result : " + (3>>2));
		x += 5;
	    System.out.println("After += 5: " + x);

	    x -= 3;
	    System.out.println("After -= 3: " + x);

	    x *= 2;
	    System.out.println("After *= 2: " + x);

	    x /= 4;
	    System.out.println("After /= 4: " + x);
	    
	    // non primitive
	    
	    System.out.println("non primitive");
	    String emo = "😀😃😄";
	    String add = "to kaise ho aap log 1234 , dhdh";
	    System.out.println(add);
	    add ="hello, everyone";
	    System.out.println(add);
	    
	    
	    System.out.println("operation with string");
	    add += "sachin";
	    System.out.println(add);
	    System.out.println(add.length());
	    
	    System.out.println("*str index count*");
	    String ram="hello bhai , hello";
	    System.out.println(ram.indexOf('o'));
	    System.out.println(ram.indexOf("hello"));
	    System.out.println(ram.lastIndexOf('h'));
	    System.out.println(ram.lastIndexOf("hello"));
	    
	    System.out.println("charAt");
	    System.out.println(ram.charAt(10));
	    
	    // stsrtwith  endwith
	    
	    System.out.println(ram.startsWith("hello"));
	    System.out.println(ram.endsWith("hello"));
	    
	    // trim
	    String ra ="        hello , worlrd      ";
	    System.out.println(ra);
	    System.out.println(ra.trim());
	    
	   // equal
	    String  aadd = "sachin";
	    String rao = "Patel";
	    System.out.println(aadd.equals(rao));
	    
	    
	    aadd ="sachin";
	    rao ="SaChin";
	    System.out.println(aadd.equalsIgnoreCase(rao));
	    // compare
	    
	    add = "mno";
	    String sub = "xyz";
	    System.out.println(add.compareTo(sub));
	    
	    // concate
	    
	    add = "Sachin";
	    sub = "Patel";
	    System.out.println(add.concat(" "+ sub));
	    
	    // to check content of str
	    
	    add ="";
	    System.out.println(add.isBlank());
	    
	    
	    add =" ";
	    System.out.println(add.isEmpty());
	    
	    add ="";
	    System.out.println(add.isEmpty());
	    
	    // replace - to replace a char / word
	    
	    add = "Hello I am Sachin Patel and I am Learning java ";
	    System.out.println(add.replace('a', 'A'));
	    System.out.println(add.replace("I am ", "I'm "));
	    
	    
	    //
	    System.out.println(add.toUpperCase());
	    System.out.println(add.toLowerCase());
	    
	    //split
	    add ="Apple,Cherry,Melons,Grapes";
	    String[] splt = add.split(","); // regex - re
	    for(String s : splt) {
	    	System.out.println(s);
	    	
	    }

	    }
	    
	    
	    
	}


