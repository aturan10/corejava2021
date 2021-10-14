package interviewquestion;

import java.util.Arrays;

public class Iq07 {
/*
 		Ebay Interview Question
	 	Put all zeros to end in an integer array
	 	{3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
	 	{0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
 */
	public static void main(String[] args) {

int a[] = {1, 0, 1, 0, 1, 3};
		
		putZerosToEnd(a);
		
		putOnesToEnd(a);

	}
	
	public static void putZerosToEnd(int a[]) {
		
		int b[] = new int[a.length];
		int idx = 0;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]!=0) {
				b[idx] = a[i];
				idx++;
			}
			
		}
		
		System.out.println(Arrays.toString(b));
		
	}
	
	public static void putOnesToEnd(int a[]) {
		
		int b[] = new int[a.length];
		
		for(int i=0; i<b.length; i++) {
			b[i] = 1;
		}
		
		int idx = 0;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]!=1) {
				b[idx] = a[i];
				idx++;
			}
			
		}
		
		System.out.println(Arrays.toString(b));
		
	}

}
