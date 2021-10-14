package interviewquestion;

import java.util.Scanner;

public class iq02 {
//Ask user the number of the fibonacci numbers then print fibonnacci numbers on the console
	//user-->7==>1 1 2 3 5 8 13
	/*
	   Logic : F1 and F2 in the first loop then F1+F2 will be new F2 and f2 will be the new F1 in the second loop
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number..");
		int num= scan.nextInt();
		printFibonacci(num);
	}
public static void printFibonacci(int num) {
	int f1=1;
	int f2=1;
	int newf2=0;
	System.out.print(f1+" "+f2+" ");
	for(int i=1;i<num-1;i++) {
	newf2=f1+f2;
	f1 = f2;
	f2=newf2;
	System.out.print(newf2+" ");
	}
	
}



}
