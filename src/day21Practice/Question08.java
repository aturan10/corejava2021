package day21Practice;

import java.util.Arrays;

public class Question08 {

	public static void main(String[] args) {
/*
 *  write a method that accepts an integer array as input and prints the minimum
            * and the maximum numbers from given array
            *
            *
            * Input : {3,2,5,4,1,6}
            * Output : min: 1 max : 6
            *
            *
 */
				int numbers[] = {100, 40, 4};				
				convert(numbers);
			}
			public static void convert(int[] numbers) {
				
				Arrays.sort(numbers);
				System.out.println(Arrays.toString(numbers));
				
				int min = numbers[0];
				int max = numbers[numbers.length-1];
				
				System.out.println("Minimum is: "+min + "   Max is: "+ max);
			}
}