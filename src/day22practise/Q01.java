package day22practise;

public class Q01 {

	
		//1. Write a method that returns the sum of numbers starting with 1 to the number passed into the method.
		//1.way
//		System.out.println(sum(5));
//		
//	}
//	
//	public static int sum(int n) {
//		int sum = 0;
//		for (int i = 1; i<=n; i++) {
//			sum+=n;
//		}
//		
//		return sum;
		//2.way
//		 sumOf(100);
//    }
//    
//    public static void sumOf(int a) {
//        int sum=0;
//        for(int i=1;i<=a;i++) {
//            sum+=i;
//        }
//        System.out.println(sum);
    //3.way
	static int sumOfNumbers(int num) {
		int sum =0;
		for(int i=1;i<=num;i++) 
			sum+=i;
			
		
		
		return sum;
	}
		
	public static void main(String[] args) {	
	System.out.println(sumOfNumbers(15));	
		
	
	}

}
