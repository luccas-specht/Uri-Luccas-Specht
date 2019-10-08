package Uri;

import java.util.Scanner;

public class Uri1171 {


	
	public static void main(String[] args) {
		
		
		Scanner p = new Scanner(System.in);
		
		System.out.print("how many number wil you type?");
		
		int i=0,  o;
		int cont = 0;
		
		int j=0;
		
		int num=0;
		
	     o=p.nextInt();
		
		int[] numbers = new int[o];
				
		
		
		for(i=0; i<o; i++) {
			
			numbers[i]=p.nextInt();
			
		}
		
	
		
		for( i=0; i<numbers.length; i++){
		
			cont++;
		}

		for( j=0; j<numbers.length; j++){
		
			
			if (numbers[i] == numbers[j]) {
		
			cont++;
			
			num = numbers[i];
			
			}
		
		}
		
		
		System.out.println(" repeticoes numero " + num + ": " + cont + " vezes");	
	
     
	p.close();	
	}
}
