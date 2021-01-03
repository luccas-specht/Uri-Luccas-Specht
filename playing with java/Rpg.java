package ListaRP;

import java.util.Random;

public class Rpg {
	static Random o = new Random();
	static boolean foi=false;

	public static void main(String[] args) {
		
  Rpg p = new Rpg();
  
    p.D6(o, foi);

//    int d;
//	System.out.println(d = o.nextInt(20));
	
	}
	
	public void D6 (Random o,boolean foi) {	
	 int d6 = o.nextInt(6);
	
		if(d6>=3) {
			foi=true;
		
			System.out.println("Pode fazer a��o :) " + "N�mero que o dado caiu:" +d6);
			
		}else{
			 foi=false;
			 System.out.println("N�o Pode fazer a��o :( " + "N�mero que o dado caiu:" +d6);
		}
	
	
	}
	public void D12 (Random o,boolean foi) {
		 int d12 = o.nextInt(12);
			
			if(d12>=6) {
				foi=true;
			
				System.out.println("Pode fazer a��o :) " + "N�mero que o dado caiu:" +d12);
				
			}else{
				 foi=false;
				 System.out.println("N�o Pode fazer a��o :( " + "N�mero que o dado caiu:" +d12);
			}	
	}
	public void D20 (Random o,boolean foi) {
		 int d20 = o.nextInt(6);
			
			if(d20>=10) {
				foi=true;
				System.out.println("Pode fazer a��o :) " + "N�mero que o dado caiu:" +d20);
				
			}else{
				 foi=false;
				 System.out.println("N�o Pode fazer a��o :( " + "N�mero que o dado caiu:" +d20);
			}
	}
	public void D100 (Random o,boolean foi) {
		 int d100 = o.nextInt(6);
		
			if(d100>=50) {
				foi=true;
			
				System.out.println("Pode fazer a��o :) " + "N�mero que o dado caiu:" +d100);
				
			}else{
				 foi=false;
				 System.out.println("N�o Pode fazer a��o :( " + "N�mero que o dado caiu:" +d100);
			}
	}	
}