package day19javapractice01;

public class Question03 {

	public static void main(String[] args) {
/*
     create 3 char variables then print  A L I on the console using
     String pickName ="ABCDEF......WXYZ"
 */
		//1. way
//		String pickachu="ABCDEFGIHKLMNOPQRSTUVZ";
//		char A=pickachu.charAt(pickachu.indexOf('A'));
//		char L=pickachu.charAt(pickachu.indexOf('L'));
//		char I=pickachu.charAt(pickachu.indexOf('I'));
//		System.out.println(""+A+L+I);
		
		
		//2.Way
		String word ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		
		char f = word.charAt(0);
		char s = word.charAt(11);
		char l = word.charAt(8);
		
		System.out.println(f + " "+ s + " "+ l);
		
		//3.Way
String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println(pickName.charAt(0)+ " " + pickName.charAt(11)+" "+ pickName.charAt(8));
		
		//4.Way
String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        System.out.println(str.charAt(0)+" "+str.charAt(11)+" "+str.charAt(8));
	}

}
