package uri_random;

import java.util.*;
public class Multiplos_URI1044 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int a=tc.nextInt(), b=tc.nextInt();
		
		if(a<b){
			if(b%a==0){
				System.out.println("Sao Multiplos");
			}else;
				System.out.println("Nao sao Multiplos");
				
		}else{
			if(a%b==0){
				System.out.println("Sao Multiplos");
			}else;
			System.out.println("Nao sao Multiplos");
			
		}
	}
}
