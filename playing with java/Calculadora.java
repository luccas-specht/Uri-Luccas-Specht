package CelularDeBordo;

import java.util.Scanner;

public class Calculadora {
	
	
	Scanner p= new Scanner(System.in);
	
	public float SOMA() {
	
		System.err.println("how many numers wil you type?");
		
		int n;
		n=p.nextInt();
		
		
		float[] numbers = new float[n];
		
		float soma=0;
		
		for(int x=0;x<n;x++) {
			
			System.out.println("type your:" + (x+1) +"°");
			
			numbers[x] = p.nextFloat();
	
		}

		for (int x=0; x<numbers.length; x++) {
		
			soma+=numbers[x];
			}
          
		System.out.print(soma);
		
		
		
		return soma;
		
	}
	
	
	public float SUBTRACAO(){
		
		System.err.println("how many numers wil you type?");
		
		int n;
		n=p.nextInt();
		
		
		
		float[] numbers = new float[n];
		
		float sub=0;
		
		
		
		for(int x=0;x<n;x++) {
			
			System.out.println("type your:" + (x+1) +"°");
			
			numbers[x] = p.nextFloat();
	
		}

		for (int x=0; x<numbers.length; x++) {
		
			sub-=numbers[x];
			}
          
		
		
	return sub;
	}
	
	
	}
