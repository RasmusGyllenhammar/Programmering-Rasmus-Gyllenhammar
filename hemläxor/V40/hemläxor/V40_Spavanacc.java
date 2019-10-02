package hemläxor;

import java.util.Scanner;

public class V40_Spavanacc {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int timmar = input.nextInt();
		int minuter = input.nextInt();
		
		int timmarsomminuter = (timmar * 60);
		
		int A = (timmarsomminuter + minuter - 45);
		
		int res = ( A % 60);
		
		int restimmar = ((A - res/60));
		
		System.out.println(restimmar + " " + res);
		
		
		

	}

}
