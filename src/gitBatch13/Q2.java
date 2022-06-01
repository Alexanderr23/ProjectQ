package gitBatch13;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub

	
		String[] country = new String[4];
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an array of countries");
		String capital = null;
	
		for (int i = 0; i < country.length; i++) {
		country[i] = input.next();
		if (country[i].equalsIgnoreCase("USA")) {
		capital = " DC";
		} else if (country[i].equalsIgnoreCase("spain")) {
		capital = "madrid";
		} else if (country[i].equalsIgnoreCase("brazil")) {
		capital = " brasilia";
		} else {
		capital = "Unknown";
		}
		System.out.println("The capital for " + country[i] + " is " + capital);
		}

		//another loop
		for(String x:country) {
		x=input.next();
		if(x.equalsIgnoreCase("usa")) {
		capital = " DC";
		}else if (x.equalsIgnoreCase("spain")) {
		capital = "madrid";
		} else if (x.equalsIgnoreCase("brazil")) {
		capital = "brasilia";
		
	
	
		}
		}
	
	}

}
