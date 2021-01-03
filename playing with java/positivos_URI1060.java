package uri_random;

import java.util.Scanner;

public class positivos_URI1060 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		double v[]= new double[6];
		int cont=0;
		
		for(int i=0;i<v.length;i++){
			v[i]=tc.nextDouble();
		}
			
		for(int i=0;i<v.length;i++){
			if(v[i]>0){
				cont++;
				
			}
		}	
		
		
		
		
		System.out.println(cont+" valores positivos");
		
	}

}
