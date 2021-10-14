package day30exceptioninteratorscollections;

public interface Engine {

	int price=8000;
	String name ="Eco";
	void gasUsage();
	
	void speedLimit();
	
	void eat();
	
	//int drink();
	
	default void accelerate() {
		System.out.println("Accelerate quick...");
	}
}
