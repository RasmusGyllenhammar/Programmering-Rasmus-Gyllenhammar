package heml�xor;

import java.util.Scanner;

public class V38laxa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("skriv ut 10 tal");
	    
		int total=0;
		int l�gsta=0;
		int h�gsta=0;
				
		for(int i= 0;i<10;i++) { 
			int nr= input.nextInt();
			total+=nr;
			
			if (l�gsta>nr) {
				l�gsta=nr;
			}
			if(h�gsta<nr) {
				h�gsta=nr;
			}
			if(i==0) {
				h�gsta=nr;
				l�gsta=nr;
			}
		}
		
		
		System.out.println("summan:" + total);
		System.out.println( "medelv�rdet:" + total/10.);
		
		System.out.println("l�gsta talet:" + l�gsta );
		
		System.out.println("h�gsta talet:" + h�gsta);
		

}}
