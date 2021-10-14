package lamdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalPrograming01 {

	
	/*
	  1)Lambda is Functional Programming
	  2)Functional Programing was added to JAva in Java 8, before Java 8 we were using just
	  	Structured Programing but after Java 8 we are able to use both Functional Programing and
	  	Structured Programing
	  3)Structured Programing focuses on "How to do" must of the times FUnctinoal Programing focused
	  	"What to do"
	  4)Functional Programing is used with Collections, and Arrays
	 */
	
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(9);
        l.add(131);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);  
        PrintElStructured(l);
        System.out.println();
        PrintElStructured(l);
        System.out.println();
        printEvensStructured(l);
        System.out.println();
        printEvensStructured(l);
        System.out.println();
        printSquareOfOdds(l);
        System.out.println();
        printCubeOfDistinctOdds(l);
        System.out.println();
        sumOfSquareDistinctEvens(l);
        System.out.println();
        productOfCubeDistinctEvens(l);
        System.out.println();
        getMaxElement(l);
        System.out.println();
        getMinElement(l);
        System.out.println();
        getMaxElement2(l);
        System.out.println();
        getMinElement2(l);
        System.out.println();
        getMinGreaterThenSevenEven1(l);
        System.out.println();
        getMinGreaterThenSevenEven2(l);
        System.out.println();
        getHalfOfDistinctElReversed(l);
        
        
	}
	
	//1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.
		//(Structured)
	private static void PrintElStructured(List<Integer> l) {
		l.stream().forEach(t->System.out.print(t+" "));
		
	}

	//1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.
	//(Structured)
	public static void printElStructured(List<Integer> l) {
		for(Integer w : l) {
			System.out.print(w+" ");
		}
	}
	
	//2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Structured)
	
	public static void printEvensStructured(List<Integer> l){
		for(Integer w:l) {
			if(w%2==0) {
				System.out.print(w+" ");
			}
		}
	}	
	
	//2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Structured)
	private static void printEvensStructured1(List<Integer> l) {
		l.stream().filter(t->t%2==0).forEach(t->System.out.print(t+" "));//t->t%2==0 the name of that structure is called "Lamda Expression"
		
	}
	//3)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
	public static void printSquareOfOdds(List<Integer> l) {
		l.stream().filter(t->t%2==0).map(t->t*t).forEach(t->System.out.print(t+" "));//map() is used to change the value of elements
	}
	//4)Create a method to print the cube of distinct odd list elements on the console in the same line with a space between two consecutive elements.
	public static void printCubeOfDistinctOdds(List<Integer> l) {
		l.stream().filter(t->t%2!=0).distinct().map(t->t*t*t).forEach(t->System.out.print(t+" "));//distinct() removes repeated ones
	}
	//5)Create a method to calculate the sum of the squares of distinct even elements
	public static void sumOfSquareDistinctEvens(List<Integer> l) {
		Integer sum =l.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);//For sum make the first parameter zero
		System.out.println("The sum of the squares of even distinct elements is " + sum);
	}
	//6)Create a method to calculate the product of the cubes of distinct even elements
	public static void productOfCubeDistinctEvens(List<Integer> l) {
		Integer prod = l.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
	System.out.println("The multiplication of the cubes of even distinct element is "+prod);
	}
	//7)Create a method to find the maximum value from the list elements
	//1.way
	public static void getMaxElement(List<Integer> l) {
		Integer maxEl = l.stream().reduce(Integer.MIN_VALUE,(t,u)->t>u? t: u);
		System.out.println("The max element is "+maxEl);
	}
	//2.way
	public static void getMaxElement2(List<Integer> l) {
	//sorted()==>Returns a stream consisting of the elements of this stream, sorted according to natural order. 	
	int maxEl =	l.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
		System.out.println("The max element is "+maxEl);
	}
	//8)Create a method to find the minimum value from the list elements
	public static void getMinElement(List<Integer> l) {
		Integer minEl = l.stream().reduce(Integer.MAX_VALUE,(t,u)->t<u ? t: u);
		System.out.println("The min element is "+minEl);
	}
	//2.way
	public static void getMinElement2(List<Integer> l) {
		Integer minEl = l.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
		System.out.println("The min element is "+minEl);
}
	//9)Create a method to find the minimum value which is greater than 7 and even from the list
//1.way
	public static void getMinGreaterThenSevenEven1(List<Integer> l) {
	Integer minEl = l.stream().distinct().filter(t->t>7 && t%2==0).reduce(Integer.MAX_VALUE,(t,u)->t<u ? t : u);
	System.out.println("1) The min element is "+minEl);
	}
	//2.way
	public static void getMinGreaterThenSevenEven2(List<Integer> l) {
		Integer minEl = l.stream().distinct().filter(t->t>7 && t%2==0).sorted().findFirst().get();//use findFirst() together with get() to get Integer return type
		System.out.println("2) The min element is "+minEl);
		}
	//10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order from the list.
	public static void getHalfOfDistinctElReversed(List<Integer> l) {
List<Double> resutList = l.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        
        
        System.out.println("Half of the elements list: " + resutList);//[65, 7, 7, 6, 5, 4]
	}
	
	
}
