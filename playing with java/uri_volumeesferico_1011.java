package uri_random;

import java.util.Scanner;
public class uri_volumeesferico_1011 {	
	
	public static void main(String[] args) {
		Scanner tc= new Scanner(System.in);
		
		final double PI = 3.14159;
		double r=tc.nextDouble();
		double R=Math.pow(r,3);
		
		System.out.printf("VOLUME = %.3f", ((4.0/3)*PI*R));
		tc.close();
	}
}