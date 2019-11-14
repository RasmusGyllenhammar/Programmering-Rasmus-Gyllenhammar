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
		
		return (mass * Math.pow(velocity, 2)/2);
	}
	/**
	 * Metoden r�knar ut l�gesenergi och man kan s�tta in vilka v�rden man vill
	 * @param mass variabeln �r f�r massan
	 * @param height variabeln �r f�r l�ngden/h�jden 
	 * @return skickar tillbaka l�gesenergin
	 */
	public static double potentialEnergy(double mass, double height) {
		
		double thePotentialEnergy = 0;
		thePotentialEnergy = mass * g * height;
		return thePotentialEnergy;
	}
	/**
	 * ber�knar hur snabbt man faller ner, hur hastigheten blir n�r man faller. Bortser fr�n luftmotst�nd 
	 * @param height varabieln f�r h�jden
	 * @return skickar tillbaka hur snabbt man faller ner
	 */
	public static double fallSpeed(double height) {
		double theFallSpeed = 0;
		theFallSpeed = Math.sqrt(2 * height/g) * g;
		
		return theFallSpeed;
	}
	/**
	 * ber�knar skillnaden mellan tv� tal,
	 * @param first f�rsta talet vi skriver in
	 * @param last andra talet vi skriver in
	 * @return skickar tillbaka differensen(diff)
	 */
	public static double delta(double first, double last) {
		double diff = 0;
		diff = last - first;
		return diff;
	}
	/**
	 * Omvandlar en viss volym av v�tska till massa
	 * @param fluid v�tskan vi anv�nder och dens densitet
	 * @param volume volymen av den v�tskan
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
	 * @param volume tar in volymen av v�tskan
	 * @return skickar tillbaka massan av gasens volym
	 */
	public static double volumeToMass(GasTable gas, double volume) {
		double theVolumeToMass = 0;
		theVolumeToMass = GasTable.AIR.density * volume;
		return theVolumeToMass;
	}
	/**
	 * Denna metod g�r om 
	 * @param solid tar in materian och materians densitet som vi vill konvertera
	 * @param volume tar in volymen av den materian vi valt
	 * @return skickar tillbaka materians volym som massa 
	 */
	public static double volumeToMass(SolidTable solid, double volume) {
		
		
		return SolidTable.IRON.density * volume;
	}
	/**
	 * R�knar ut medelhastigheten med hj�lp av str�cka och tid
	 * @param distance Str�ckan som vi tar in h�r
	 * @param time Tiden som vi tar in
	 * @return skickar medelhastigheten tillbaka
	 */
	public static double svtVelocity(double distance, double time) {
		
		
		return distance/time;
	}
	/**
	 * R�knar ut str�ckan med hastighet och tid
	 * @param velocity Hastigheten
	 * @param time  Tiden
	 * @return F�r str�ckan 
	 */
	public static double svtDistance(double velocity, double time) {
		
		
		return velocity * time;
	}
	/**
	 * metoden r�knar ut tiden med en hastighet och str�cka
	 * @param distance  V�rdet f�r str�ckan l�ggs in h�r
	 * @param velocity  v�rdet f�r hastigheten l�ggs in h�r
	 * @return Man f�r tiden tillbaka som det tar f�r att �ka en viss str�cka med en speciell hastighet
	 */
	public static double svtTime(double distance, double velocity) {
		
		return distance/velocity;
	}
	/**
	 * r�knar ut arbete med kraft och en str�cka
	 * @param force kraften(F) som vi tar in
	 * @param distance   str�ckan som objektet flyttats i
	 * @return skickar tillbaka hur stort arbete man gjort beroende p� force och distance
	 */
	public static double work(double force, double distance) {
		
		return force * distance;
	}
	/**
	 * r�knar ut effekt(watt) med arbete och tid v�rden
	 * @param work s�tter in v�rdet f�r arbetet
	 * @param time s�tter in v�rdet f�r tiden
	 * @return skickar tillbaks antal watt
	 */
	public static double power(double work, double time) {
		
		return work/time;
	}
	/**
	 * r�knar ut energin som kr�vs f�r att v�rma upp �mnet i ett angivet grader
	 * @param solid �mnet vi tar in h�r, i detta fallet iron
	 * @param mass  massan p� �mnet vi valt
	 * @param deltaT  temperatur skillnaden, deltaTemperatur
	 * @return skickar tillbaka hur mycket energi som beh�vs f�r att v�rma upp ironi detta fallet
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		
		
		return SolidTable.IRON.heatCapacity * 1 * 2;
	}
}
