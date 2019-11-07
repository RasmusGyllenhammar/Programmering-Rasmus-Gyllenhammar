import java.util.Scanner;

public class MetoderJavaPhysicsLibrary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//anropar på metoden, värdet 50
		fahrenheitToCelsius(50);
		
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
}
