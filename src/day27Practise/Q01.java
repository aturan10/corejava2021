package day27Practise;
/*
 		ORDER OF INITIALIZATION 	
1	If there is a superclass, initialize it first (we’ll cover this rule in the next chapter. For now, just say “no superclass” and go on to the next rule.)
2	Static variable declarations and static initializers in the order they appear in the file
3	Instance variable declarations and instance initializers in the order they appear in the file.
4	The constructor
 */
public class Q01 {

	//JVM creates automatically one thread for each class. Thats called main thread. 
	//This thread will create RunTime Stack. The thread will call on the main method(FILO).
	/*
	 	//----------------------------Instance Control Flow in a single class---------------------------\\
 0) static control flow will be executed(if there is object creation then go to next if NOT then u stop)
 1) Identification of instance members from top to bottom
  (During this process JVM assigns default value for each variable at the time of declaration)
 2) Execution of instance variable assignments and instance blocks from top to bottom
 3) Execution of constructor.
 //----------------------------Instance Control Flow in multiple classes-------------------------\\
 * Whenever u create a child object following will occur;
 0) static control flow will be executed from parent to child (if there is object creation(IN CHILD CLASS) then go to next if NOT then u stop)
 
 1) Identification of instance members from parent to child and off course top to bottom (During this process JVM assigns default value for each variable at the time of declaration)
  
  PARENT ONLY;
 2) Execution of instance variable assignments and instance blocks from top to bottom in PARENT CLASS
 3) Execution of constructor in PARENT CLASS.
 
    CHILD ONLY;
 4) Execution of instance variable assignments and instance blocks from top to bottom in CHILD CLASS
 5) Execution of constructor in CHILD CLASS.
 ****Important Note: Now, if u run the parent class only parent will be executed child class will not be loaded nor will be executed. because parent class members by default available 
 *to the child class where as child class members by default are not available to the parent class 
	 */
	String name;//null
	int age;    //0
	
	Q01(String name, int age){// local variables. their scope is limited within Constructor.
		this.name=name;
		this.age=age;
System.out.println("This is my constructor.");	
	}
	/*
	 	 Static work flow in a single class:
 When u run a class in java, following steps will be executed.
 1) Identification of static members from top to bottom (During this process JVM assigns default value for each variable at the time of declaration)
 2) Execution of static variable assignments and static blocks from top to bottom
 3) Execution of main 
 //-----------------------------Static Control Flow in multiple classes---------------------------\\
    
    1) Identification of static members from from parent to child and off course from top to bottom
       During this process JVM assigns default value for each variable at the time of declaration)
    2) Execution of static variable assignments and static blocks from parent to child and off course from top to bottom
    
    3) Execution of main method of the child. if child class does not have one main method then parent's main method will be executed. 
****Important Note: Now, if u run the parent class only parent will be executed child class will not be loaded nor will be executed. because parent class members by default available to the child class where as child class members by default are not available to the parent class

	 */
	static int i = 10;
	static {
		System.out.println("This is my static block.");
	}
	
	public static void main(String[] args) {

		//m1()
		//m2()
		Q01 obj = new Q01("Ali",35);
		Q01 obj1 = new Q01("Ali",35);

		System.out.println(obj.name+" is "+obj.age+" years old.");
		
		
		
	}

}
