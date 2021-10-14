package practice01;

import java.util.Scanner;

public class Maaamaaa {

	public static void main(String[] args) {
/*
 		Ask user Name, Surname and credit card numbers than convert it to special form.
 		 (Initials for name and surname should be uppercase)
(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

Input :

John White 1234234534561478

Output :

Name : J*** W****

CCN : * * ** 1478
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String first = scan.nextLine().toUpperCase();
		System.out.println("Enter your last name");
		String last = scan.nextLine().toUpperCase();
		System.out.println("Enter your full credit card number");
		String num = scan.next();
		if(num.length()!=16) {
			System.out.println("Invalid credit card number");			
		}else {
			String convertedFirst =first.charAt(0)+"***";
			System.out.print("Name:"+convertedFirst+" ");
			String convertedLast =last.charAt(0)+"****";
			System.out.println(convertedLast);			
			String convertedNum = "**** **** **** "+num.substring(12);
				System.out.println(num);
			System.out.println("CCN :"+convertedNum);	
		}		
	}
}
