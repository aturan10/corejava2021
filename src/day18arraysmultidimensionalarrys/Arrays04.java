package day18arraysmultidimensionalarrys;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
//How to check if 2 arrays equal to each other
		String s1[] = {"Ali", "Can", "Veli"};
		String s2[] = { "Can", "Veli","Ali"};
		String s3[] = {"Ali", "Can", "Veli"};
				
		System.out.println(Arrays.equals(s1, s2));	//false	
		System.out.println(Arrays.equals(s1, s3));	//true
		//How to check 2 arrays have same elements ignore indexes.
		
		// let us check s1 and s2 arrays
		Arrays.sort(s2);
		if(Arrays.equals(s1, s2)) {
	System.out.println("Have same elements");
	}else {
		System.out.println("Does not have same elements");				
		}
		
		/*
		 	split() method is from String Class ==> "Ali Can went to school" ==> [Ali, Can, went, to , school]
		 */
		String s4 = "Ali Can went to school";
		String words[] = s4.split(" ");
		System.out.println(Arrays.toString(words));//[Ali, Can, went, to, school
		String parts[] = s4.split("o");
		System.out.println(Arrays.toString(parts));//[Ali Can went t, sch, ,l]
		
		String chars[] = s4.split("");
		System.out.println(Arrays.toString(chars));
		System.out.println(chars.length);
		
		// How many characters except space were used in the String "Ali Can went to school"
		String charsExceptSpace[] = s4.replace(" ", "").split("");
		System.out.println(Arrays.toString(charsExceptSpace));//[A, l, i, C, a, n, w, e, n, t, t, o, s, c, h, o, o, l]
		System.out.println(charsExceptSpace.length);
		
		//How many 'a' was used in String "Mama may i go to Alabama"
		String s5 = "Mama may i go to Alabama";
		
		
		String arr[] = s5.split("a");
		
		/*
		 		To check the number of "a"s in String we have 3 different scenarios:
		 		1)"a" is at the beginning and at the end ==>"ama may i go to Alabama"
		 		2)"a" is not at the beginning and at the end ==> "Mama may i go to AlabamaX"
		 		3)"a" used just once at the beginning or at the end ==>"ama may i go to AlabamaX"
		 */
		System.out.println(Arrays.toString(arr));
		if(s5.startsWith("a") && s5.endsWith("a")) {
			System.out.println("==>"+(arr.length+1));
		}else if(!s5.startsWith("a") && !s5.endsWith("a")) {
			System.out.println("==>"+(arr.length-1));
		}else {
			System.out.println("**>"+arr.length);
		}
		
		
		//2.Way: Number of all characters before removing "a"s - number of all characters after removing "a"s = Result
		String a1[] = s5.split("");//==>24
		String a2[] = s5.replace("a", "").split("");//==>18
		System.out.println("Second Way: "+ (a1.length-a2.length));//6
		
		//3.Way: Use loops
		int count = 0;
		for(int i=0; i<s5.length(); i++) {
			if(s5.charAt(i)=='a') {
				count++;
			}
		}
	System.out.println("Third way: "+ count);
	//4.Way: Use regex to remove all characters except "a"
	System.out.println("Fourth way: " + s5.replace("[^a]", "").length());	
	}
}
