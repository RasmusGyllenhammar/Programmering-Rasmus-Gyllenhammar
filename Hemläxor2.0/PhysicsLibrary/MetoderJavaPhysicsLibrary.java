import java.util.Scanner;

public class MetoderJavaPhysicsLibrary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//anropar på metoden, värdet 50
		fahrenheitToCelsius(50);
		
		kelvinToCelsius(0);
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
}
