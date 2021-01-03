package uri_random;

import java.util.*;
public class LerValores_URI1035 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		int a=tc.nextInt(), b=tc.nextInt(), c=tc.nextInt(), d=tc.nextInt();
		
//		se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D,
//		ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
		
		int somaCD=c+d;
		int somaAB=a+b;
		
		if(b>c&&d>a&&somaCD>somaAB&&c>0&&d>0&&a%2==0){
			System.out.println("Valores aceitos");
			
		}else{
			System.out.println("Valores nao aceitos");
		}
	tc.close();
	}
}
