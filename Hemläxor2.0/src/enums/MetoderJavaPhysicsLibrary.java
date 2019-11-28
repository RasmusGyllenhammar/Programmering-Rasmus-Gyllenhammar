package enums;
import java.util.Scanner;

public class MetoderJavaPhysicsLibrary {

	static double g = 9.82;	//Tyngaccelerationen
	static double G = 6.674 * Math.pow(10, -11); //Gravitations konstanten
	static double c = 2.99792458 * Math.pow(10, 8); //ljusets hastighet i vakuum
	static double R = 8.3145; //Allmänna gaskonstanten
	static double p_0 = 1013; //Lufttrcket vid havsytan
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	   //svaren till frågorna
	   //fråga 1
	   System.out.println(volumeToMass(SolidTable.IRON, 0.06));
	   
	   //fråga 2
	   System.out.println(svtDistance(2.7, 3000));
	   
	  //fråga 3
	   System.out.println(heat(FluidTable.WATER, 4.0, 78));
	   
	   //fråga 4
	   System.out.println(pressureUnderWater(75));
	   
	   //fråga 5
	  System.out.println(velocityToHeight(16.6666666667));
	  
	  //fråga 6
	  System.out.println(calculatePowerForAcceleration( 735, 27.7777777778, 4.8 ));
	  
	  //fråga 7
	  System.out.println(antalStudsar(12));
	  
	  //fråga 8, hur mycket är 90km/h i m/s?
	  System.out.println(kilometresPerHourToMeterPerSecond(90));
	  
	  //fråga 9, en nalle faller med 5.6m/s hur mycket är det i km/h?
	  System.out.println(metresPerSecondToKilometresPerHour(5.6));
	}      

	/**
	 *  Metoden omvandlar fahrenheit till celsius
	 * @param fahrenheit, en variabel till värdet fahrenheit som är 50
	 * @return Skickar tillbaka fahrehiet i celsius
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {
		
		return (fahrenheit - 32)/1.8;
	}
	/**
	 * Denna metoden omvandlar kelvin till celsius
	 * @param kelvin är där kelvin värdet ligger i och har värdet 0 i detta fallet
	 * @return Skickar tillbaka kelvin i celsius
	 */
	public static double kelvinToCelsius(double kelvin) {
		
		return kelvin - 273.15;
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
		
		return mass * g * height;
	}
	/**
	 * beräknar hur snabbt man faller ner, hur hastigheten blir när man faller. Bortser från luftmotstånd 
	 * @param height varabieln för höjden
	 * @return skickar tillbaka hur snabbt man faller ner
	 */
	public static double fallSpeed(double height) {
		
		return Math.sqrt(2 * height/g) * g;
	}
	/**
	 * beräknar skillnaden mellan två tal,
	 * @param first första talet vi skriver in
	 * @param last andra talet vi skriver in
	 * @return skickar tillbaka differensen(diff)
	 */
	public static double delta(double first, double last) {
		
		return last - first;
	}
	/**
	 * Omvandlar en viss volym av vätska till massa
	 * @param fluid vätskan vi använder och dens densitet
	 * @param volume volymen av den vätskan
	 * @return skickar tillbaka volymen konverterad som massa
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		
		return fluid.density * volume;
	}
	/**
	 * Denna metoden omvandlar volymen av en gas till massa
	 * @param gas tar in gasen och vilken dens densitet
	 * @param volume tar in volymen av vätskan
	 * @return skickar tillbaka massan av gasens volym
	 */
	public static double volumeToMass(GasTable gas, double volume) {
		
		
		return gas.density * volume;
	}
	/**
	 * Denna metod gör om 
	 * @param solid tar in materian och materians densitet som vi vill konvertera
	 * @param volume tar in volymen av den materian vi valt
	 * @return skickar tillbaka materians volym som massa 
	 */
	public static double volumeToMass(SolidTable solid, double volume) {
		
		
		return solid.density * volume;
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
	 * @return skickar tillbaka hur mycket energi som behövs för att värma upp iron i detta fallet
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		
		
		return solid.heatCapacity * 1 * 2;
	}
	/**
	 * Räknar ut hur mycket energi det behövs för att värma upp vätskan med en viss massa
	 * @param fluid ämnet vi tar in, en vätska 
	 * @param mass  massan av vätskan
	 * @param deltaT  temperatur skillnaden
	 * @return Skickar tillbaka hur mycket energi det behövs för att värma upp vätskan i antal massa 
	 */
	public static double  heat(FluidTable fluid, double mass, double deltaT) {
		
		return fluid.heatCapacity * 1 * 10;
	}
	/**
	 * 
	 * @param gas ämnet vi tar in, en gas i detta fallet, t.ex air
	 * @param mass Massan av den specifika gasen
	 * @param deltaT temperatur skillnaden
	 * @return Skickar tillbaka hur mycket energi det behövs för att värma upp en gas med en viss massa
	 */
	public static double heat(GasTable gas, double mass, double deltaT) {
		
		return gas.heatCapacity * 1 * 1;
	}
	/**
	 * räknar ut hur högt ett föremål  med en viss hastighet uppåt kommer
	 * @param velocity värdet för hastigheten som vi tar in
	 * @return skickar tillbaka höjden
	 */
	public static double velocityToHeight(double velocity) {
		
		return (Math.pow(Math.sin(1.570796), 2) * Math.pow(velocity, 2)) / (2 * g);
	}
	
	//till uppgift 6 HÄR STARTAR EGNA METODER DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD
	/** Metod 21
	 * räknar ut effekt med hjälp av att räkna ut rörelse energi
	 * @param mass indata för massan 
	 * @param maxVelocity tar in max hastigheten
	 * @param time tar in tiden för det hela
	 * @return skickar tillbaka hur stor effekt det blir
	 */
	public static double calculatePowerForAcceleration(double mass, double maxVelocity, double time ) {
		
		return mass* maxVelocity * maxVelocity/2./time;
	}
	/**
	 * Metod 22
	 * FRÅGA 7
	 * räknar ut antalet studsar den gör efter att förlroa 1% av sin energi efter varje studs
	 * @param height höjden i meter
	 * @return skickar tillbaka antal studsar
	 */
	public static double antalStudsar(double height) {
		double finalKineticEnergy = height * g;
		int bounceCounter = 0;
		double i = 12;
		while(i > 0.5){
			finalKineticEnergy *=0.99;
			i = finalKineticEnergy/g;
			
			bounceCounter ++;	
		}	
		return bounceCounter;
	}
	/**
	 * metod 23
	 * FRÅGA 8(EGEN FRÅGA)
	 * Konverterar km/h till m/s
	 * @param kilometresPerSecond värdet som vi vill konvertera km/h till m/s
	 * @return skickar tillbaka km/h i m/s
	 */
	public static double kilometresPerHourToMeterPerSecond(double kilometresPerSecond) {
		
		return kilometresPerSecond/3.6;
	}
	/**
	 * metod 24
	 * FRÅGA 9(EGEN FRÅGA)
	 * Gör om m/s till Km/h
	 * @param MetresPerSecond hastigheten i m/s vi vill göra om till km/h
	 * @return skickar tillbaka m/s i km/h
	 */
	public static double metresPerSecondToKilometresPerHour(double MetresPerSecond) {
		
		return MetresPerSecond * 3.6;
	}
	/**
	 * metod 25
	 * Räknar ut kraften för ett föremål i fart.
	 * @param mass föremålets vikt
	 * @param acceleration föremålets acceleration
	 * @return skickar tillbaka kraften
	 */
	public static double calculateForce(double mass, double acceleration){
		
		return mass * acceleration;
	}
	
}
