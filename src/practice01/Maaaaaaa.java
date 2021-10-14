package practice01;

import java.util.Scanner;

public class Maaaaaaa {

	public static void main(String[] args) {
//		Create 2 words : name1 and name2
//      if the name1 has even numbers of characters,
//      then insert the second word in the middle of the first name  if the first word has odd numbers
//      Then print the “Name2 cannot be inserted in the name1”
//      e.g:
//      name1= mehmet
//      name2= ahmet
//      Print ==> mehahmetmet
//	Scanner scan =new Scanner(System.in);
//		System.out.println("Eneter your first name");
//		String first = scan.next();
//		System.out.println("Eneter your second name");
//		String second = scan.next();
		String first = "mehmet";
		String second = "ahmet";
		
	if(first.length()%2==0) {
		System.out.println(first.substring(0,3)+second+first.substring(3));
	}else {
		System.out.println(first);
	}	
	}
}
//String status = " I am hungry";
//System.out.println(status);
//
//String please = " When is break ";
//
//System.out.println(please);