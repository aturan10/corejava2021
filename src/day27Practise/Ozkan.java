package day27Practise;

public class Ozkan {
	  //JVM creates automatically one thread for each class. Thats called main thread. This thread will create  RunTime Stack. The thread will call on the main method(FILO).
    String name; //null
    int age;     //0
    Ozkan(String name, int age){ //local variables. their scope is limited within Constructor.
        this.name = name;
        this.age = age;
        System.out.println("This is my Constructor.");
    }
    static int i = 10;
    static{
        System.out.println("This is my static block.");
    }
    public static void main(String[] args) {
        //m1()
        //m2()
    	Ozkan obj = new Ozkan("Ozkan", 33);
        //$_07_25 obj1 = new $_07_25("Ozkan", 33);
        System.out.println(obj.name + " is " + obj.age + " years old.");
    }

}
