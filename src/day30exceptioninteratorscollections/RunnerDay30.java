package day30exceptioninteratorscollections;

public class RunnerDay30 {

	public static void main(String[] args) {

//		System.out.println(I01.x);
//		I01.subtract(12,2);
		
		HodaCivic hc1 = new HodaCivic();
		hc1.accelerate();
		hc1.climate();
		hc1.gasUsage();
		
		//there is a difference in usage, static methods in a class and static methods in an interface?
		//To call a static method from an interface use "Interface name"
		
		Music.volume();
		
		System.out.println(hc1.name);
		System.out.println(hc1.system);
		//if you parent interfaces have variables with same name and you use object in call them, Java confuses and gives CTE
		//System.out.println(hc1.price);
		
		//in Interface , to call variables using interface names are the best obtion
		System.out.println(Engine.price);
		
		//Having abstract methods with the same name in parent interface is not problem.
		// But if the methods whose name are same have different return types gives Compile Time Error
		//If you need to use different return type make the method names different
		hc1.eat();
		
		
	}

}
