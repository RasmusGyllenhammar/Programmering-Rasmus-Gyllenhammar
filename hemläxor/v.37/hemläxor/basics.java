package heml�xor;
import java.util.Scanner;

public class basics { 
		public static void main(String[] args) {
	
			 Scanner input = new Scanner(System.in);
			
			 System.out.println("Hej, vad heter du?");
			 String name = input.nextLine();
			
			System.out.println("hur gammal �r du?");
			String age = input.nextLine();
			
			System.out.println("vad �r din adress?");
			String adress = input.nextLine();
			
			System.out.println("vad �r ditt postnummer?");
			String postnr = input.nextLine();
			
			System.out.println("vilken stad bor du i?");
			String bostad = input.nextLine();
			
			System.out.println("Vad �r ditt telefonnummer?");
			String nr = input.nextLine();
			
			System.out.println("information:");
			System.out.println( "namn:" + " " + name);
			System.out.println("�lder:" + " " + age);
			System.out.println("adress:" + " " + adress + ", " + postnr);
			
			System.out.println("telefon:" + " " + nr);
			
			
			
			
			
			 

			
			
			}
}
