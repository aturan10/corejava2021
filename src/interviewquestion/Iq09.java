package interviewquestion;

public class Iq09 {
/*
 * 
 */
	public static void main(String[] args) {
		String string = "absmddmopawe";
		System.out.println(longestPalindromicSubstring(string));
	

	}
	
	static boolean isPalindrome(String string) {
		StringBuilder sb = new StringBuilder(string).reverse();
        String reversedString = sb.toString();
        return string.equals(reversedString);
    }
	
	static String longestPalindromicSubstring(String string) {
        if(string == null || string.isEmpty()) return "";

        String longestPalindrome = "";
        
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length(); j++) {
                String substr = string.substring(i, j);
                if(isPalindrome(substr) && substr.length() > longestPalindrome.length()) {
                    longestPalindrome = substr;
                }
            }
        }

        return longestPalindrome;
    }
	

}
