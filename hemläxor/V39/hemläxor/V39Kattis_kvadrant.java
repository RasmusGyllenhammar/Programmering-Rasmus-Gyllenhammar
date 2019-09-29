package hemläxor;

import java.util.Scanner;

public class V39Kattis_kvadrant {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("skriv två tal");
		
		int X = input.nextInt();
		int Y = input.nextInt();
		
		if(X>=1 && Y>=1) {
			System.out.println("Första kvadranten");
		
		}
		else if(X>=1 && Y<=1) {
			System.out.println("fjärde kvadranten");
		}
		else if(X<=1 && Y<=1) {
			System.out.println("tredje kvadranten");
		}
		else if(X<=1 && Y>=1) {
			System.out.println("andra kvadranten");
		}
	}	
}
