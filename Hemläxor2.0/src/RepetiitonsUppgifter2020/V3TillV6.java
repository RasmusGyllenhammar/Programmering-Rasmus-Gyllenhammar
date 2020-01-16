package RepetiitonsUppgifter2020;

public class V3TillV6 {

	public static void main(String[] args) {
		
		System.out.println(storaTalet(3,7));
		System.out.println((siffersSumma(1025)));
		
		
	}

	
	
	public static int storaTalet(int A, int B) {
		if(A>B) {
		 return A;
		}
		else if(B>A) {
			return B;
		}
		
	return 0;
		
	
	}
	
	public static int siffersSumma(int C) {
		 {     
		        int sum = 0; 
		          
		        while (C != 0) 
		        { 
		            sum = sum + C % 10; 
		            C = C/10; 
		        } 
		      
		    return sum ; 
		    } 
		  
		    
		        
	
	}
		
	}
	
	
	
	
	

