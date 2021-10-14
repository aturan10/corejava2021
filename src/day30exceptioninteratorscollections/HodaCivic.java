package day30exceptioninteratorscollections;

/*
 	1)to make a concrete class child of an interface use "implements" keyword not "extends"
 	2)Interfaces can be used as data type of the objects, but they cannot be used as constructor
 	
 */
public class HodaCivic implements Engine, AirCondition, Music{

	
	@Override
	public void gasUsage() {

		System.out.println("It uses gas like smelling...");
	}

	@Override
	public void speedLimit() {

		System.out.println("No limit...");
		
	}

	@Override
	public void climate() {

		System.out.println("No need to use, it uses gas too uch...");
		
	}

	@Override
	public void sound() {

		System.out.println("Lower the volume...");
		
	}

	@Override
	public void tune() {

		System.out.println("Tune Honda radio...");
		
	}


	@Override
	public void eat() {

		System.out.println("Eat well...");
	}

	
}
