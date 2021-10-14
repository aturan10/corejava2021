package day22practise;

import java.util.Arrays;
import java.util.Random;

public class Q8 {

	public static void main(String[] args) {
/*
 		8. Write a method that generates an single dimensional Array that consists of 
 	    x numbers random numbers between 1 and 100. Method will accept int x as an argument.
 */
		//1.way
//		public static int[] randomX(int x) {
//			int arr[]=new int[x];
//			Random random=new Random();
//			for(int i=0;i<x;i++) {
//				arr[i]=random.nextInt(101);
//			}
//			return arr;
//		}  
		//2.way
//		static int[] randomArray(int x) {
//			​
//					int[] numbers = new int[x];
//					Random r = new Random();
//					for (int i = 0; i < x; i++) {
//						int randomInt = r.nextInt(100) + 1;
//						numbers[i] = randomInt;
//					}
//			​
//					return numbers;
//				}
		//3.way
		/*
		 import java.util.ArrayList;
import java.util.List;
​
public class Question06 {
​
	public static void main(String[] args) {
		//8. Write a method that generates an single dimensional Array 
		// that consists of x numbers random numbers between 1 and 100. 
		// Method will accept int x as an argument.
		
		
		 List<Integer> list1 = new ArrayList<>();
		 random(list1);
​
	}
	
	
	
	public static void random( List<Integer> list) {
		for(int i=0; i<101; i++) {
			list.add(i);
		}
		System.out.println(list);
	}
​
}
		 */
		//4.way
	
	System.out.println(Arrays.toString(arrayGenerater(num)));
	}
static int num=10;
	static int[]arrayGenerater(int num){
		int[] myArray = new int[num];
		for(int i=0;i<myArray.length;i++)
			myArray[i] = new Random().nextInt(100);
		return myArray;
	}
	
	
}