package interviewquestion;

import java.util.ArrayList;
import java.util.List;

public class Iq10 {
/*
  	We are organizing a horse race with horses having distinct strengths.
	 	The strength of the horses is represented by an array of integers.
	 	In order to make the race competitive, your program should find out the pair of horses with similar strengths:
         For example: {3, 67, 9, 46, 55, 48}
         Output: 46, 48
 */
	public static void main(String[] args) {

int a[] = {47, 67, 9, 46, 55, 48};
		
		getClosestPairs(a);
	}
	public static void getClosestPairs(int a[]) {
		
		List<Integer> r = new ArrayList<>();
		List<String> s = new ArrayList<>();
		
		for(int i=0; i<a.length; i++) {			
			for(int k=i+1; k<a.length; k++) {				
				r.add(Math.abs(a[i]-a[k]));
				s.add(i+""+k);				
			}	
		}
		
		System.out.println(r);
		System.out.println(s);
		
		int minValue = r.stream().reduce(Integer.MAX_VALUE, Math::min);
		System.out.println(minValue);
		
		int idxOfMinDiff = r.indexOf(minValue);
		System.out.println(idxOfMinDiff);
		
		String el = s.get(idxOfMinDiff);
		System.out.println(el);
		
		int firstEl = a[Integer.valueOf(el.substring(0,1))];
		int secondEl = a[Integer.valueOf(el.substring(1,2))];
		
		System.out.println(firstEl + " " + secondEl);
	}
}