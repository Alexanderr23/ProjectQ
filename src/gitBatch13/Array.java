package gitBatch13;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {23,24,25,26};
	sum(arr);
	
	}
private static void sum(int x[]) {
	int sum=0;
	for(int i=0; i<x.length;i++) {
		sum=sum+x[i];
	
	}
	System.out.println(sum);
	

	
	
}
}