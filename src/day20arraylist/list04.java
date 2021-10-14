package day20arraylist;

import java.util.ArrayList;
import java.util.List;

public class list04 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		
		list1.add(10);
		list1.add(20);
		list1.add(25);
		list1.add(505);
		list1.add(21);
		list1.add(57);
		
		List<Integer> list2 = new ArrayList<>();

		list2.add(147);
		list2.add(5);
		list2.add(600);
		list2.add(404);
		list2.add(202);
		list2.add(888);

		// how to join two list
		//all of the elements in the specified collection to the end of this list,
		// Return true if this list changed as a result of the call
		System.out.println(list1.addAll(list2));//true
		System.out.println(list2);
		System.out.println(list1);
		
		//how to delete all element from a list
		//System.out.println(list1.removeAll(list1));
		/*
		  	CLEAR==> Removes all of the elements from this list (optional operation).
      		The list will be empty after this call returns.
		 */
	//	list1.clear();
		
		System.out.println(list1);
		
		
	}

}
