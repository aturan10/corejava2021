package interviewquestion;

import java.util.Scanner;

public class Iq03 {
//prime numbers are positive integers which are divided just by 1 and by itself
	//5 i prime--> 1 and 5 but 6 is not prime--> 2 and 3
	
	// create a method to check if a number is prime or not
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number..");
		int num= scan.nextInt();
		System.out.println(checkToBePrime(num));
	}
public static boolean checkToBePrime(int num) {
	int counter =0;
	if(num>0) {
		if (num==1) {
			return true;
		}else {
			for(int i=2; i<num;i++) {
				if(num%i==0) {
					counter++;
				}
				
			}
			if(counter==0) {
				return true;
			}else {
				return false;
			}
		}
	}else {
	return false;
}}
}
