package day16statickeyword;

public class Students {
	
	String name;
	static String id;
	int grade;
	int registrationYear;
    static String registrationyear;
	static int counter = 1000;
	
	public void setId() {
		counter++;
		id = "" + registrationYear + grade + counter;
		
			
	}

	public Students(String name, int grade, int registrationYear) {
		super();
		this.name = name;
		this.grade = grade;
		this.registrationYear = registrationYear;
	setId();
	
	
	}
	

	

}
