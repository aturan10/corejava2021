package day11Practise;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*Get a number less than 10 from the user and create a multiplication table
		 * INPUT : number: 4 OUTPUT : 1 2 3 4
		 *                            2 4 6 8
		 *                            3 6 9 12
		 *                            4 8 12 16
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number less then 10...");
	    int num = scanner.nextInt();
	    for(int i = 1; i<=num;i++) {
	    	for(int j = 1; j<=num;j++) {
	    		System.out.print(i*j+" ");
	    	}System.out.println();
	    }
	    
		
		
		
	}

}
