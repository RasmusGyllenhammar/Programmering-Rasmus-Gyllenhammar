package heml�xor;

import java.util.Scanner;

public class V40_Spavanac {

	public static void main(String[] args) {
	//	Scanner input = new Scanner(System.in);
        
		int Hour = input.nextInt();
		int Minut = input.nextInt();
		
		if(H>=0 && H<=23 && M>=0 && M<=59 ){
			System.out.println((H + M) - 45);
	  
			//int tsom;
		
		
			if(Minut<45 && Hour>0) { 
				Hour=Hour-1; //om M �r mindre 45 och h �r st�rre �n 0 s� minskar vi h med 1, 
			}
		}
}//
