package heml�xor;

import java.util.Scanner;

public class V39Kattis_kvadrant {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("skriv tv� tal");
		
		int X = input.nextInt();
		int Y = input.nextInt();
		
		if(X>=1 && Y>=1) {
			System.out.println("F�rsta kvadranten");
		
		}
		else if(X>=1 && Y<=1) {
			System.out.println("fj�rde kvadranten");
		}
		else if(X<=1 && Y<=1) {
			System.out.println("tredje kvadranten");
		}
		else if(X<=1 && Y>=1) {
			System.out.println("andra kvadranten");
		}
	}	
}
