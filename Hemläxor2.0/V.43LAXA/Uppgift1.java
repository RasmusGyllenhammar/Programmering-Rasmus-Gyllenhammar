import java.math.*;
import java.util.Scanner;

public class Uppgift1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		//kan skriva in v�rdet p� radien
		double radius = input.nextDouble();
		//anropar 
		volume(radius);
		
		//Skriver ut svaret om volymen
		System.out.println(volume(radius));
		

	} // har double f�r vi ska returna ett v�rde och inte void d�
	public static double volume(double radius) {
		
		
		return (4 * Math.PI * Math.pow(radius, 3)/3);
		
		
	}
}
