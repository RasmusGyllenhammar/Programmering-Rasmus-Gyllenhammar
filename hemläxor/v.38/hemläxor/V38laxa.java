package hemläxor;

import java.util.Scanner;

public class V38laxa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("skriv ut 10 tal");
	    
		int total=0;
		int lägsta=0;
		int högsta=0;
				
		for(int i= 0;i<10;i++) { 
			int nr= input.nextInt();
			total+=nr;
			
			if (lägsta>nr) {
				lägsta=nr;
			}
			if(högsta<nr) {
				högsta=nr;
			}
			if(i==0) {
				högsta=nr;
				lägsta=nr;
			}
		}
		
		
		System.out.println("summan:" + total);
		System.out.println( "medelvärdet:" + total/10.);
		
		System.out.println("lägsta talet:" + lägsta );
		
		System.out.println("högsta talet:" + högsta);
		

}}
