package uri_random;

import java.util.*;
public class CodioeQuantidade_URI1038 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		short id=tc.nextShort(), cont=tc.nextShort();
		
		if(id==1){
			System.out.printf("Total: R$ %.3f\n",(double)4*cont);
			
		}else
		if(id==2){
			System.out.printf("Total: R$ %.2f\n",(double)4.50*cont);
			
		}else 
		if(id==3){
			System.out.printf("Total: R$ %.2f\n",(double)5*cont);
			
		}else 
		if(id==4){
			System.out.printf("Total: R$ %.2f\n",(double)2*cont);
			
		}else 
		if(id==5){
			
			System.out.printf("Total: R$ %.2f\n",(double)1.50*cont);
		}
		
		
		tc.close();
	}

}
