package interviewquestion;

public class Iq04 {
/*
 * From a given array find all pairs whose sum is a given number
	  {4, 6, 5, -10, 8, 5, 20} ==> 10
	  For example;	4+6=10, 5+5=10, -10+20=10
 */
	public static void main(String[] args) {
		
		int a[]={4, 6, 5, -10, 8, 5, 20};
		
		printPairs(a,10);

	}

	public static void printPairs(int a[], int sum) {
		
		int counter = 0;
		for(int i=0; i<a.length; i++) {
			for(int k=i+1; k<a.length;k++) {
				if(a[i]+a[k]==sum) {
					System.out.println(a[i]+"+"+a[k]+" = "+sum);
					counter++;
				}
			}
		}
		if(counter==0) {
			System.out.println("No pair equals to" +sum);
		}
		}}

