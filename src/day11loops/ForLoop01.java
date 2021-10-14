package day11loops;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
// Type program to find the sum of the integers from 1 to 100
//		int sum = 0;
//		for(int i =1;i<101;i++){	
//		sum = sum+i;	
//		}
//		System.out.println("sum:" + sum);
//		
		
		/*
		 * ask user to enter starting and ending value,
		 * then find the sum of all integers from the starting to the ending value
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your starting number");
		int num1 = scan.nextInt();
		System.out.println("enter your ending number");
		int num2 = scan.nextInt();
		int sum=0;
		if(num1>num2) {
			System.err.println("Starting value should be greater than ending value");
		}else {
		for(int i =num1;i<=num2;i++){	
			sum = sum+i;	
			}
			System.out.println("sum:" + sum);
	}}}
