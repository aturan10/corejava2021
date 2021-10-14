package day21Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
/*
 * Ask the user for an integer less than 100
          A method that returns to the user whether
          it is in a predefined array or not. write
        *
        * Array={3,5,21,32,34,45,56,57,76,87,95}
        *
        * Input : 5 Output: The number you entered is in the Array
        * Input : 15 Output: The number you entered is not in the Array
        *
 */
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please put the integeer number");
//		int num = scan.nextInt();
//		int Array[] = {3,5,21,32,34,45,56,57,76,87,95};
//		Array.sort[11];
//		(Arrays.binarySearch(Array, num))==true ? "The number you entered is in the Array":"The number you entered is not in the Array";
//		
	//2.way
//		int[] arr = {3,5,21,32,34,45,56,57,76,87,95};
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please enter an integer");
//		int num = scanner.nextInt();
//		
//		if (Arrays.asList(arr).contains(num)) {
//			System.out.println("The number is in array");
//		} else {
//			System.out.println("The number is not in array");
//		}
		//3.way
//		 int[]A=new int[]{3,5,21,32,34,45,56,57,76,87,95};
//         System.out.println("Enter a number less than 100.");
//         Scanner scan=new Scanner(System.in);
//         int num=scan.nextInt();
//         if(Arrays.binarySearch(A, num)<0) {
//             System.out.println("The number is not in the list.");
//         }else System.out.println("The number is in the list.");
//        
         //4.way
		int[] arr = {3,5,21,32,34,45,56,57,76,87,95};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int num = scanner.nextInt();
		System.out.println(num);
		for (int i = 0; i<arr.length; i++){
			if (arr[i] == num) {
				System.out.println("The number is in array");
			}
		}
		System.out.println("The number is not in array");
	}

}
