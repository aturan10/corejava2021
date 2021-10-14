package day11loops;

import java.util.Scanner;

public class FoLoop02 {

	public static void main(String[] args) {
/*
 * Type code to find the multiplication of the numbers from 1 to 10
 */
//	int prod=1;
//	for(int i=1;i<5;i++) {
//		prod=prod*i;
//	}
//	System.out.println(prod);
	
	/* interview question
	 * Ask user to enter a numberthe calculate the factorial of it
	 * 
	 * note:17! is greater than the maximum value of integer. Because of that
	 * 			if  you use int as data type in factoorial codes you can calculate 16! at most
	 * 
	 * Java created another class for huge whole numbers, it is BigDecimal but wer will learn later
	 */
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter an integer to calculate its factorial...");
	int num = scan.nextInt();
	long fact =1;
	if(num<0){
		System.err.println("Do not use negative numbers for factorial..");
	}else {	
	for(int i = num ; i>0 ; i--) {
		fact=fact*i;
	}
	System.out.println(num+"!="+fact);
	}
	
	
	
	
	}

}
