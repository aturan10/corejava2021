package day18arraysmultidimensionalarrys;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
/*
 		How to check if a specific element exists in an array or not
 		1) Use sort()
 		2)Then use binarySearch()		
 */
		char crr[] = {'c', 'A', 'k', 'm'};
		//Check if 'x' exists incrr?
		//1.Step: use short()
		Arrays.sort(crr);//{A,c,k,m}
		
		//2.Step:
		System.out.println(Arrays.binarySearch(crr,'x'));//-5
		System.out.println(Arrays.binarySearch(crr,'e'));//-3
		System.out.println(Arrays.binarySearch(crr,'Z'));//-2
		System.out.println(Arrays.binarySearch(crr,'l'));//-4
		// If an element exists, it return the index ofbthe element
		System.out.println(Arrays.binarySearch(crr,'c'));//1



	}

}
