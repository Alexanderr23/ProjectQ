package gitBatch13;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// A NESTED LOOP IS A for LOOP IN A for LOOP.
	
	String[][]colors= {{"Blue","Red","Green"},
			          {"Yellow","Orange","Purple"}};
   //loop 
	for(int i=0; i<2; i++) {
   //Nested Loop
    for(int j=0; j<3; j++) {
		System.out.println(colors[i][j]);	
		}
	}
	
	}
	}