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
	   
	    System.out.println(volumeToMass(FluidTable.WATER,1));
	
	    System.out.println(volumeToMass(GasTable.AIR,1));
	    
	    System.out.println(volumeToMass(SolidTable.IRON,1));
	    
	    System.out.println(svtVelocity(10,5));
	    
	    System.out.println(heat(SolidTable.IRON, 1, 2));
	
	
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
		
		return (mass * Math.pow(velocity, 2)/2);
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
	/**
	 * Omvandlar en viss volym av vätska till massa
	 * @param fluid vätskan vi använder och dens densitet
	 * @param volume volymen av den vätskan
	 * @return skickar tillbaka volymen konverterad som massa
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		double theVolumeToMass = 0;
		theVolumeToMass = FluidTable.WATER.density * volume;
		return theVolumeToMass;
	}
	/**
	 * Denna metoden omvandlar volymen av en gas till massa
	 * @param gas tar in gasen och vilken dens densitet
	 * @param volume tar in volymen av vätskan
	 * @return skickar tillbaka massan av gasens volym
	 */
	public static double volumeToMass(GasTable gas, double volume) {
		double theVolumeToMass = 0;
		theVolumeToMass = GasTable.AIR.density * volume;
		return theVolumeToMass;
	}
	/**
	 * Denna metod gör om 
	 * @param solid tar in materian och materians densitet som vi vill konvertera
	 * @param volume tar in volymen av den materian vi valt
	 * @return skickar tillbaka materians volym som massa 
	 */
	public static double volumeToMass(SolidTable solid, double volume) {
		
		
		return SolidTable.IRON.density * volume;
	}
	/**
	 * Räknar ut medelhastigheten med hjälp av sträcka och tid
	 * @param distance Sträckan som vi tar in här
	 * @param time Tiden som vi tar in
	 * @return skickar medelhastigheten tillbaka
	 */
	public static double svtVelocity(double distance, double time) {
		
		
		return distance/time;
	}
	/**
	 * Räknar ut sträckan med hastighet och tid
	 * @param velocity Hastigheten
	 * @param time  Tiden
	 * @return Får sträckan 
	 */
	public static double svtDistance(double velocity, double time) {
		
		
		return velocity * time;
	}
	/**
	 * metoden räknar ut tiden med en hastighet och sträcka
	 * @param distance  Värdet för sträckan läggs in här
	 * @param velocity  värdet för hastigheten läggs in här
	 * @return Man får tiden tillbaka som det tar för att åka en viss sträcka med en speciell hastighet
	 */
	public static double svtTime(double distance, double velocity) {
		
		return distance/velocity;
	}
	/**
	 * räknar ut arbete med kraft och en sträcka
	 * @param force kraften(F) som vi tar in
	 * @param distance   sträckan som objektet flyttats i
	 * @return skickar tillbaka hur stort arbete man gjort beroende på force och distance
	 */
	public static double work(double force, double distance) {
		
		return force * distance;
	}
	/**
	 * räknar ut effekt(watt) med arbete och tid värden
	 * @param work sätter in värdet för arbetet
	 * @param time sätter in värdet för tiden
	 * @return skickar tillbaks antal watt
	 */
	public static double power(double work, double time) {
		
		return work/time;
	}
	/**
	 * räknar ut energin som krävs för att värma upp ämnet i ett angivet grader
	 * @param solid ämnet vi tar in här, i detta fallet iron
	 * @param mass  massan på ämnet vi valt
	 * @param deltaT  temperatur skillnaden, deltaTemperatur
	 * @return skickar tillbaka hur mycket energi som behövs för att värma upp ironi detta fallet
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		
		
		return SolidTable.IRON.heatCapacity * 1 * 2;
	}
}
