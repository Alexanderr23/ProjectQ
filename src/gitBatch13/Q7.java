package gitBatch13;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		

int num=3;
boolean isPrime=true;
 
for(int i=2; i<num;i++) {
	if(num%i==0) {
		isPrime=false;
		break;
	}


}
 if(isPrime) {
	System.out.println(num+"is a prime number"); 
 }
 else {
	 System.out.println(num+"is not prime");
 }
	
	
	
	
	
	
	
	}

}
