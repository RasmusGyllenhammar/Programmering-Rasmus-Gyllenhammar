package hemläxor;
import java.util.Scanner;

public class basics { 
		public static void main(String[] args) {
	
			 Scanner input = new Scanner(System.in);
			
			 System.out.println("Hej, vad heter du?");
			 String name = input.nextLine();
			
			System.out.println("hur gammal är du?");
			String age = input.nextLine();
			
			System.out.println("vad är din adress?");
			String adress = input.nextLine();
			
			System.out.println("vad är ditt postnummer?");
			String postnr = input.nextLine();
			
			System.out.println("vilken stad bor du i?");
			String bostad = input.nextLine();
			
			System.out.println("Vad är ditt telefonnummer?");
			String nr = input.nextLine();
			
			System.out.println("information:");
			System.out.println( "namn:" + " " + name);
			System.out.println("Ålder:" + " " + age);
			System.out.println("adress:" + " " + adress + ", " + postnr);
			
			System.out.println("telefon:" + " " + nr);
			
			
			
			
			
			 

			
			
			}
}
