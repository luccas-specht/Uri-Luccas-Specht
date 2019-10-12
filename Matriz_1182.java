package Questoes_Matriz;
import java.util.*;

public class Matriz_1182 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		
		
		float matriz [][]= new float[12][12];
		float soma=0;
		int cont=0;
		
//		System.out.println("coluna");
		int coluna=tc.nextInt();
		
//		System.out.println("operacao");
		String operacao=tc.next();
		
		
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				matriz[i][j]=tc.nextFloat();
				
			}
		}
		
		//percorrendo a matriz ate a coluna
		for(int i=0;i<coluna;i++) {
			for(int j=0;j<matriz.length;j++) {
				soma+=matriz[coluna][j];
				cont++;
				
			}
		}

		if(operacao.equals("S")){
		System.out.printf("%.1f\n",soma);

		
		}if(operacao.equals("M")) {
			System.out.printf("%.1f\n", soma/cont);
		}
		
		tc.close();

//		for(int i=0;i<matriz.length;i++) {
//			for(int j=0;j<matriz.length;j++) {
//				System.out.print(" "+matriz[i][j]+ " ");
//				
//			}
//		System.out.println();
//		
//		}
//	
	
	
	}

}
