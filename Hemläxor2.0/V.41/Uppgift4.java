import java.util.Scanner;

public class Uppgift4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = 1; //beh�llare f�r summan sen
		int y = 0;//antal g�nger jag skriver in fr�n 0-10 
		
		while(y < 10 && x <= 100000) {
			int f = input.nextInt();//varje tal jag skriver in
			x = x*f;
			y++;
					
		}
		System.out.println("produkten: " + x);
		System.out.println( "antal siffror" + y);
	
	}
		
	
		
		    
		    
				
			}
		

	


