package day26inheritanceoverriding;

public class Honda extends Car{

	/*
	 	1)When you override a method, you can use same access modifiers
	 	2)When you override a method, Access modifier in child class cannot have narrower access modifier
	 	3)Private methods cannot be overridden, because overriding means you want to use the method in another class members cannot be used in other classes
	 	
	 	Final methods cannot be overridden, because final method's body cannot be  updated but in overriding, we update the method body.
 	    
 	    static methods cannot be overriden, because static methods are common methods for all child classes. 
 	    If any child updates it, the other classes will be affected, it can create problems
 	    because of that Java does not let overriding for static methods. 
	 	4)@Override annotation checks the overriding rules, if there is any missed or used wrongly overriding rules, it will give CTE. 		
		5)In overriding, return type of "overridden" and "overriding" methods can be same
		6)In overriding, from "overriding" method return type to "overridden" method return type you must have "IS-A" relationship.
			Note: if there is "IS-A" relationship between return types,return types are called " Coveriant Return types".
		7)In overriding, if the return type is "primitive" return type of "overridden" and "overriding" methods must be same.
		8)In overriding, if the return type is "void" return type of "overridden" and "overriding" methods must be "void".
		
	 
	 */
	@Override
	public long move() {

		System.out.println("Honda moves fast...");
		return 12;
	}
	
	

}
