package interviewquestions;

public class ex {
	public static void main(String[] args) {
		int crr[]={4, 6, 5, -10, 8, 5, 20};
		for(int i=0;i<crr.length;i++) {
			for(int j=i;j<crr.length;j++) {
				if(crr[i]+crr[j] == 10) {
					System.out.println(crr[i]+ " + "+crr[j] + "=10");
					
				}
			}
		}
	}

}
