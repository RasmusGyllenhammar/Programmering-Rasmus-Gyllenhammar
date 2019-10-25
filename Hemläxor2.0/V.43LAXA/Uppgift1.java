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
	 *  Metoden räknar ut volym på klotet.
	 * 
	 * @param radius   radien för klotet
	 * @return skickar volym
	 */
	public static double volume(double radius) {
		
		
		return (4 * Math.PI * Math.pow(radius, 3)/3);
		
		
	}
	/**tar in string, och en tom string som kallas för result. I loopen säger vi att int i = antal bokstäver -1 för vi går från 
	 * 0-5 och inte 1-6, därför ska i var i>=0 sedan tar vi minus 1 för vi har inte fler bokstäver. Sedan visar vi resulat stringen 
	 * med str.charat(i) då den e tom från början får det första tecknet. 
	 * 
	 * @param str är där vi skriver in namnet
	 * @return skickar tillbaka namnet fast omvänt
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
