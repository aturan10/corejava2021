package day25practice;

public class Q04 {
	/*
	 * 9. Write a method that accepts an Array of integers and returns the max. and 10. 
	 * Write a method that accepts an Array of integers and returns the second max.
	 */
	static String findMaxs(int[] arr){
        int max = Integer.MIN_VALUE + 1;
        int secondMax = Integer.MIN_VALUE;
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        for(int num : arr){
            if(num > max) {
                secondMax = max;
                max = num;
            }else if(num > secondMax && num != max)
                secondMax = num;
        }
        return "max is " + max + " secondMax is " + secondMax;
    }
	public static void main(String[] args) {
	//	System.out.println(findMaxs(10));
	}

}
