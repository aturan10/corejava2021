package day19arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class Lists01 {

	public static void main(String[] args) {
/* 
 	ArrayLists are flexible with their size
 	ArrayLists cannot store multiple data type
 	ArrayLists store non primitive data type
 */
		//How to create a list
		//1.Way
		ArrayList<Integer> list = new ArrayList<>();
		
		// to print the list on the console ; just place the name of the list in the System.out.prinln()
		
		System.out.println(list);//[]
		
		//How to add elements into a list
		
		list.add(12);
		list.add(5);
		list.add(30);
		System.out.println(list);//[12, 5, 30]

		list.add(0, 8);

		System.out.println(list);//[8, 12, 5, 30]
		
		Collections.sort(list);// we use collections to sort in ascending order
		System.out.println(list);	//[5,8,12,30]
		
		// How to get specific element from list
		System.out.println(list.get(2));
		
		//System.out.println(list.get(4));//IndexOfBoundsException bc there is no index 4
		
		list.add(25);
		list.add(45);
		list.add(19);
		list.add(-5);
		list.add(128);
		
		System.out.println(list);
		
		/*
		 		type a code to find and print the min and max elements from list
		 */
		
		Collections.sort(list);
		System.out.println(list);//[-5, 5, 8, 12, 19, 25, 30, 45, 128]
		int min = list.get(0);
		int max = list.get(list.size()-1);
		System.out.println("min value is "+min+"===="+"max value is "+max);

		// how to check if the list is empty or not
		System.out.println(list.isEmpty());//false
		ArrayList<String>list2 = new ArrayList<>();
		System.out.println(list2.isEmpty());//true
		
		//how remove elements from a list
		
		//by index
		list.remove(5);//index the index of the element to be removed
		System.out.println(list.remove(5));//the element that was removed from the list
		System.out.println(list);
		
		list.remove(list.indexOf(5));
		System.out.println(list);
	
		list2.add("Ali");
		list2.add("Veli");
		list2.add("John");
		list2.add("Ayse");
		list2.add("Can");
		
		System.out.println(list2);//[Ali, Veli, John, Ayse, Can]
		
		list2.remove(list2.remove("Ali"));
		System.out.println(list2);

	}
	

}
