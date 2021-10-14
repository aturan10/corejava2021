package day23stringbuilders;

public class StringBuilder03 {

	public static void main(String[] args) {
StringBuilder sb1 = new StringBuilder("Java");
		
		StringBuilder sb2 = new StringBuilder("JavaD");
		
		/*equals() method in StringBuilder uses "==" to compare 
		 
		 */
		//1.st way Convert StringBuilder To String then use equal() method
		System.out.println(sb1.toString().equals(sb2.toString()));//false for StringBuilder equal()
																// true for String equal()
		
		
		
		//2. way Use compareTo() method
		System.out.println(sb1.compareTo(sb2)); // 0==> StringBuilder contains the same character sequence
		
		
		
	}

}
