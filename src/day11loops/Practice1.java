package day11loops;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
//
//		int i=1;
//				while ( i < 31 ) {
//			System.out.println(i);
//			i+=2;}
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=scan.nextInt();
		
		if(num<=0) {
			System.err.println("please enter positive integer");
		}else {
			int i=1;
			while(i<11) {
				int mult = num*i;
				System.out.println(num+"*"+i+"="+mult);
				i++;
			}
		}
	
	
	}

}
