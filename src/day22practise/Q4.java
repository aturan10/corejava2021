package day22practise;

public class Q4 {

	public static void main(String[] args) {
	//4. Write a method that accepts a String and returns reverse of the same String. EX: java -> avaj	
		//1.way
//		String s="Helllooo";
//		String r = reverseString(s);
//		System.out.println(r);
//	}
//	public static String reverseString(String str) {
//		String res="";
//		for(int i=(str.length()-1); i >=0; i--) {
//			res  += str.charAt(i)+"";
//		}
//		return res;
		//2.way
		System.out.println(isReverse(str));
		
	}
	static String str="abc";
	static String isReverse(String str){
	    String reversedString = "";
	    for(int i = str.length() - 1; i >= 0; i--)
	        reversedString += str.charAt(i);
	    return reversedString;
	
	
}}
