package Recursividade;

public class Recursividade {

	public static void main(String[] args) {
		System.out.println(potencia(3,1));
	}

	public static int potencia(int x, int e) {
		if(e == 1) return x;
		
		if(e == 0) return 1;
	
		return x * potencia(x, e-1);
	}	
}