import java.util.Scanner;

public class MetoderJavaPhysicsLibrary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//anropar p� metoden, v�rdet 50
		fahrenheitToCelsius(50);
		
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
}
