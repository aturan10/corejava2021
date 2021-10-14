package day15constructors;

/*
	We use instance variables in constructors as parameters, because consttuctirs create objects
	and they use object related variables which are instance variables.
	
	we do not use class variables inside the constructors, because class variables are related
	not with object
*/

public class Animal {

	
	String name;
	int age;
	boolean isCarnivorous;
	String specy;
	char gender;
	
	static int counter;

	public Animal() {
		counter++;
	}

	
	
	public Animal(String name, int age, boolean isCarnivorous, String specy, char gender) {
		this.name = name;
		this.age = age;
		this.isCarnivorous = isCarnivorous;
		this.specy = specy;
		this.gender = gender;
		counter++;

	}

	public Animal(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		counter++;

	}

	public Animal(String specy) {
		/*
		 	1) this() is used for constructor call
		 	2) this() must be in the first line inside the 
			3) In a constructor, how many times can "this()" be used?
			answer: At most once. Because this() must be in the first line, if you use more than once where
		 */
		
		this("Bobby", 5, 'M');
		this.specy = specy;
		counter++;

	}


	
	
	
}
