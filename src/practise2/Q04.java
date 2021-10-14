package practise2;

public class Q04 {
//Create a list by getting the list elements from user	 	If there is duplicated elements remove them from the list
//From a given array find all pairs whose sum is a given number	  {4, 6, 5, -10, 8, 5, 20} ==> 10	  For example;	4+6=10, 5+5=10, -10+20=10	
	
	
	public static List<String> findPairs(int[] arr, int num){
		List<String> list=new array<>();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]==num) {
				list.add(new Integer[] {arr[i],arr[j]})
			}
				
			}
		}
	}
	return list;
}
