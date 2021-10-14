package interviewquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 	 *15 Minutes Mountain Array ==> [0, 2, 5, 3, 1] It is constantly increasing to
	 * the maximum value, decreasing constantly after the maximum value
	 *
	 * Not Mountain Array ==> [5, 2, 7, 1, 4] It is decreasing then increasing to
	 * the maximum value, decreasing and increasing after the maximum value
	 *
	 * Create a method to check if it is Mountain Array or not. Use as possible as
	 * Functional Programming
 */
/*
 	Solution Steps:
	 	1)Find the element whose value is maximum
	 	2)From first element to maximum element, elements should be in ascending order
	 	3)From the maximum element to last element, elements should be in descending order
 */

public class Iq06 {

	public static void main(String[] args) {

checkArrayToBeMountain();

}

public static void checkArrayToBeMountain() {
	
	int a[] = { 0, 2, 5, 3, 1 };
	
			//1.Step
	//Create a list
	List<Integer> list = new ArrayList<>();
	//Add all array elements into the list
	Arrays.stream(a).forEach(t->list.add(t));
	//Find the maximum element in the list
	int max = list.stream().reduce(Integer.MIN_VALUE, Math::max);
	//Find the index of Maximum element
	int idxOfMax = list.indexOf(max);
	
	System.out.println(max);//5
	System.out.println(idxOfMax);//2
	
	//2.Step
			//Get the first part ==> Sort the elements of first part in ascending order  ==> Compare the sorted list with the original list
			List<Integer> part1List = new ArrayList<>();
			list.stream().filter(t-> list.indexOf(t) <= idxOfMax).forEach(t->part1List.add(t));
			System.out.println(part1List);
			
			List<Integer> sortedPart1List = new ArrayList<>();
			part1List.stream().forEach(t->sortedPart1List.add(t));
			Collections.sort(sortedPart1List);
			System.out.println(sortedPart1List);
			
			boolean isTheFirstPartOk = part1List.equals(sortedPart1List);
			System.out.println(isTheFirstPartOk);
			
									//3.Step
			//Get the second part ==> Sort the elements of second part in ascending order  ==> Compare the sorted list with the original list
			List<Integer> part2List = new ArrayList<>();
			list.stream().filter(t-> list.indexOf(t) >= idxOfMax).forEach(t->part2List.add(t));
			System.out.println(part2List);
			
			List<Integer> sortedPart2List = new ArrayList<>();
			part2List.stream().forEach(t->sortedPart2List.add(t));
			Collections.sort(sortedPart2List);
			Collections.reverse(sortedPart2List);
			System.out.println(sortedPart2List);
			
			boolean isTheSecondPartOk = part2List.equals(sortedPart2List);
			System.out.println(isTheSecondPartOk);
			
			//Decide if it is Mountain Array or not
			if(isTheFirstPartOk && isTheSecondPartOk) {
				System.out.println("The array is mountain array");
			}else {
				System.out.println("The array is not mountain array");
				}}}