package gitBatch13;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		// TODO Auto-generated method stub

	int largeArray[]= {2,4,45,66,87,54,32,12,32};
	
	
	
	int smallest=largeArray[0];
	int largest=largeArray[0];
	 
	for(int i=0; i<8;i++) {
		 if(largeArray[i]< smallest) smallest= largeArray[i]; 
	    if(largeArray[i]>largest) largest= largeArray[i];
	}
	 System.out.println("largest number in Array is"+largest);
	 
	 System.out.println("smallest number is"+smallest);
	 
	 
	
	
	
	}

}
