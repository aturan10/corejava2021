package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {

	/*
	 * 1) you can use multiple "cath blocks" for a single "try block"
	 * 2)if you use multiple "cath blocks", order the Exception Classes from child to parent, 
	 * 	 otherwise you will get compile time error
	 * 3) if you use multiple "cath blocks", you can get different message for every Exception
	 * 4)try-block cannot be used alone
	 * 5)When you type code if you get red underLine for Exceptions, that kind of Exceptions are called "checked Exception"
	 * 	 If you don't get any red underLine for some Exceptions, they are called "checked Exceptions"
	 * 	 FileNotException and IOException are "checked Exceptions"
	 */
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
		 fis = new FileInputStream("src/day27exceptions/TextFile01");
		 int i=0;
			while((i = fis.read()) !=-1) {
				System.err.print((char)i);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.err.println("I think the path is wrong or file does not exist... ");
			e.printStackTrace();//to get detailed error message use that one
			System.out.println(e.getMessage());//to get a short error message use that one
		}
		
		 catch (IOException e) {
			System.out.println("There are some issues to read the file..");
		}
		
		
	}

}
