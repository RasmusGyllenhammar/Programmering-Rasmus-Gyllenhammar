import java.util.Scanner;

public class Uppgift2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int sum=0;
		
		
		while(x > 0 ) {
			sum = sum + x % 10; // tar bort f�reg�ende siffra 1066. l�gger till 6 i sum variabeln
			x = x / 10; // tar bort decimal
			
			
	
		}
		System.out.println(sum);

	}

}
