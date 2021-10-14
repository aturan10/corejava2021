package day18arraysmultidimensionalarrys;

public class MultiDimentionalArrays02 {

	public static void main(String[] args) {
		/*
		 	arr ={ {1,2}, {3,4,5}, {6}} and brr = { {7,8,9}, {10,11}, {12} }
		 	Find the sum of elements whose indexes are same in arr1 and arr2
		 	(1+7)+(2+8)+(3+10)+(4+11)+(6+12)
		 */
		int arr[][] = { {1,2}, {3,4,5}, {6}};
		int brr[][] = { {7,8,9}, {10,11}, {12} };
		int outerlen = arr.length<brr.length ? arr.length :brr.length;
		int sum=0;
		for(int i=0; i<outerlen;i++) {
			int innerlen = arr[i].length < brr[i].length ? arr[i].length : brr[i].length;
			for(int j=0;j<innerlen;j++) {
				sum=sum+arr[i][j]+brr[i][j];
			}
		}
System.out.println(sum);
		
		
	}

}
