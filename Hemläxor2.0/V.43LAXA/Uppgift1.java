import java.math.*;
import java.util.Scanner;

public class Uppgift1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		

		//anropar 
		//volume(input.nextDouble());
		
		//Skriver ut svaret om volymen
	//	System.out.println(volume(radius));
		
		reverse(input.nextLine());
		

	}
	
	/**
	 *  Metoden r�knar ut volym p� klotet.
	 * 
	 * @param radius   radien f�r klotet
	 * @return skickar volym
	 */
	public static double volume(double radius) {
		
		
		return (4 * Math.PI * Math.pow(radius, 3)/3);
		
		
	}
	/**tar in string, och en tom string som kallas f�r result. I loopen s�ger vi att int i = antal bokst�ver -1 f�r vi g�r fr�n 
	 * 0-5 och inte 1-6, d�rf�r ska i var i>=0 sedan tar vi minus 1 f�r vi har inte fler bokst�ver. Sedan visar vi resulat stringen 
	 * med str.charat(i) d� den e tom fr�n b�rjan f�r det f�rsta tecknet. 
	 * 
	 * @param str �r d�r vi skriver in namnet
	 * @return skickar tillbaka namnet fast omv�nt
	 */
	public static String reverse(String str) {
		String result = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			 result = result + str.charAt(i);
			 
		}
		
		
	 	System.out.println(result);
		return str; 
	}
	
	
	
}
