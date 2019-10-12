package uri_random;
import java.util.*;


public class uri1010 {

	public static void main(String[] args) {
	
		Scanner tc = new Scanner(System.in);	
	
		int p1=tc.nextInt();
		int quant1=tc.nextInt();
		float preco1=tc.nextFloat();
		int p2=tc.nextInt();
		int quant2=tc.nextInt();
		float preco2=tc.nextFloat();
		
		
	
		System.out.printf("VALOR A PAGAR: %.2f\n",(quant1*preco1)+(quant2*preco2));
		tc.close();
	}

}



