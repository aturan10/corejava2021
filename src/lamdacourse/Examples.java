package lamdacourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;



class edabit{
	public static String add(String str){
		return str.concat("Edabit");
	}
	public static boolean isWovel(String a){
		String aLower=toLowerCase(a);
		if(aLower.equals("a") || aLower=="e"||aLower=="i"||aLower=="u"||aLower=="o")
			return true;
		return false;
	}
	public static boolean isConssant(String a){
		String aLower=toLowerCase(a);
		if(aLower=="a" || aLower=="e"||aLower=="i"||aLower=="u"||aLower=="o")		
		return false;
		return true;
	}
	private static String toLowerCase(String a) {
		// TODO Auto-generated method stub
		return null;
	}
}

public class Examples {

	public static void main(String[] args) {
		Integer[] arr= {1,2,3,5,6,7,0};
		oneLarger(arr,3);
		anglesum(3);
		edabitAdder("mehmet");
		
	}
	//4)Write a function that returns true if there exists at least one number that is larger than or equal to n.
	public static boolean oneLarger(Integer[] arr, int n) {
		
		List<Integer> list = new LinkedList<>();
		Collections.addAll(list, arr);
		System.out.println(list.stream().anyMatch(t->t>n));
		return list.stream().anyMatch(t->t>n);
		
	}

	//3)Create a function that reorders the digits of each numerical element in an array based on ascending (asc) or descending (desc) order.
	public static void order(List<Integer> l) {
	l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	
	}

//1)Given an n-sided regular polygon n, return the total sum of internal angles (in degrees).
	public static void anglesum(Integer n) {
		List<Integer> list = new ArrayList<>();
		list.add(n);
		int anglesum=list.stream().reduce(0,((t,u)->t=(u-2)*180));
			System.out.println(anglesum);
	}
	//2)A student learning Java was trying to make a function. His code should concatenate a passed string name with string "Edabit" and store it in a variable called result. He needs your help to fix this code.
	public static void edabitAdder(String str) {
		List<String> list = new ArrayList<>();
		list.stream().map(edabit::add).forEach(System.out::println);
	}
	
	
	
}
