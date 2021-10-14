package practice01;

public class Practise {
int x ;
static int y;
Practise(int i){
	x += i;
	y += i;
	
}
	public static void main(String[] args) {
new Practise(2);
Practise mc = new Practise(3);
System.out.println(mc.x+","+mc.y);
		
		
		
	}

}
