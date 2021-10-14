package day19javapractice01;

import java.util.Scanner;

public class Question06Java {

	public static void main(String[] args) {
/*
 * * ask user to enter a integer number
             * find the sum of digitnumber
             * example 345=12
 */

//Scanner scan = new Scanner (System.in);
//System.out.println("Enter a number...");
//int num = scan.nextInt();
//
//
//
//int sum =0;
//while (num!=0) {
//	sum = sum + num%10;
//	num=num/10;
//}
//System.out.println("the sum of all digits: " + sum);
		

//2.way
//Scanner scanner = new Scanner(System.in);
//System.out.println("Please enter a number");
//int number = scanner.nextInt();
//int digit = 0;
//int sum = 0;
//do {
//	digit = number % 10;
//	sum = sum+digit;
//	number = number/10;
//	
//} while (number!=0);
//
//System.out.println(sum);

//3.way
//Scanner scan = new Scanner(System.in);
//int a = scan.nextInt();
//int sum = 0;;
//do {
//	sum=sum + a%10;
//	a=a/10;
//}while(a!=0);
//System.out.println(sum);
//scan.close();

Scanner scanner;
//4.way
//Scanner scanner1 = new Scanner(System.in);
//System.out.println("Enter any integer to find the sum of its digits");
//int num=scanner1.nextInt();
//int sum=0;
//do {
//	sum=sum+num%10;
//	num=num/10;
//}
//
//while(num!=0); 
//	
//System.out.println(Math.abs (sum));
//
//scanner1.close();

//5.way
Scanner scan =new Scanner(System.in);
System.out.println("Please enter a three digits number");
int num = scan.nextInt();

int d1 =num%10;
int num1 = num/10;
int d2 = num1%10;
int d3= num/100;

System.out.println("Sum of the digits:" + (d1+d2+d3));

//6.way
System.out.println("please enter the a integer number");
int number=scan.nextInt();

int a=0;
int sum=0;      //   102/10=10
while(number>0) {
	
	a=number%10;
	sum=a+sum;
	
	number=number/10;
	
	
}
System.out.println("sum of digit "+sum);
scan.close();
	}

}
