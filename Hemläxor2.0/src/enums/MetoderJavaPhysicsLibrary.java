package enums;
import java.util.Scanner;

public class MetoderJavaPhysicsLibrary {

	static double g = 9.82;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//anropar på metoden, värdet 50
		fahrenheitToCelsius(50);
		
		kelvinToCelsius(0);
		
		fluidPressure(FluidTable.WATER, 10);
	}

	/**
	 *  Metoden omvandlar fahrenheit till celsius
	 * @param fahrenheit, en variabel till värdet fahrenheit som är 50
	 * @return Skickar tillbaka fahrehiet i celsius
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32)/1.8;
		System.out.println(celsius);
		return celsius;
	}
	/**
	 * Denna metoden omvandlar kelvin till celsius
	 * @param kelvin är där kelvin värdet ligger i och har värdet 0 i detta fallet
	 * @return Skickar tillbaka kelvin i celsius
	 */
	public static double kelvinToCelsius(double kelvin) {
		double celsius = kelvin - 273.15;
		System.out.println(celsius);
		return celsius;
	}
	/**
	 * Räknar ut vätsketrycket i en vätska vid ett visst djup
	 * @param fluid Denna är till vilken vätska vi väljer
	 * @param deep Detta är djupet/höjden till vätskan
	 * @return returnar trycket i vätskan vid det utvalda djupet
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double pressure = g * fluid.density * deep;
		System.out.println(pressure);
		return pressure;
	}
	
	public static double 
}
