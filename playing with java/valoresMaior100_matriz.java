package Aleatorio;

import java.util.*;

public class valoresMaior100_matriz {

	public static void main(String[] args) {
		 Scanner tc= new Scanner(System.in);
		 
		 int linhas=0,colunas=0;
		 System.out.println("add linhas");
		 linhas=tc.nextInt();
		 System.out.println("add colunas");
		 colunas=tc.nextInt();
    
		 int  matriz[][] = new int [linhas][colunas];
		 
		 Random generator = new Random();
		 for(int i=0;i<linhas;i++) {
			 for(int j=0;j<colunas;j++) {
				 matriz[i][j] = generator.nextInt(99);
			 }
		 }
		 
		 for(int i=0;i<linhas;i++) {
			 for(int j=0;j<colunas;j++) {
				 System.out.print(""+matriz[i][j]+ "");
			 }
			 System.out.println("");
		 }
		 tc.close();		 
	}
}