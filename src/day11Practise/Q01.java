package day11Practise;

public class Q01 {

	public static void main(String[] args) {
		
		/*
		 *  print even numbers from 100 to 0 but do not use decrement(i--).
		EXAMPLE:
		     INPUT      :
		     OUTPUT  : 100 98 96 94 92 …….2 0
		 */
		for( int i = 100 ; i > -1;i-=2) {
			System.out.print(i+" ");
}System.out.println();

/*print odd numbers from 100 to 0 but  use decrement(i--).
EXAMPLE:
      */
		for( int i = 100 ; i > -1;i--) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
			
	}

}
