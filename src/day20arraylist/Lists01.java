package day20arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
		//From an integer list find the closest two elements

		List<Integer> list1 = new ArrayList<>();
				list1.add(2);
				list1.add(153);
				list1.add(31);
//				list1.add(281);
//				list1.add(114);
//				list1.add(16);
//				list1.add(67);
//				list1.add(359);
//				list1.add(120);
//				list1.add(168);
//				list1.add(128);
		System.out.println(list1);		//[2, 153, 31, 281, 114, 16, 67, 359, 120, 168, 128]
		
		List<Integer> list2 = new ArrayList<>();
	
		for(int i=0;i<list1.size();i++) {
			for(int k=i+1;k<list1.size();k++) {
				list2.add(Math.abs(list1.get(i)-list1.get(k)));
			}
		}
		System.out.println(list2);	
		
		Collections.sort(list2);
		System.out.println(list2);
		System.out.println(list2.get(0));		
	}

}
