package enums;
import java.util.Scanner;

public class MetoderJavaPhysicsLibrary {

	static double g = 9.82;	//Tyngaccelerationen
	static double G = 6.674 * Math.pow(10, -11); //Gravitations konstanten
	static double c = 2.99792458 * Math.pow(10, 8); //ljusets hastighet i vakuum
	static double R = 8.3145; //Allm�nna gaskonstanten
	static double p_0 = 1013; //Lufttrcket vid havsytan
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	   //svaren till fr�gorna
	   //fr�ga 1
	   System.out.println(volumeToMass(SolidTable.IRON, 0.06));
	   
	   //fr�ga 2
	   System.out.println(svtDistance(2.7, 3000));
	   
	  //fr�ga 3
	   System.out.println(heat(FluidTable.WATER, 4.0, 78));
	   
	   //fr�ga 4
	   System.out.println(pressureUnderWater(75));
	   
	   //fr�ga 5
	  System.out.println(velocityToHeight(16.6666666667));
	  
	  //fr�ga 6
	  System.out.println(calculatePowerForAcceleration( 735, 27.7777777778, 4.8 ));
	  
	  //fr�ga 7
	  System.out.println(antalStudsar(12));
	  
	  //fr�ga 8, hur mycket �r 90km/h i m/s?
	  System.out.println(kilometresPerHourToMeterPerSecond(90));
	  
	  //fr�ga 9, en nalle faller med 5.6m/s hur mycket �r det i km/h?
	  System.out.println(metresPerSecondToKilometresPerHour(5.6));
	}      

	/**
	 *  Metoden omvandlar fahrenheit till celsius
	 * @param fahrenheit, en variabel till v�rdet fahrenheit som �r 50
	 * @return Skickar tillbaka fahrehiet i celsius
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {
		
		return (fahrenheit - 32)/1.8;
	}
	/**
	 * Denna metoden omvandlar kelvin till celsius
	 * @param kelvin �r d�r kelvin v�rdet ligger i och har v�rdet 0 i detta fallet
	 * @return Skickar tillbaka kelvin i celsius
	 */
	public static double kelvinToCelsius(double kelvin) {
		
		return kelvin - 273.15;
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
		
		return mass * g * height;
	}
	/**
	 * ber�knar hur snabbt man faller ner, hur hastigheten blir n�r man faller. Bortser fr�n luftmotst�nd 
	 * @param height varabieln f�r h�jden
	 * @return skickar tillbaka hur snabbt man faller ner
	 */
	public static double fallSpeed(double height) {
		
		return Math.sqrt(2 * height/g) * g;
	}
	/**
	 * ber�knar skillnaden mellan tv� tal,
	 * @param first f�rsta talet vi skriver in
	 * @param last andra talet vi skriver in
	 * @return skickar tillbaka differensen(diff)
	 */
	public static double delta(double first, double last) {
		
		return last - first;
	}
	/**
	 * Omvandlar en viss volym av v�tska till massa
	 * @param fluid v�tskan vi anv�nder och dens densitet
	 * @param volume volymen av den v�tskan
	 * @return skickar tillbaka volymen konverterad som massa
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		
		return fluid.density * volume;
	}
	/**
	 * Denna metoden omvandlar volymen av en gas till massa
	 * @param gas tar in gasen och vilken dens densitet
	 * @param volume tar in volymen av v�tskan
	 * @return skickar tillbaka massan av gasens volym
	 */
	public static double volumeToMass(GasTable gas, double volume) {
		
		
		return gas.density * volume;
	}
	/**
	 * Denna metod g�r om 
	 * @param solid tar in materian och materians densitet som vi vill konvertera
	 * @param volume tar in volymen av den materian vi valt
	 * @return skickar tillbaka materians volym som massa 
	 */
	public static double volumeToMass(SolidTable solid, double volume) {
		
		
		return solid.density * volume;
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
	 * @return skickar tillbaka hur mycket energi som beh�vs f�r att v�rma upp iron i detta fallet
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		
		
		return solid.heatCapacity * 1 * 2;
	}
	/**
	 * R�knar ut hur mycket energi det beh�vs f�r att v�rma upp v�tskan med en viss massa
	 * @param fluid �mnet vi tar in, en v�tska 
	 * @param mass  massan av v�tskan
	 * @param deltaT  temperatur skillnaden
	 * @return Skickar tillbaka hur mycket energi det beh�vs f�r att v�rma upp v�tskan i antal massa 
	 */
	public static double  heat(FluidTable fluid, double mass, double deltaT) {
		
		return fluid.heatCapacity * 1 * 10;
	}
	/**
	 * 
	 * @param gas �mnet vi tar in, en gas i detta fallet, t.ex air
	 * @param mass Massan av den specifika gasen
	 * @param deltaT temperatur skillnaden
	 * @return Skickar tillbaka hur mycket energi det beh�vs f�r att v�rma upp en gas med en viss massa
	 */
	public static double heat(GasTable gas, double mass, double deltaT) {
		
		return gas.heatCapacity * 1 * 1;
	}
	/**
	 * r�knar ut hur h�gt ett f�rem�l  med en viss hastighet upp�t kommer
	 * @param velocity v�rdet f�r hastigheten som vi tar in
	 * @return skickar tillbaka h�jden
	 */
	public static double velocityToHeight(double velocity) {
		
		return (Math.pow(Math.sin(1.570796), 2) * Math.pow(velocity, 2)) / (2 * g);
	}
	
	//till uppgift 6 H�R STARTAR EGNA METODER DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD
	/** Metod 21
	 * r�knar ut effekt med hj�lp av att r�kna ut r�relse energi
	 * @param mass indata f�r massan 
	 * @param maxVelocity tar in max hastigheten
	 * @param time tar in tiden f�r det hela
	 * @return skickar tillbaka hur stor effekt det blir
	 */
	public static double calculatePowerForAcceleration(double mass, double maxVelocity, double time ) {
		
		return mass* maxVelocity * maxVelocity/2./time;
	}
	/**
	 * Metod 22
	 * FR�GA 7
	 * r�knar ut antalet studsar den g�r efter att f�rlroa 1% av sin energi efter varje studs
	 * @param height h�jden i meter
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
	 * FR�GA 8(EGEN FR�GA)
	 * Konverterar km/h till m/s
	 * @param kilometresPerSecond v�rdet som vi vill konvertera km/h till m/s
	 * @return skickar tillbaka km/h i m/s
	 */
	public static double kilometresPerHourToMeterPerSecond(double kilometresPerSecond) {
		
		return kilometresPerSecond/3.6;
	}
	/**
	 * metod 24
	 * FR�GA 9(EGEN FR�GA)
	 * G�r om m/s till Km/h
	 * @param MetresPerSecond hastigheten i m/s vi vill g�ra om till km/h
	 * @return skickar tillbaka m/s i km/h
	 */
	public static double metresPerSecondToKilometresPerHour(double MetresPerSecond) {
		
		return MetresPerSecond * 3.6;
	}
	/**
	 * metod 25
	 * R�knar ut kraften f�r ett f�rem�l i fart.
	 * @param mass f�rem�lets vikt
	 * @param acceleration f�rem�lets acceleration
	 * @return skickar tillbaka kraften
	 */
	public static double calculateForce(double mass, double acceleration){
		
		return mass * acceleration;
	}
	
}
