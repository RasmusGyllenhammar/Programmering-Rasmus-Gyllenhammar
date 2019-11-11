package enums;
import java.util.Scanner;

public class MetoderJavaPhysicsLibrary {

	static double g = 9.82;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//anropar p� metoden, v�rdet 50
		fahrenheitToCelsius(50);
		
		kelvinToCelsius(0);
		
		//fluidPressure(FluidTable.WATER, 10);
		
		System.out.println(pressureUnderWater(10));
	
		System.out.println(kineticEnergy(2,2));
	}

	/**
	 *  Metoden omvandlar fahrenheit till celsius
	 * @param fahrenheit, en variabel till v�rdet fahrenheit som �r 50
	 * @return Skickar tillbaka fahrehiet i celsius
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32)/1.8;
		System.out.println(celsius);
		return celsius;
	}
	/**
	 * Denna metoden omvandlar kelvin till celsius
	 * @param kelvin �r d�r kelvin v�rdet ligger i och har v�rdet 0 i detta fallet
	 * @return Skickar tillbaka kelvin i celsius
	 */
	public static double kelvinToCelsius(double kelvin) {
		double celsius = kelvin - 273.15;
		System.out.println(celsius);
		return celsius;
	}
	/**
	 * R�knar ut v�tsketrycket i en v�tska vid ett visst djup
	 * @param fluid Denna �r till vilken v�tska vi v�ljer
	 * @param deep Detta �r djupet/h�jden till v�tskan
	 * @return returnar trycket i v�tskan vid det utvalda djupet
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
	
		return g * fluid.density * deep;
	}
	/**
	 * R�knar ut v�tsketrycket i vatten vid ett visst djup/h�jd
	 * @param deep djupet i v�tskan vattnet 
	 * @return Skickar tillbacka v�tsketrycket i vattnet vid ett visst djup
	 */
	public static double pressureUnderWater(double deep) {
		
		return FluidTable.WATER.density * g * deep;
	}
	/**
	 * r�knar ut r�relse energi och d� beh�vs det massan och hastighet
	 * @param mass  detta �r f�r massan
	 * @param velocity detta �r f�r hastigheten 
	 * @return skickar tillbaka r�relseenergin
	 */
	public static double kineticEnergy(double mass, double velocity) {
		     double theKineticEnergy = 0;
		
		theKineticEnergy = (mass * Math.pow(velocity, 2)/2);
		
		return theKineticEnergy;
	}
	public static double potentialEnergy(double mass, double height) {
		
		
		return 0;
	}
}
