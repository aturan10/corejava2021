package day19javapractice01;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		/*
		 0)Ask user to enter two integers
               1)Swap the integers
               2)EXAMPLE:
                INPUT: a= 3
                       b= 5
                OUTPUT: a= 5
                        b= 3
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = 0;
		c=c+a;
        a = b;
        b = c;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        
//        System.out.println("before swap: "+"a"+a+" b"+b);
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("After swap: "+"a"+a+" b"+b);

	}

}
