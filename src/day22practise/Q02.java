package day22practise;

public class Q02 {

	
		// Write method that accepts a String and removes all duplicate from String. 
		//EX : aaabbc --> abc
	
//		public static String removeDuplicate(String s) {
//			String r = "";
//			for(int i=0; i<s.length(); i++) {
//				if(!r.contains(""+s.charAt(i))) {
//					r+=s.charAt(i);
//				}

//		static String removeDublicates(String str) {
//			String result ="";
//			for(int i=0;i<str.length();i++) {
//				char eachLetter = str.charAt(i);
//				if(result.contains(eachLetter+""))
//					result+=eachLetter;
//			}
//			return result;
//		}
//		
//		public static void main(String[] args) {	
//		System.out.println(removeDublicates("aaabbc"));
		
		//2//way
		static String removeDuplicates(String str) {
			String result = "";
			for(int i = 0; i<str.length(); i++) {
				char eachLetter = str.charAt(i) ;
				if(!result.contains(eachLetter + "")) {
					result+=eachLetter;
				}
			}
			return result;
			
		}
		public static void main(String[] args) {
		System.out.println(removeDuplicates("abagffh"));
	}

}
