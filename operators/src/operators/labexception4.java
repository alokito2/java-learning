package operators;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class labexception4 {
	public static void main(String[] args) {

//		4. Develop a program that opens a file and reads its content.
//		Handle the case when the file does not exist.
		try {
			File file = new File("a.txt");
			Scanner fileReader = new Scanner(file);
			
			while(fileReader.hasNextLine()) {
				System.out.println(fileReader.nextLine());
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thanks");
	}

}
