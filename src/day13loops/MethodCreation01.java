package day13loops;

public class MethodCreation01 {

	public static void main(String[] args) {

		System.out.println(add(3,5));//8
		System.out.println(add(13,15));//28
		
		System.out.println(add(31,51));//82
		System.out.println(add(30,25));//55
		System.out.println(multiply(2,3,4));//24
//		System.out.println(findSum(10,25));//35
//		System.out.println(findProduct(2,5,8));//80
	}
	/*
	  If you want to create method whose names are same inside a class,
	  you have to make parameters different.
	   1)make the data types of parameters different
	   2)Make the number of parameters different
	   3)if the data type of parameters are different, you can change the order of parameter
	   
	  Note: If you create methods whose a)names are same, b)parameter are different c) in the same class, this called
	    	"Method Overloading"
	    	
	  Note:In method overloading
	  a)Using different return types does not work
	  b)Using different acces modifiers does not work
	  c)Using different parameters names does not work
	  
	  
	  Notre: For Java, to make the method different, just a)method name and b)parameters important.
	  Because of that method name+parameters are called "Method Signature"
	  
	 */
	
	
	
	// Create a medhod and use it inside the main method
	public static int add(int a, int b) {
		
		return a + b;	
	}
	
	//create one more method whose name is add
	//1)Make the data types of parameters different 
		public static int add(short t, int u) {
			
			return t + u + 4;
			
		}
		
		//2)Make the number of parameters different
		public static int add(int t, int u, int v) {
			
			return t + u + 4;
			
		}
		
		//3)If the data type of parameters are different, you can change the order of parameters
		public static int add(int u, short t) {
			
			return t + u + 4;
			
		}
	
	
	
	
//create a method which multiples 3 integer, then call the method from main method
//The variables created inside the method parenthesis likes x,y,z are called "parameters"
	public static int multiply (int x, int y,int z) {
		return x*y*z;
	}
//	//to run the method that we just typed, call it from main method
//public static int findSum(int a, int b) {
//		
//		return a + b;
//}
//
//public static int findProduct (int x, int y,int z) {
//	return x*y*z;
//}
}

