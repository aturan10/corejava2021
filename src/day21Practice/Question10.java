package day21Practice;
		import java.util.Random;
		import java.util.Scanner;
		public class Question10 {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				/*
				 Write a program that accepts an integer as input
		and creates a random integer which
		less than input and prints the sum of it's digits
		example:
		    INPUT      : 2548
		    OUTPUT :    Random Integer = 1324
		                I created 1324 and sum of it's digits is =10
				 */
				
				
				Scanner scan=new Scanner(System.in);
				System.out.println("please enter the a number");
				int num=scan.nextInt();
				
				Random random=new Random();
				
				int randomNum=random.nextInt(num);
				System.out.print("randomNum is "+randomNum);
				
				
				
				
				
				int digit = 0, sum = 0;
				while (randomNum!=0) {
					digit = randomNum%10;
					sum+=digit;
					randomNum = randomNum/10;
				}
				
				System.out.println(sum);
				
			}
		//Ramdom random=new Random();
		}