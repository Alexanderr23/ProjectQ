package gitBatch13;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

	int[] num={1,4,5,6,7,9};
	for (int i=0; i<num.length; i++) {
		for(int j=i+1; j<num.length;j++) {
			if(num[i]==num[j]) {
				System.out.println(num[i]+" and"+num[j]);
			}
		}
	}
	
	
	
	
	
	
	}

}
