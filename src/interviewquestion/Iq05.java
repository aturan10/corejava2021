package interviewquestion;

import java.util.HashMap;
import java.util.Map.Entry;

public class Iq05 {
//Print repeated characters in a given String
	//aabccccdd==>acd
	public static void main(String[] args) {
String str="aabccccdd";
System.out.println(printRepeatedChars(str));
printRepeatedCharsByMap(str);

	}

	public static String printRepeatedChars(String str) {	//1.Way
		String s = "";
		
		for(int i=0; i<str.length(); i++) {

			String s1 = str.substring(i, i+1);
			
			if(str.indexOf(s1) != str.lastIndexOf(s1)) {
				
				if (!s.contains(s1)) {
					s = s + s1;
				}
				
			}

		}
		return s;
	}
	
	public static void printRepeatedCharsByMap(String str) {
		
		String a[] = str.split("");
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String w : a) {
			
			if(!map.containsKey(w)) {
				map.put(w, 1);				
			}else {				
				map.put(w,  map.get(w)+1);				
			}			
		}
		
		for(Entry<String, Integer> w : map.entrySet()) {	
			
			if(w.getValue()>1) {
				
				System.out.print(w + " ");
				
			}
			
		}
				
	}

}