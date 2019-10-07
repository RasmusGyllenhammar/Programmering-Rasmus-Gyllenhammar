import java.util.Scanner;

public class V41Egnauppgifter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
	   int y =	input.nextInt();
	   
	   if(x<y) {
		   System.out.println(x);
	   }
	   else if(y<x) {
		   System.out.println(y);
	   }
	}

}
