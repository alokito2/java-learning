package operators;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class labexception7 {
	public static void main(String[] args) {
		
//		7. Write a program that demonstrates the use of finally block in exception handling
//		by closing a file or printing a message after try-except execution.
		Scanner read = null;
		try {
			File file = new File("a.txt");
			read = new Scanner(file);
			
			if(read.hasNextLine()) {
				System.out.println("file reading "+read.hasNextLine());
			}
			
			
		}catch(FileNotFoundException fe) {
			System.out.println("Error : File Not Found!");
			fe.printStackTrace();
		}
		finally {
			if(read != null) {
				read.close();
				System.out.println("Scanner Closed Successfully");
			}
			System.out.println("Finally Block Run Successful");
		}
		
	}

}
