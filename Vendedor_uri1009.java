package uri_random;

import java.util.*;
public class Vendedor_uri1009 {

	public static void main(String[] args) {
	
		Scanner tc = new Scanner(System.in);
		
		String a=tc.next();
		double b=tc.nextDouble();
		double c=tc.nextDouble();
		
		System.out.printf("TOTAL = R$ %.2f\n ",(c*0.15)+b);
		tc.close();
	}
}



