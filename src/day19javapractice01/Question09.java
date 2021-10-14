package day19javapractice01;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
		/*
		 * ask the user for an edge and height of an equilateral triangle
             * find the area and perimeter of the triangle
             * print on the console
		 */
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter triangles edge ");
//		int edge = scan.nextInt();
//		System.out.println("Enter triangles height");
//		int he = scan.nextInt();
//		System.out.println("area :"+(edge*he)/2);
//		System.out.println("perimeter :"+edge*3);
		
		//2.way
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the length the side of a triangle");
//		int a = scan.nextInt();
//		System.out.println("Enter the height the of a triangle");
//		int b = scan.nextInt();
//		
//		int area = (a*b)/2;
//		int per = 3 * a;
//		
//		System.out.println("Area is: " + area + " " + "Perimeter is: " + per);
		
		
		//3.way
	     Scanner scanner=new Scanner(System.in);
	        System.out.println("enter an edge of equilateral triangle");
	        double edge=scanner.nextDouble();
	        System.out.println("enter a height of equilateral triangle");
	        double h=scanner.nextDouble();
	        System.out.println(" perimeter of the triangle: "+ 3*edge);
	        System.out.println(" area of the triangle: "+ (h*edge)/2);
	
		
	}

}
