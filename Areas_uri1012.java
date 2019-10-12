package uri_random;

import java.util.*;
public class Areas_uri1012 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		final double PI=3.14159;
		float a=tc.nextFloat(), b=tc.nextFloat(), c=tc.nextFloat();
		
		
		System.out.printf("TRIANGULO: %.3f\n",(a*c)/2);
//		float r=(float) Math.pow(c,2);
		System.out.printf("CIRCULO: %.3f\n",(float)(PI*(c*c)));
		System.out.printf("TRAPEZIO: %.3f\n",((a+b)*c)/2);
		System.out.printf("QUADRADO: %.3f\n",b*b);
		System.out.printf("RETANGULO: %.3f\n",a*b);
		tc.close();
	}
}





