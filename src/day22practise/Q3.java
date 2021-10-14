package day22practise;

public class Q3 {

	public static void main(String[] args) {
		//3. Write method that accepts a String and extracts letters and numbers. Method should return a String.
		//EX: a1b2c3 --> Letters are abc and numbers are 123.
	//1.way
//		public static String[] slicer(String str) {
//			String[] str1=new String[2];
//			for(int i=0;i<str.length();i++) {
//				Character chr=str.charAt(i);
//				if(chr.isDigit(0-9)) {
//					str1[0]+=chr;
//				}else {
//					str1[0]+=chr;
//				}
//			}
//			return str1;
//		}
		System.out.println(extracter("a1b2c3"));
	}
	//static string str = "a1b2c3";
static String extracter(String str) {
	String letters, numbers;
	letters = numbers ="";
	for(int i=0;i<str.length();i++) {
		char eachLetter = str.charAt(i);
		if(Character.isLetter(eachLetter))
			letters+=eachLetter;
		if(Character.isDigit(eachLetter))
			numbers+=eachLetter;
	}
	
	
	return"Letter are "+letters+" Number are "+numbers;
}
	
	
}
