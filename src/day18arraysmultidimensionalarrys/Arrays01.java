package day18arraysmultidimensionalarrys;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
/*
 	1)Create an integer array together with user
 	2)Type code to print minimum and maximum elements
 */
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the length of the array to create an integer array...");
	
	int len = scanner.nextInt();
	int arr[] = new int[len];
	int numOfEl = 1;
	do {
		System.out.println("Enter " + numOfEl+ ". element");
		arr[numOfEl-1] = scanner.nextInt();		
		numOfEl++;		
	}while(numOfEl<=len);
	int brr[] = arr;
	System.out.println(Arrays.toString(arr));
	
	// To get min and max elements From an array use sort()
	/*
	 	Note: String are immutable, it means when you use String methods,
	 	 	  the value of the String does not change
	 		  Arrays are mutable, it means Arrays methods are able to change 
	 		  the arrays as you can see in the sort() below
	 */
	Arrays.sort(arr);
	System.out.println("Array after sort: "+Arrays.toString(arr));//[11, 13, 12]
	System.out.println("minimum Element:"+arr[0]);
	System.out.println("maximum Element:"+arr[arr.length-1]);
	
	System.out.println("Array before sort: "+Arrays.toString(brr));
	}

}
