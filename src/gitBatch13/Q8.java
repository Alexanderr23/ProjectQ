package gitBatch13;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] num= new int[10];
		num[0]=0;
		num[1]=1;
		System.out.println(num[0]+" "+num[1]+" ");
		{

     for(int i=2; i<10;i++) {
    	 num[i]=num[i-i]+num[i-2];
     System.out.print(num[i]+" ");
     }


}
	
	
	
	
	
	}

}
