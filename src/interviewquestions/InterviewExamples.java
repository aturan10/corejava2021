package interviewquestions;

import java.util.Arrays;

public class InterviewExamples {

	public static void main(String[] args) throws MyException {
		// {12,4,5,9,8,7,65,5,4,33,3,3,2}i=0
		int arr[] = { 12, 4, 5, 9, 8, 7, 65, 5, 4, 33, 3, 3, 2 };// j=1
		sorter(arr);
		repeater("alituran");
		System.out.println(fibonacci(13));
	}

//	Write a method that sorts an Array int[] without using the sort method.
	public static void sorter(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

//	Write a method that returns how many times each letter is repeated?
	public static void repeater(String str) throws MyException {
		String store2 = "";
		if(str instanceof String) {
		// String store="";
		 store2 = "";
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			counter = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					// store=store+str.charAt(i);
					counter++;
				}
			}
			if (!store2.contains(str.charAt(i) + ""))
				store2 = store2 + str.charAt(i) + "=" + counter+" ";
		}
	}else {
		throw new MyException("Please enter a string");
	}
		System.out.println(store2);
		}

//	Write a method that checks if word is palindrome. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801.
	public static boolean isPalindrome(String str) {
	
		
		
		
		return false;
		
	}

//	Write a method that returns nth fibonacci number on given a number num. In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...
	public static int fibonacci(int num) {
		int x=0;
		int y=1;
		int z;
		if(num==0) 
			return x;
		System.out.print(0+" ");
		for(int i=2;i<=num;i++) {
			z=x+y;
			x=y;
			y=z;
			System.out.print(x+" ");
		}
		return y;
	}

	
	
//	Write a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.EX: missingNumber([1, 2, 3, 4, 6, 7, 8, 9, 10])  5
//	Write a method that checks if the passing argument is a prime number.
//	Write a method that finds remainder of 2 numbers without using the % operator?

}

class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
	
}
