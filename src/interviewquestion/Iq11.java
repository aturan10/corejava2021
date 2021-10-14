package interviewquestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Iq11 {

	//Create a method which returns non-repeated elements from a list​
		public static void main(String[] args) {
			
			List<Integer> nums = new ArrayList<>();
			nums.add(3);
			nums.add(2);
			nums.add(3);
			nums.add(4);
			nums.add(1);
			nums.add(4);
			nums.add(1);
			
			getUniqueEl(nums);
		}
		
		public static void getUniqueEl(List<Integer> nums) {
		
			HashMap<Integer, Integer> map = new HashMap<>();
			
			List<Integer> uniqueList = new ArrayList<>();
		
			for(Integer w : nums) {
				
				if(!map.containsKey(w)) {
					map.put(w, 1);
				}else {
					map.put(w, map.get(w)+1);
				}
				
			}
			
			System.out.println(map);
			
			for(Integer w : nums) {
				
				if(map.get(w)==1) {
				
					uniqueList.add(w);
				}
			}
			
			System.out.println(uniqueList);
			
			
			
		}
	}
	