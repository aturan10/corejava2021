package day11Practise;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		 Ask user for a string and print a new string made of 3 copies of the last 2 letters
The strings length will be at least 2.
ORNEK:
   INPUT      : Mustafa
   OUTPUT     : fafafa
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = scanner.next();
		String str = s.substring(s.length()-2);
		
				for(int i =1; i<4;i++) {
			System.out.print(str);
		}
		
		/*
		 * write a program to print a number entered by user,
		 * which are not divisible by 5 and devisible 5
		 */
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your number...");
//	    String s = scanner.next();
//	    
//	    s%5==0 ? ("numberis divisible by 5"):("number is not divisible by 5");
//	    System.out.println(s);
//	    if (s%5==0) {
//	    	System.out.println(s+" is  divisible by 5");
//	    	}
//	    
//	    else {System.out.println(s+" is not divisible by 5");}
//	    
	    
	    
		
	}

}
