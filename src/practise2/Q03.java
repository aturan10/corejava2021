package practise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
/*
 	Write a program that finds the repeating letters in the text we receive from the user.
       *
       * Step 1: Let's ask the user to enter some text.
       * Step 2: Let's compare all letters with other letters.
       * Let's use nested for loops for this.
       * Step 3: Let's compare the letters in the inner for loop.
       * If there is equality, it means repeating. Let's print it to the screen.
       *
       * Hint : When printing repetitive letters on the screen, be careful not to print them several times.
       * create a List<Character> Pre-FoundLetters and insert the letters you find.
       * If the letter is already printed on the screen, do not print it on the screen.
       *
       * Hint 2: To not print the space character " " (letter != ' ') if it is not equal to space
       You can use the * condition.
 */
//		public static void repeatedChars(String str) {
//			for(int i = 0; i< str.length();i++) {
//				
//				if (str.indexOf(i)!=str.lastIndexOf(i)) {
//					System.out.println(i + " ");
//				}
//			}
//			
//		}

//		static List<Character> repeatedFinder(String str) {
//			List<Character> repeatedList = new ArrayList<>();
//			for (int i = 0; i < str.length(); i++) {
//				for (int j = i + 1; j < str.length(); j++) {
//					if (str.charAt(i) == str.charAt(j) && !repeatedList.contains(str.charAt(i)) && str.charAt(i) != ' ') {
//						repeatedList.add(str.charAt(i));
//					}
//				}
//			}
//			return repeatedList;
//	}
		
//		public static void main(String[] args) {
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("Please enter a string");
//			String string = scanner.nextLine();
////			System.out.println(string);
//			repeatedChars(string);
//		}
//		
		
//		public static void repeatedChars(String str) {
//			ArrayList<Character> list = new ArrayList<>();
//			
//			for(int i = 0; i< str.length();i++) {
////				System.out.println(str.charAt(i));
//				
//				if (str.indexOf(str.charAt(i))!=str.lastIndexOf(str.charAt(i))) {
//					if(!list.contains(str.charAt(i))) {
//						list.add(str.charAt(i));
//	​
//					}
//				}
//			}
//			
//			System.out.println(list);
//			
//		}	
		
		List<Character> repatingElement=new ArrayList<>();
		   Scanner scan=new Scanner(System.in);
			
		   System.out.println("please enter a string for find the repating element");
		   String str=scan.nextLine();
		   char[] chars=str.toCharArray();
		   System.out.println("repating elements are:");
		   for(int i=0;i<str.length();i++) {
			   for(int j=i+1;j<str.length();j++) {
				   if(chars[i]==chars[j]) {
					  
					   if(chars[i]!=' ' && !repatingElement.contains(chars[j])) {
						   repatingElement.add(chars[j]);
						   System.out.println("repating elements are "+chars[j]);
						   break;
						  
					   }
					  
					  
				   }
				  
				  
				  
			   }
			  
			  
		   }
		
		
		
	}

}
