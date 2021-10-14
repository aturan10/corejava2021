package practice01;

import java.util.Scanner;

public class prk01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Per days how much are you drink tea?");
		double tea = scan.nextDouble();
		System.out.println("Per tea how much are you use sugar ");
		double x = scan.nextDouble();
		double sugar = 1.7;
		double d = x*tea*sugar;
		double y = (d*365)/1000;
		System.out.println("He uses "+y+" kg sugars per year");
	}

}
