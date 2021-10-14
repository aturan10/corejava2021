package day22practise;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

		//9. Write a method that accepts an Array of integers and returns the max.
		//10. Write a method that accepts an Array of integers and returns the second max.
		//11. Write a method that accepts an Array of ints returns the sorted Array in ascending order.Do not use the sort method.
		Scanner scan = new Scanner(System.in);
		System.out.println("enter Number");
		int num = scan.nextInt();
		int i=num;
		int count =0;
		while(i>0){
		 if(num%i==0){
		  count++;   
		 }
		 i--;
		 }
		if(count>=3){
		  System.out.println(num+" is Perfect Number");
		}else{
		  System.out.println(num+" is not Perfect Number");
		}

		
		
	}

}
