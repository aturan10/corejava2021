package practice01;

import java.util.Scanner;

public class Haaa {

		public static void main(String[] args) {
			
			/*
			    Write a Java program to find the number of days in a month.(Use Switch Case) (Interview Question / Leak Year)

    Sample:

      INPUT:

    Input a month number: 2

    Input a year: 2016

      OUTPUT  :

    February 2016 has 29 days
			 */
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter mounth");
			String m = scan.next();
			System.out.println("Enter the number of year");
			int y = scan.nextInt();
			if(y%4!=0){
				System.out.println("Not leak year");
		}else {
			System.out.println("This is leak year");
			switch (m) {
				case "January":
					System.out.println("January"+y+"has 31 days");
					break;
				case "February":
					System.out.println("February"+y+"has 29 days");
					break;
				case "March":
					System.out.println("March"+y+"has 31 days");
					break;
				case "April":
					System.out.println("April"+y+"has 30 days");
					break;
				case "May":
					System.out.println("May"+y+"has 31 days");
					break;
					case "June":
						System.out.println("June"+y+"has 30 days");
						break;
					case "July":
						System.out.println("July"+y+"has 31 days");
						break;
					case "August":
						System.out.println("August"+y+"has 30 days");
						break;
					case "September":
						System.out.println("September"+y+"has 31 days");
						break;
					case "October":
						System.out.println("October"+y+"has 30 days");
						break;
					case "November":
						System.out.println("November"+y+"has 31 days");
						break;
					case "December":
						System.out.println("December"+y+"has 30 days");
						break;	
	}
		}
}}
