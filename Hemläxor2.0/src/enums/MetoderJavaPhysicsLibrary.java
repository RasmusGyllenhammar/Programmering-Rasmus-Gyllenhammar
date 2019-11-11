package enums;
import java.util.Scanner;

public class MetoderJavaPhysicsLibrary {

	static double g = 9.82;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//anropar på metoden, värdet 50
		fahrenheitToCelsius(50);
		
		kelvinToCelsius(0);
		
		//fluidPressure(FluidTable.WATER, 10);
		
		System.out.println(pressureUnderWater(10));
	
		System.out.println(kineticEnergy(2,2));
		
		System.out.println(potentialEnergy(2,5));
		
	    System.out.println(fallSpeed(2.5));
	    
	    System.out.println(delta(1,10));
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
	
		return g * fluid.density * deep;
	}
	/**
	 * Räknar ut vätsketrycket i vatten vid ett visst djup/höjd
	 * @param deep djupet i vätskan vattnet 
	 * @return Skickar tillbacka vätsketrycket i vattnet vid ett visst djup
	 */
	public static double pressureUnderWater(double deep) {
		
		return FluidTable.WATER.density * g * deep;
	}
	/**
	 * räknar ut rörelse energi och då behövs det massan och hastighet
	 * @param mass  detta är för massan
	 * @param velocity detta är för hastigheten 
	 * @return skickar tillbaka rörelseenergin
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double theKineticEnergy = 0;
		
		theKineticEnergy = (mass * Math.pow(velocity, 2)/2);
		
		return theKineticEnergy;
	}
	/**
	 * Metoden räknar ut lägesenergi och man kan sätta in vilka värden man vill
	 * @param mass variabeln är för massan
	 * @param height variabeln är för längden/höjden 
	 * @return skickar tillbaka lägesenergin
	 */
	public static double potentialEnergy(double mass, double height) {
		
		double thePotentialEnergy = 0;
		thePotentialEnergy = mass * g * height;
		return thePotentialEnergy;
	}
	/**
	 * beräknar hur snabbt man faller ner, hur hastigheten blir när man faller. Bortser från luftmotstånd 
	 * @param height varabieln för höjden
	 * @return skickar tillbaka hur snabbt man faller ner
	 */
	public static double fallSpeed(double height) {
		double theFallSpeed = 0;
		theFallSpeed = Math.sqrt(2 * height/g) * g;
		
		return theFallSpeed;
	}
	/**
	 * beräknar skillnaden mellan två tal,
	 * @param first första talet vi skriver in
	 * @param last andra talet vi skriver in
	 * @return skickar tillbaka differensen(diff)
	 */
	public static double delta(double first, double last) {
		double diff = 0;
		diff = last - first;
		return diff;
	}
}
