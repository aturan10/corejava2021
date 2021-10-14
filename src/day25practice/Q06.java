package day25practice;

import java.util.ArrayList;
import java.util.Arrays;


public class Q06 {
	/*
	 * 14. Write a method that accepts an Array and returns the number/s that are not repeated in an ArrayList. 
	 * Method returns the numbers in aN ArrayList. 
	 * EX: arr = {1,1,2,2,3,3,4,5}  ---> [4,5]
	 */
//	public static ArrayList<Integer> unique(int[]A) {
//        ArrayList<Integer>list=new ArrayList<>();
//        for(int i=0;i<A.length-1;i++) {
//            for(int j=i+1;j<A.length;j++) {
//            if(A[i]!=A[j]) {
//                list.add(A[i]);
//            }
//            }
//        }return list;
//        
//    }
	 static ArrayList<Integer> findUnique(int[] arr){
	        ArrayList<Integer> al = new ArrayList<>();
	        for(int num : arr){
	            int count = 0;
	            for(int num2 : arr){
	                if(num == num2)
	                    count++;
	            }
	            if(count == 1)
	                al.add(num);
	        }
	        return al;
	    }
	public static void main(String[] args) {
System.out.println(findUnique(new int[] {1,1,2,2,3,3,4,5}));
	}

}
