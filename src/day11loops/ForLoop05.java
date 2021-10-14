package day11loops;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
/*
 * Create the following image by getting the number of rows from user
		 				 .
		                 .
		              * * * *
		               * * *
		                * *
		                 *
 */Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the length of the base...");
	int len = scanner.nextInt();
	for(int i=len; i>0; i--) {
		for(int j=0; j<len-i; j++) {				
			System.out.print(" ");				
		}
		for(int k=len; k>len-i; k--) {				
			System.out.print("* ");				
		}			
		System.out.println();			
	
	}}}
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the lenght of base..");
//		int len = scanner.nextInt();
//		
//		for(int i=len;i>0;i--) {
//			for(int j=0;j<len-1;j++) {
//				System.out.print(" ");
//				for(int k=len; k>) {
//					
//				}
//				System.out.println();
//			}
//		}
//		
		

