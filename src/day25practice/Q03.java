package day25practice;

import java.util.Arrays;

public class Q03 {
	/*
	 * 	 7. Write a method that checks to see if the words u pass is Anagram. 
	 * EX: read and dear  --> true
	 */
	
	 static boolean isAnagram( String str1, String str2) {
		 //toCharArray
		 //split()
		 //1.way
//		 String[] arr1= str1.split("");
//		 String[] arr2= str2.split("");
//		 Arrays.sort(arr1);
//		 Arrays.sort(arr2);
//return Arrays.equals(arr1, arr2);

//2.way
char[] arr1 = str1.toCharArray();
char[] arr2 = str2.toCharArray();
Arrays.sort(arr1);
Arrays.sort(arr2);
return Arrays.equals(arr1, arr2);
		
	}
	
	public static void main(String[] args) {
		System.out.println(isAnagram("elbow","below"));
	}

}
