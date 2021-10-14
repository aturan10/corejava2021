package day21listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {

		List<Character> list1 = new ArrayList<>();
		list1.add('x');
		list1.add('z');
		list1.add('a');
		list1.add('m');
System.out.println(list1);
		
//use for-loop
		for(int i=0; i<list1.size();i++) {
			System.out.print(list1.get(i)+"!");
}
		System.out.println();
//use for-each loop
		for(Character w: list1) {
			System.out.print(w+"!");
		}
		System.out.println();
		// if the characters are not vowel in the list printthem on the concole.
		for(Character w: list1) {
if(w=='a'||w=='e'||w=='i'||w=='o'|| w=='u') {
	continue;
}
System.out.print(w+"!");
		}
		//Print the ASCII values of all characters on the console
		for(Character w: list1) {
			System.out.println(w+":"+(int)w+"-");
		}
		
		//Find the sum of all ASCII values of the characters inside the list
		int sum=0;
		for(Character w:list1) {
			sum=sum+w;
		}
		System.out.println("The sum ofthe ASCII values:"+sum);
		
		//Print the characters whose ASCII values are even
		for(Character w:list1) {
			if(w%2==0) {
				System.out.println(w+" ");
			}
				
			}

		//If you see any character whose ASCII value is less than 100 stop printing nad give an error massage
		
		Character flag=' ';
		for(Character w:list1) {
if (w<100) {
	flag = w;
	break;
}
System.out.println(w);
		}
		System.out.println(flag+"has ASCII less then 100");
		
		//Arrays can use for-each loop as well
		
		String s[] = {"Ali","Can","Hassan","Ekrem"};
		for(String w: s) {
			if (!w.endsWith("n")) {
				System.out.println(w+" ");
			}
		}
		
		
		
	}

}
