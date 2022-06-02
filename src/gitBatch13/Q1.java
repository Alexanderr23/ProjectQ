package gitBatch13;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner input= new Scanner(System.in);
    int sum=0;
	int[]array=new int[5];
	System.out.println("enter 5 values");
	for(int i=0; i<array.length;i++) {
		array[i]=input.nextInt();
	}
	 for(int i=0; i<array.length; i++) {
		 sum=sum+array[i];
	 }
	System.out.println("the sum of the values is "+sum);
	
	
	}

}
