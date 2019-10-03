package hemläxor;

import java.util.Scanner;

public class V40_Spavanacc {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int timmar = input.nextInt();
		int minuter = input.nextInt();
		
		int timmarsomminuter = (timmar * 60);
		
		int totalaminuter = (timmarsomminuter + minuter - 45);
		
		if (totalaminuter<0) {
			totalaminuter+= 24*60;
		}
		int res = ( totalaminuter % 60);
		
		int restimmar = ((totalaminuter - res)/60);
		
		System.out.println(restimmar + " " + res);
		
		
		
		
		
		
		
		

	}

}
