package day25practice;

import java.util.Arrays;
import java.util.Random;

public class Q05 {
	  //     12. Write a method that accepts an array and returns true if the sum of all 3's in the array is exactly 9. EX: Input : {2,3,5,3,6,3,7} output :true Input : {2,3,4,5,6,3,7} output :false
    static boolean sumOf3(int[] arr){
        int count = 0;
        for(int num : arr){
            if(num == 3)
                count++;
        }
        return count == 3;
    }

    //7. Write a method that checks to see if the words u pass is Anagram. EX: read and dear  --> true
    static boolean isAnagram(String str1, String str2){
        //toCharArray
        //split()
        //String[] arr1 = str1.split("");
        char[] arr1 = str1.toCharArray();
        //String[] arr2 = str2.split("");
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    static int[] singleArrayGenerator(int num){
        int[] arr = new int[num];
        for(int i = 0; i < num; i++)
        	arr[i] = new Random().nextInt(100);
        return arr;
    }

    // 9. Write a method that accepts an Array of integers and returns the max and the secondMax.
    static String findMaxs(int[] arr){
        int max = Integer.MIN_VALUE + 1;
        int secondMax = Integer.MIN_VALUE;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int num : arr){
            if(num > max) {
                secondMax = max;
                max = num;
            }else if(num > secondMax && num != max)
                secondMax = num;
        }
        return "max is " + max + " secondMax is " + secondMax;
    }

    // 11. Write a method that accepts an Array of ints returns the sorted Array in ascending order.Do not use the sort method.
    static int[] sortedArray(int[] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        //Lesson05_1_for_Loop.timer(3);
        //System.out.println(sumOf3(new int[]{2,3,5,3,6,3,7}));
        //System.out.println(isAnagram("elbow", "below"));
        //System.out.println(findMaxs(singleArrayGenerator(10)));
        System.out.println(Arrays.toString(sortedArray(singleArrayGenerator(10))));
}}