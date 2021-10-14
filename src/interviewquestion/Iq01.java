package interviewquestion;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Iq01 {

	// Create a method to reverse given String
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to Reverse...");
		String str = scan.nextLine();
		
		System.out.println(reverseString(str));

	}
	
	public static String reverseString(String str) {
		
	//1.Way:Using StringBuilder
//		StringBuilder strB =new StringBuilder();
//		strB.append(str);
//		return strB.reverse().toString();
	//2.Way Using loop
//		String rev ="";
//		for(int i =str.length()-1;i>=0;i--) {
//			rev=rev+str.charAt(i);
//		}
//		return rev;
		
	//3.Way: Using Functional Programing
		//split("")==> flatMap()==> sort() in reverse order ==> print by using forEach()
		String arr[] = str.split("");		
		java.util.List<String> list = Arrays.stream(arr).collect(Collectors.toList());		
		Collections.reverse(list);		
		list.forEach(System.out::print);		
		return  "";
		
	}

}
