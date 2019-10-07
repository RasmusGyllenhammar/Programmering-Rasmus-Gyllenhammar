import java.util.Scanner;

public class Uppgift3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int y = 0;
		int sum = 0;
		
		boolean running = true;
		while(running) {
			int x = input.nextInt();
			if(x==0) {
				running = false;
			} else {
				sum = sum + x;
				y++;
			}
		}
		System.out.println(sum);
		System.out.println(sum / y);

	}

}
