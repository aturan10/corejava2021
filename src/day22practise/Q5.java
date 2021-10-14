package day22practise;

public class Q5 {
//1.way
	public static void main(String[] args) {
		/*5. Write a method that checks if word is palindrome.
		 *  A palindrome is a word, number, phrase, or other sequence of characters
		 *  which reads the same backward as forward, such as madam or racecar or the number 10801.
*/
//		public static boolean isPalindrom(String str) {
//			String rts="";
//			for(int i=str.length()-1;i>=0;i--) {
//				rts+=str.charAt(i);
//			}
//			return rts.equals(str);
//		}
	//2.way
//		public static boolean isPalidrom(String str) {
//			return new StringBuilder(str).reverse().toString().equals(str);
//		}
//		static boolean isPalindrome(String str) {
//			boolean result = false;
//			String reverse = "";
//			for (int i = str.length() - 1; i >= 0; i--) {
//				reverse += str.charAt(i);
//			}
//			if (str.equals(reverse)) {
//				result = true;
//			}
//			return result;
//		
			//3.way
//			public static boolean isPalindrome(String s) {
//				String reverse="";
//				for(int i=s.length()-1; i>=0; i--) {
//					reverse+=s.charAt(i);
//				}
//				if(reverse.equals(s)) {
//					return true;
//				}else {
//					return false;
//				}
		//4.way
//		nt start = 0;
//		int end = string.length()-1;
//		while(start!=end) {
//			if (string.charAt(start)!= string.charAt(end)) {
//				return false;
//			}
//			start++;
//			end--;		
//		}
//		
//		return true;
		//5.way
		System.out.println(isPalindrome("ali"));
	
		
		}
	static boolean isPalindrome(String str) {
		for(int i=0, j=1;i<str.length()/2;i++,j++) {
			if(str.charAt(i) !=str.charAt(str.length()-j))
				return false;
		}
		return true;
	}
	
}
