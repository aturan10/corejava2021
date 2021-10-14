package day31practise;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Exp {
	// 9. Create a method the prints the lowercase alphabet	​ ​ ​ ​ ​ ​ ​ ​ ​
	static ArrayList<String> alphabet() {
		ArrayList<String> al = new ArrayList<>();
		for (char i = 97; i <= 122; i++) {
			String each = i + "";
			al.add(each);
		}
		return al;
	}
	// Create a method that generates names, Method accepts an int that will set #
	// of names to be stored in the arraylist. It returns an Arraylist	​ ​ ​ ​ ​ ​ ​ ​
	static ArrayList<String> createNames(int numOfNames){
		ArrayList<String> al = new ArrayList<>();
	        List<String> list = alphabet();
	        for(int j = 1; j <= numOfNames; j++) {
	            String name = "";
	            int length = new Random().nextInt(25);
	            for (int i = 0; i <= length; i++) {
	                int num = new Random().nextInt(26);
	                name += list.get(num);
	            }
	            al.add(name);
	        }
	        return al;
	        }
	// Create a method that accepts an arrayList of Strings and return the longest
	// String
	static String findLongest(ArrayList<String> al){
	        String result = "";
	        for(String each : al){
	            if(each.length() >= result.length())
	                result = each;
	        }
	        System.out.println(al);
	        return result;
	        }
	public static void main(String[] args) {
		System.out.println(findLongest(createNames(10)));
	}
}