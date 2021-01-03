package Questoes_Matriz;

import java.util.*;
public class Matriz_1181 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		float matriz[][] = new float[12][12];
		float soma=0; 
		int cont=0;
		
		int linha=tc.nextInt();
		
		String operacao=tc.next();
		
		//add valores na matriz;
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++) {
				matriz[i][j]=tc.nextFloat();
			}
		}
		
		//percorrendo a linha indicada da matriz
		for(int i=0;i<linha;i++){
			for(int j=0; j<matriz.length;j++){
				soma+=matriz[linha][j];
				cont++;
				
			}
		}
		
		if(operacao.equals("S")){
			System.out.printf("%.1f\n",soma);
			
		}if(operacao.equals("M")){
			System.out.printf("%.1f\n",soma/cont);
			
		}
		
	tc.close();	
	}
}
