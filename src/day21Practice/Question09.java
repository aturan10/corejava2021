package day21Practice;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
/*
 * Write a program that accepts an integer as input
    and creates a random integer which
    less than input and prints the sum of it's digits
    example:
            INPUT     : 2548                 
        OUTPUT :   Random Integer = 1324
                    I created 1324 and sum of it's digits is =10
 */
		Scanner scanner = new  Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scanner.nextInt();
		
		int random = (int)(Math.random() * num);
		
		System.out.println("Your integer is " + num);
		System.out.println("Random integer is " + random);
		int digit = 0, sum = 0;
		while (random!=0) {
			digit = random%10;
			sum+=digit;
			random = random/10;
		}
		System.out.println(sum);	
	}
	}