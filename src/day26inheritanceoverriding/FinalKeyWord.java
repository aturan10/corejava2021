package day26inheritanceoverriding;

public class FinalKeyWord {
	/*
	 	"final" keyword can be used for 
	 	a)Variables: it means you have to initialize the variable
	 				 it means you cannot update the value after initilazed
	 	b)Methods: It means you cannot change the body of the method.			 
	 	c)Class: Cannot have child classes can be child class but can not be parent class
	 			 Note: final classes can be child class but cannot be parent class
	 			  i)All wrapper classes are final classes
	 			  ii)All immutable classes are final classes, so String class is afinal class
	 */

	public final String name = "Ali Can";
	
	
	public static void main(String[] args) {

		FinalKeyWord obj =new FinalKeyWord();
		
		
	}

}
