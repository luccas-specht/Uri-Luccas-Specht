package uri_random;

import java.util.*;
public class Raizes_URI1036 {
	public static void main(String[] args) {
		
		Scanner tc= new Scanner(System.in);
		
		double a=tc.nextFloat(), b=tc.nextFloat(), c=tc.nextFloat();
				
		double delta=(b*b)-4*(a*c);

		if(a==0||delta<0) {
			System.out.print("Impossivel calcular\n");

		}else{	
			double raiz=Math.sqrt(delta);
			
			double R1=((b*-1)+ raiz)/(2*a);
			double R2=((b*-1)- raiz)/(2*a);
			
			System.out.printf("R1 = %.5f\n", R1);
			System.out.printf("R2 = %.5f\n", R2);
		}		
	tc.close();	
	}
}
