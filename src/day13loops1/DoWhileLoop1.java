package day13loops1;

public class DoWhileLoop1 {

	public static void main(String[] args) {

		
	String str = "1234_?!abcdef";
	
	int digitCount = 0;
	int letterCount = 0;
	int otherCount = 0;
	
	int i = 0;
	do {
		if(str.charAt(i)>='a' && str.charAt(i)<='z') {
			letterCount++;
		}else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
			digitCount++;
	}else {
		otherCount++;
	}
	i++;
	}while(i<str.length());
	System.out.println("The # of letter is" +letterCount);
	System.out.println("The # of digits is" +digitCount);
	System.out.println("The # of other is" +otherCount);

	}	
	}
