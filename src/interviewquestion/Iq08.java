package interviewquestion;

import java.util.Scanner;

public class Iq08 {
/*
 	Ebay Interview Questions
	 	Get a String and a character from user 
	 	Count the number of characters between the first occurence and the last occurence of the given character in the String
	 	Do not count the space characters
	 	If the character which user selected is displayed just once in the String return -1
	 	If the character which user selected does not exist in the String return -1
	 	For example; "Java is easy" - 'a' ==> 5
	 	             "Java is easy" - 'w' ==> -1
	 	             "Java is easy" - 'e' ==> -1
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String...");
		String str = scan.nextLine();
		
		countCharsBetweenOccurences(str, "e");

	}
	
	public static int countCharsBetweenOccurences(String str, String c) {
		
		int idxFirstOccurence = str.indexOf(c);
		int idxLastOccurence = str.lastIndexOf(c);
		int counter = 0; 
		
		if(idxFirstOccurence == idxLastOccurence) {
			System.out.println("Between the first occurence and last occurence of " + c + " there are " + counter + " chars different from space" );
			return -1;
		}else {
			
			for(int i=idxFirstOccurence+1; i<idxLastOccurence; i++) {
				
				if(str.charAt(i)!=' ') {
					counter++;
				}
				
			}
			
			
		}
		
		System.out.println("Between the first occurence and last occurence of " + c + " there are " + counter + " chars different from space" );
		
		return counter;
	
	}

}