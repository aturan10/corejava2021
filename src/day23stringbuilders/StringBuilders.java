package day23stringbuilders;

public class StringBuilders {

	public static void main(String[] args) {
		 /*
         * 
         */
        
        //how to create a String by using "StringBuilder Class"
        //1. way
        StringBuilder sb = new StringBuilder();
        
        System.out.println(sb);//empty String
        
        System.out.println(sb.capacity());// default capacity is 16
        
        sb.append("Ali");
        sb.append(" is a friend of Veli");
        
        System.out.println(sb);//Ali is a friend of Veli
        
        
//      String str = "Veli";
//      System.out.println(str); //Veli
//      str.toUpperCase();
//      System.out.println(str);//still Veli bc it is String
        
        //2. way 
        StringBuilder sb1 = new StringBuilder("Veli is my friend");
        
        System.out.println(sb1);//Veli is my friend
        
        sb1.append(" and my classmate");
        System.out.println(sb1); //Veli is my friend and my classmate
        
        //3. way
        StringBuilder sb2 = new StringBuilder(5);
        //we need to be sure with length of the string 
        sb2.append("Javax");
        System.out.println(sb2);// 
        
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        
        //StringBuilder methods append() in chain
        
        StringBuilder sb3 = new StringBuilder("Java");
        
        sb3.append('q').append('z').append('u');
        System.out.println(sb3);//Javaqzu
        
        //2. CharSequence s, int start, int end
        //if you want to add some of characters from a String we use the following method
        sb3.append("Ahmet", 1, 3);
        System.out.println(sb3);//Javaqzuhm
        
        
        //the index of the desired char value
        System.out.println(sb3.charAt(5));//z
        
        
        //how to delete
        //delete by start and end index 
        sb3.delete(4, 7);
        System.out.println(sb3);//Javahm
        
        sb3.deleteCharAt(0);
        System.out.println(sb3);//avahm
	}

}
