package day25encapsulation_review_interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestion02 {

	public static void main(String[] args) {
/*
  		  Ask user to enter 2 Strings.
		  If the characters and the numbers of characters of the Strings are same then print "Anagram" on the console.
		  Otherwise, print "Not Anagram" on the console.
		  Ignore cases.
		  For example; "Mary" and "army" and "RAMY" are Anagrams.
 */
		
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the 1st String ");
	        String str1 = scan.nextLine().toLowerCase();
	        System.out.println("Enter the 2nd String ");
	        String str2 = scan.nextLine().toLowerCase();
	        isAnagram(str1, str2);
	        
	        
	        
	        
	    }
	    
	    public static void isAnagram(String str1 , String str2) {
	        
	        String arr1[] = str1.split("");
	        Arrays.sort(arr1);
	        
	            
	        String arr2[] = str2.split("");
	        Arrays.sort(arr2);
	        
	        if(str1.isBlank() || str2.isBlank ()) {
	            
	            System.out.println("Not Anagram");
	            
	        }else if(Arrays.equals(arr1, arr2)) {
	            
	            System.out.println("Anagram");
	            
	        }else {
	            System.out.println("Not Anagram");
	        }
	        
	        
		
		
	}

}
