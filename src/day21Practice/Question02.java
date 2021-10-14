package day21Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
/*
  Write a Java program that reverse a sentence by using Array
        * (with all spaces and special characters)
        *
        * Input : Coding is greate.
        * Output : .etaerg si gnidoC
 */
		//1.way
//		String crr = "Coding is greate.";			
//			String res= reverse(crr);
//			System.out.println(res);
//		}
//		public static String reverse(String str) {			
//			String r = "";			
//			for(int i = str.length()-1; i>=0; i--) {
//				r += str.charAt(i);
//			}
//			return r;
	//2.way
//	String string = "Coding is greate.";
//		
//		char [] arr = new char[string.length()];
//		int count = 0;		
//		for (int i=string.length()-1; i>=0; i--) {			
//			arr[i] = string.charAt(count);
//			count++;
//		}		
//		System.out.println(Arrays.toString(arr));
		
		//3.way
//		String str ="Coding is greate.";
//		String arr[] = str.split("");		 
//		 for(int i=arr.length-1 ; i>=0; i--) {
//			 System.out.print(arr[i]);
//		 }
		 //4.way
		String str ="Coding is greate.";
		String rsvStr="";
		String arr[]=str.split("");
		for(int i=arr.length-1;i>=0;i--){
			rsvStr= rsvStr+arr[i];
			
		}
		System.out.println(rsvStr);
		 
		 //5.way
//		Scanner scanner = new Scanner(System.in);
//		System.out.println(“Enter String”);
//		String string = scanner.nextLine();
//		StringBuilder output = new StringBuilder(string).reverse();
//		System.out.println(output);
// 
		 
		 
		}
			}
