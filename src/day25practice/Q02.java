package day25practice;

public class Q02 {
	 /*
     *  12. Write a method that accepts an array and returns true if the sum of all 3's in the array is exactly  9.
     *   EX: Input : {2,3,5,3,6,3,7} output :true Input : {2,3,4,5,6,3,7} output :false
*/
	 static boolean sumOf3(int[] arr) {
        int count = 0;
        for(int num : arr) {
            if(num == 3) {
                count ++;
            }
        }
        return count==3;
    }
	
	
	public static void main(String[] args) {
		
		
		System.out.println(sumOf3(new int[]{2,3,5,3,6,3,7}));
		
		
		
	}


}
