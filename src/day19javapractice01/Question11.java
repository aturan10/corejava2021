package day19javapractice01;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		/*Write a program in Java to input 5 numbers from keyboard and find their sum and average.
		EXAMPLE:
		       INPUT     : 
		Input the 5 numbers :                                                           
		1                                                                               
		2                                                                               
		3                                                                               
		4                                                                               
		5             
		    OUTPUT :
		The sum of 5 no is : 15                                                         
		The Average is : 3.0
		*/
	/*	Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 number");
        System.out.print("1. number is =");
        double a = scan.nextDouble();
        System.out.print("2. number is =");
        double b = scan.nextDouble();
        System.out.print("3. number is =");
        double c = scan.nextDouble();
        System.out.print("4. number is =");
        double d = scan.nextDouble();
        System.out.print("5. number is =");
        double e = scan.nextDouble();
        
        System.out.println("The sum of 5 no is :" + (a+b+c+d+e));
        System.out.println("The Average is :" + (a+b+c+d+e)/5);
       */ 
		
		//2.Way
//		Scanner scan = new Scanner(System.in);
//        System.out.println("Enter 5 number");
//        System.out.print("1. number is =");
//        double a = scan.nextDouble();
//        System.out.print("2. number is =");
//        double b = scan.nextDouble();
//        System.out.print("3. number is =");
//        double c = scan.nextDouble();
//        System.out.print("4. number is =");
//        double d = scan.nextDouble();
//        System.out.print("5. number is =");
//        double e = scan.nextDouble();
//        
//        System.out.println("The sum of 5 no is :" + (a+b+c+d+e));
//        System.out.println("The Average is :" + (a+b+c+d+e)/5);
        
        //3.way
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter five numbers");
//        int n1 = scan.nextInt();
//        int n2 = scan.nextInt();
//        int n3 = scan.nextInt();
//        int n4 = scan.nextInt();
//        int n5 = scan.nextInt();
//        int sum = n1+n2+n3+n4+n5;
//        int grade = sum/5;
//        System.out.println("The sum of 5 no is: " + sum);
//        System.out.println("The average of 5 no is: " + grade);
        
		// 4.way
		 Scanner scan = new Scanner(System.in);
         System.out.println("Enter five numbers");
         int sum =0;
         double grade = 0.0;
         for(int i =1; i<6;i++) {
        	 System.out.println("Enter your number"); 
        	 int x =scan.nextInt();
        	 System.out.println(i+". number is="+x);
        	 sum=sum+x;
        	 grade=sum/i;
         }
        System.out.println("The sum of 5 no is: "+sum);
        System.out.println("The average of 5 no is: " + grade);
	}

}
