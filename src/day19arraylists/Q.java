package day19arraylists;

import java.util.Scanner;

public class Q {
public static void inArray(int array[]) {

Scanner scan=new Scanner(System.in);

System.out.println("please enter the number less than 100");
int number=scan.nextInt();
int flag=0;
for(int i=0;i<array.length;i++) {
if(number==array[i]) {
	System.out.println("you number is in the array");
	flag++;
	break;	
}	
}
if(flag==0) {
System.out.println("number is not in the array");
}
//int A[][]= { {1, 2, 3}, {4, 5, 6} };
//int M = 1;
//for(int i=0;i<A.length;i++) {
//for(int j=0;j<A[i].length;j++) {
//M=M*A[i][j];
//
//}
//
//System.out.println(M);
//
//
//
//
//
//int[] Array={3,5,21,32,34,45,56,57,76,87,95};
//inArray(Array);
//
//}
}
}