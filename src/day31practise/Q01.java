package day31practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Q01 {
/*1)
 * Write a function to check whether a string is pangram or not assuming that the string passed in 
 * does not have any punctuation. Pangrams are words or sentences containing every letter of 
 * the alphabet at least once.
 */
	//1.way
//	public static boolean pangram(String s1) {
//		for(int i='a';i<='z';i++) {
//			if(!s1.toLowerCase().contains(i+""))
//				return false;
//		}
//		return true;
//		}
	
	static boolean isPanagram(String str) {
		str=str.replace(" ","").toUpperCase();
		ArrayList<Character> al=new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			char each= str.charAt(i);
			//if(!al.contains(each) && each>=65 && each<=90) {
				//if(!al.contains(each) && each>='A' && each<='Z') {
				if(!al.contains(each) && Character.isLetter(each)) {
				al.add(each);
			}
		}	
		return al.size() == 26;
	}
	//2nd way, still needs a filtering on non letters
	static boolean isPanagram2(String str) {
		str=str.replace(" ","").toUpperCase();
		String[] arr= str.split("");
		List<String> list= Arrays.asList(arr);
		HashSet<String> set=new HashSet<>();
		
		
		return set.size()==26;
	}
	/*2)
	 * Write a method where u ask a user to enter a number until the total is 100
	 * or number of trials is equal to 3. Ex:1,2,3-->you ran out of trials!
	 * Ex2:1,2,97-->You made it! your sum is 100.
	 */
	//1.way
//    public static void method(){
//        Scanner scan = new Scanner(System.in);
//        int num = 0;
//        for (int i = 0; i < 3; i++) {
//            num += scan.nextInt();
//        }
//        if (num == 100){
//            System.out.println("You made it");
//        }else{
//            System.out.println("You ran out trials!");
//        }
//    }
	//2.way
//	static String method() {
//		int numOfCount = 0;
//		int total = 0;
//		Scanner scan = new Scanner(System.in);
//		while (numOfCount != 3 && total != 100) {
//			System.out.println("Enter: ");
//			int num = scan.nextInt();
//			total += num;
//			numOfCount++;
//		}
//		if(total == 100) {
//			return "Won";
//		} 
//		return "Lost";
//	}
	//3.way
//	private static void is100() {
//        int win = 100;
//        int comp=0;
//        Scanner scan = new Scanner(System.in);
//        for (int i=0; i< 3; i++){
//            int num = scan.nextInt();
//            comp+=num;
//            if (comp == 100){
//                System.out.println("you win");
//                break;
//            }
//        }
//        if (comp != win)
//            System.out.println("sorry you lost!");
//    }
	
	//4.way
	static void sumGame() {
		Scanner scan =new Scanner(System.in);
		int sum, trials,input;
		sum=trials=0;
		while(sum<100 && trials<3) {
			System.out.println("Enter a number");
			input=scan.nextInt();
			sum+=input;
			//or you dont need input sum+=scan.nextInt(); de koyabiliriz
			trials++;
			if(trials==3)
				break;
		}
		 if(sum>=100)
				System.out.println("You made it! your sum is "+sum);
		
		else if(trials==3)
				System.out.println("You ran out of trials!!");
	}
	
	//6.Write a method that reverses a number. Method accepts an integer and returns an int.
	//EX: 123 --> 321
    static int reverseNumber(int num){
    	String result = "";
    String str = String.valueOf(num);
    if(num < 0){
        str = str.substring(1);
        result += "-";
    }
    result += new StringBuilder(str).reverse().toString();
    return Integer.parseInt(result);
//    String reversed = "";
//    if(num == 0)
//        reversed = "0";
//    if(num < 0) {
//        num *= -1;
//        reversed += "-";
//    }
//    while(num > 0){
//        reversed += num % 10;
//        num /= 10;
//    }
//    return Integer.parseInt(reversed);
}
  //7.Write a method that gets any number from a string it gets and returns the total of those number.
    //EX :extractNum("aa2aa3") ==> 2+3 ==> 5.

    public static int sumdig(String str) {
        int len=str.length();
        int sum=0;
        for(int i=0; i<len;i++) {
            if(Character.isDigit(str.charAt(i))) {
                sum+=Integer.parseInt(str.charAt(i)+"");
            }
        }return sum;  
    }
  //1.Write a method that can remove duplicated values from an Integer ArrayList.
  //EX : ArrayList<Integer>(List.of(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5) ---> [1,2,3,4,5]
    
//    static List <Integer> removeDublicated(List <Integer> list) {
//      	List <Integer> list1 = new ArrayList<>();
//      	for(int w: list) {
//      		if (!list1.contains(w)) {
//      			list1.add(w);
//      		}
//      	}
//      	return list1;
//      }
    
//    public class RemoveDuplicates {
//        public static void main(String[] args) {
//            removeDuplicates(new ArrayList<>(Arrays.asList(1,2,1,3,4,6,7,4)));
//        }
//        private static void removeDuplicates(List<Integer>list){
//            List<Integer>nonDup=new ArrayList<>();
//            for (Integer each : list) {
//                if(!nonDup.contains(each)){
//                    nonDup.add(each);
//                }
//            }
//            System.out.println(nonDup);
//        }
//    }
//    static ArrayList<Integer> remover(ArrayList<Integer> al){
//    	  for(int i = 0; i < list.size(); i++){
//          int count = 0;
//          for(int j = 0; j < list.size(); j++){
//              if(list.get(i).equals(list.get(j)))
//                  count++;
//          }
//          if(count > 1){
//              list.remove(list.get(i));
//              i--;
//          }
//      }
//      return list;
//      return new ArrayList<>(new HashSet<>(al));
//  }
//
//    }
//static int [] stringSum(int [] arr) {
//		
//		List<Integer> list1=new ArrayList<>();
//		
//		for (int i=0;i<arr.length;i++ ) {
//			
//			if (!list1.contains(arr[i])) {
//				
//				list1.add(i);
//				
//			}
//			
//		}
//		
//		System.out.println(list1);
//		return arr;
//	}

//	public static void main(String[] args) {
//​
//		int crr []= {1,2,3,5,7,9,4,4,5};
//		stringSum(crr);
//		
//		
//	}
//​
//}
    
//static int [] stringSum(int [] arr) {
//		
//		List<Integer> list1=new ArrayList<>();
//		
//		for (int i=0;i<arr.length;i++ ) {
//			
//			if (!list1.contains(arr[i])) {
//				
//				list1.add(i);
//				
//			}
//			
//		}
//		
//		System.out.println(list1);
//		return arr;
//	}
//	public static void main(String[] args) {
//​
//		int crr []= {1,2,3,5,7,9,4,4,5};
//		stringSum(crr);
//		
    
    
    
		public static void main(String[] args) {
			System.out.println(isPanagram("The quck brown fox jumps over the lazy dog"));
			System.out.println(isPanagram2("The quck brown fox jumps over the lazy dog..."));
		//sumGame();
		System.out.println(reverseNumber(-123));
		System.out.println(sumdig("aa2aa3"));
		
		
	}

}
