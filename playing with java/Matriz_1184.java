package Questoes_Matriz;

import java.util.*;
public class Matriz_1184 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		float matriz[][] = new float[12][12];
		float soma=0;
		int cont=0;
		
		
		
		String operacao=tc.next();
		
		//add valores na matriz
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				matriz[i][j]=tc.nextFloat();
				
			}
		}
		//verifica se os valores estão A BAIXO DA DIAGONAL PRINCIPAL; TODOS OS VALORE A BAIXO TEM COMO I SENDO MAIOR QUE J
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				if(i>j) {
					soma+=matriz[i][j];
					cont++;
					
				}
			}
		}
		
		if(operacao.equals("S")) {
			System.out.printf("%.1f\n",soma);
		
		}if(operacao.equals("M")) {
			System.out.printf("%.1f\n",soma/cont);
			
		}
		
	tc.close();	
	}

}
