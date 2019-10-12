package Questoes_Matriz;
import java.util.*;

public class SeM_matriz {
//Uri-1183
//soma e media dos valores acima da diagonal principal da matriz
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		
		float matriz[][] = new float [12][12];

		float soma=0; int cont=0;	
		
		//equalsIgnoreCase
		//Case insensitive (sem considerar maiúsculas e minúsculas)
		//System.out.println("STR".equalsIgnoreCase("str")); //retorna true
		
		String operacao=tc.next();
	
		for(int i=0;i<matriz.length;i++){
			for(int j=0; j<matriz.length;j++) {
				matriz[i][j]=tc.nextFloat();
			  }
			}
		if(operacao.equals("S")){
			for(int i=0;i<matriz.length;i++) {
				for(int j=0;j<matriz.length;j++) {
					if(j>i) {
						soma+=matriz[i][j];
					}
				}
			}
			System.out.printf("%.1f\n",soma);
			
		}if(operacao.equals("M")){
			for(int i=0;i<matriz.length;i++) {
				for(int j=0;j<matriz.length;j++) {
					if(j>i) {
						cont++;
						soma+=matriz[i][j];
					}
				}
			}
			System.out.printf("%.1f\n",soma/cont);
			;
		}
				tc.close();
	}
}
