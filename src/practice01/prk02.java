package practice01;

import java.util.Scanner;

public class prk02 {
	public static void main(String[] args) {
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		Scanner scan = new Scanner(System.in);
//		System.out.println("please enter double number");
//		double num = scan.nextDouble();
//		int num1 = (int) num;
//		System.out.println(num1);
		//
		int num=0;
		int a=0;
		int b=0;
		int c=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter three digits number");
		num = scan.nextInt();
		a=num%10;
		num=num/10;
		b=num%10;
		num=num/10;
		c=num%10;
		System.out.println(a+b+c);
		
}
}