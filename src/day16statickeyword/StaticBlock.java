package day16statickeyword;

public class StaticBlock {
	
	/*
	 	stsatic variable: Class variable, it is attched to the class and you should use class name access.
	 	static method: They belong to class,you should use class name to access.
	 	
	 	static block: 1) it is used to initialize "class(static) variables"
	 				  2) static block is executed before everything(constructors, main method) inside the class
	 				  3)If you have multiple static blocks, first one runs first
	 */
		// I did not use "static block" to initialize
		static int age =12;
		
		// I used "static block" to initialize
		static int year;
		static {
			year=2021;
		}
		static {
			System.out.println("Static block 1");
		}
		static {
			System.out.println("Static block 2");
		}
		static {
			System.out.println("Static block 3");
		}
		
	public static void main(String[] args) {
		
		StaticBlock obj1 = new StaticBlock();
		method1();
		System.out.println("Main");
		method2();
		
	}
	public static void method1() {
		System.out.println("Method 1");
	}
	public static void method2() {
		System.out.println("Method 2");
	}
	StaticBlock() {
		System.out.println("Constructor");
	}	
}
