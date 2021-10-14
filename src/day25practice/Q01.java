package day25practice;



public class Q01 {

	public static void main(String[] args) {
		String str1 = "Dallas";//scp
        String str2 = new String("Dallas");//heap
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true
        String str3 = str1;//str3 = dallas
        System.out.println(str3 == str1);//true
        str1 = "Austin";
        System.out.println(str3 == str1); //false
        System.out.println(str3.equals(str1));//false
        //equals() compares the objects. equals() is already overridden for String, Collections, Wrapper classes for content comparison.
		/*
		 		equals() compares the objects. equals() is already overridden for String, Collections,
		  		Wrapper classes for content comparison.
		*/
      
		
	}

}
