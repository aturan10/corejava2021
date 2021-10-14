package day07practice;

import java.util.Scanner;

public class AbsoluteNumIfElse {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else statement
		 Write a program to print absolute value of a number entered by user.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any number");
		int num = scan.nextInt();
		if(num>0) {
			System.out.println(num + " is absolute");
		}else
			System.out.println(-1*num + " is absolute");
		/* 2. way
		 * 
		 * Scanner sc=new Scanner(System.in);
		   System.out.println("Please enter number of minutes");
		   long minutes=sc.nextLong();
		   long years=minutes/(60*24*365);
		   long days=(minutes/60/24)%365;
		   System.out.println(days);
		   System.out.println(minutes+" minutes is approximately "+years+" and "+days+" days");
		}}*/
		
	

	}

}
