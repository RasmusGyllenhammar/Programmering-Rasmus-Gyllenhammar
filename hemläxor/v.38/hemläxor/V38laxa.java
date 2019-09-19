package hemläxor;

import java.util.Scanner;

public class V38laxa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("skriv ut 10 tal");
	    
		int total=0;
		for(int i= 0;i<10;i++) { 
			int nr= input.nextInt();
			total+=nr;
		}
		
		System.out.println("summan:" + total);
		System.out.println( "medelvärdet:" + total/10);
		
		System.out.println("lägsta talet:"  );
		
		System.out.println("högsta talet:"  );
		

}}
