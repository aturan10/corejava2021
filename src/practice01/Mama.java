package practice01;

import java.util.Scanner;

public class Mama {
   public static void  main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter a comment");
	   String com = scan.next();
	   char l = com.charAt(0);
	   switch (l){
		   case 'a':
		   System.out.println("Your request is being proccessed");
		   		break;
		   case 'b':
			   System.out.println("Thank you anyway for your consideration");
			   break;
		   case 'c':
			   System.out.println("Sorry, no one help is currently avalible");
			   break;
			   default:
				   System.out.println("Invaild entry,please try again!");
			   
	   }
	   
	   
	   
	   
	   
   

	
}
   }
    