package practise2;

import java.util.List;

public class Q02 {

	public static void main(String[] args) {
		System.out.println(naturalOrder({{John,Brad,Fox},{Lee,Ali},{Suzan}}));
	}
/*
 * write a return method that accepts an Multidimensional Array as input
        * Puts all element in a new list
        * and prints all elements in natural order
        *
        * Eg : Input : {{John,Brad,Fox},{Lee,Ali},{Suzan}}
        *       Output:[Ali, Brad, Fox, John, Lee, Suzan]
 */
		static List<String> naturalOrder(String[][] arr) {
			​
					List<String> newList = new ArrayList<String>();
			
					for (int i = 0; i < arr.length; i++) {
						for (int j = 0; j < arr[i].length; j++) {
							newList.add(arr[i][j]);
						}
					}

					Collections.sort(newList);
			
					return newList;
}
		//		public static List<String> naturalOrder(String [][]arr){
//			List <String> list = new ArrayList<>();
//			for (int i = 0; i < arr.length; i++) {
//				for (int j = 0; j < arr[i].length; j++) {
//					list.add(arr[i][j]);
//				}
//			}Collections.sort(list);
//		return list;
//		//	System.out.println(list);
		
		
//		public static void naturalOrder(String starr[][]) {
//			
//			List list = new ArrayList<>();
//		
//		for(int i = 0; i<starr.length; i++) {
//			for(int j = 0; j< starr[i].length; j++) {
//				list.add(starr[i][j]);
//			}
//			
//		}
//		Collections.sort(list);
//		System.out.println(list);
//		}
		
		
	 
}
