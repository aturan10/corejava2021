package day30exceptioninteratorscollections;
/*
 	1)Interface is not a class, Interface is anInterface, thats it.
 	2)Interface is a storage for abstract methods and "public static final variables"
 	3)Normally we can store "abstract methods" and "public static final variables" in an "abstract class"
 	  but abstract does not support multiple inheritance. Because of that Java created "interfaces" and interfaces 
	  can be used in multiple inheritance.
	4)Interface do not have "Constructors" because of that we cannot create objects from interfaces.
	5)All variables in an interface are automatically "public", "static", and "final"
		a)int x = 12; and public int x =12; are completely same.
		
 */

public interface I01 {

								//VARIABLES
	int x = 11;
	public int y =12;
	
	//c variable is final automatically because of that we cannot change its value
	char c='A';
	//d is complaining because it is final and final variables must be initialized		
	//char d;
	
	//You can access to Ali Can just by using interface name, no need to create any object to access Ali Can
	//because, all variables are static in interfaces
	String s = "Ali Can";
	
	//All of the given variables same
	int a =13;
	public int n=13;
	public static int t=13;
	public static final int u=13;
	
								//METHODS
	//in Interfaces all methods are abstract as default if you want you may use "abstract" keyword or not
	//In interfaces all methods are public as default
	void add(int x, int y);
	abstract void divide (int x, int y);
	
	//Untill Java9, using concrete methods in an interface was not possible, but in Java9, Java made an uptade
	//and let us to use concrete methods as well.
	
	//1.Way to create concret method in an interface
	//Use "default" keyword, it is not access modifier, it is a specific keyword for interfaces
	//if you use "default" keyword, it means to method has a "default implementation"
	//like in abstract classes, if you create a concrete method in interface, it is not must to override
	default void product(int x, int y) {
		System.out.println("Result:"+x*y);
	
	}
	//2.Way to create method in an interface
		//Use “static” keyword
		static void subtract(int x, int y) {
			System.out.println("Result: " +(x-y));
		}
}
