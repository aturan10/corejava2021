package practise2;

public class Q01 {


/*
 * * write a program to find the common elements between two String Arrays
            * (without case sensitivity)
            *
            * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
            *
            * Output : [sofia,brad,emily]
 */
//		public static List<String> commonElements(String arr1[],String arr2[] ){
//			List<String> list=new ArrayList<>();
//			Arrays.sort(arr1);
//			Arrays.sort(arr2);		
//			for (int i = 0; i < arr2.length; i++) {
//				for (int j = 0; j < arr1.length; j++) {
//					if (arr2[i].equalsIgnoreCase(arr1[j])&& !arr1[i].isBlank()) {
//						list.add(arr2[i]);
//					}
//				}
//			}	
//			return list;
//		}
//	}
	
	
//	static List<String> commonElements2(List<String> list1, List<String> list2) {
//		ArrayList<String> list3 = new ArrayList<>();
//		for(int i = 0; i<list1.size(); i++) {
//			for(int j = 0; j<list2.size(); j++) {
//				if(list1.get(i).equalsIgnoreCase(list2.get(j))) {
//					list3.add(list1.get(i));
//				}
//			}
//		}
//		return list3;
//	}}

//	String arr1[]={"John","Brad","Angel","Sofia","Emily"};
//	String arr2[]={"sofia","brad","grace","emily","hazel"};
//List<String> list=new ArrayList<>();
//for(int i=0;i<arr1.length;i++) {
//	
//	for(int j=0;j<arr2.length;j++){
//		if(arr1[i].equalsIgnoreCase(arr2[j])) {
//			list.add(arr1[i]);
//			
//		}
//	}
//
//}
//
//System.out.println("common element for two arrays are "+list);
	public class Animal {

		public int weight;
		public char[] bark;
		public char[] feed;

		public void main(String[] args) {

		}

	}



	public class Mammal extends Animal {

	     protected boolean feed = true;

		public void main(String[] args) {

			

		}

	}



	public class Dog extends Mammal {

	     public boolean bark = true;

		public void main(String[] args) {

			Animal dog = new Dog();

	        System.out.println(dog.bark);

			System.out.println(dog.feed);

			System.out.println(dog.weight);

		}

	}

}