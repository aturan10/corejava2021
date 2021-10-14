package day11Practise;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// ask user to enter an e-mail address
        // then if it contains "hotmail" replace it with "gmail"
        // e.g: johnbrown@hotmail.com ==> johnbrown@gmail.com
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your hotmail address...");
	    String email = scanner.next();
		if(email.contains("@hotmail")) {
			System.out.println(email.replace("@hotmail.com", "@gmail.com"));
		}else {
			System.out.println("Please enter correct hotmail address..");
		}
		
	}

}
