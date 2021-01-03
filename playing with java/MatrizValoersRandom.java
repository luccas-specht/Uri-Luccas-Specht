package Aleatorio;

import java.util.Scanner;

public class MatrizValoersRandom {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		 //1°
				int linhas=0, colunas=0;
				
				
				System.out.println("add quantidade de linhas");
				linhas=tc.nextInt();
				System.out.println("add quantidade de colunas");
				colunas=tc.nextInt();
				
				int matriz[][]= new int [linhas][colunas];
				
//				//add valores na matriz
//				System.out.println("add valores na matriz");
//				
//				for (int i =0;i<linhas;i++) {
//					for(int j=0;j<colunas;j++) {
//						System.out.println("na posicao: ["+i+","+j+"]");
//						matriz[i][j]=tc.nextInt();
//					}
//				}
//		
		
//				0 1 2 3 4 5 6 7 8 9
//				0 1 2 3 4 5 6 7 8 9
//				0 1 2 3 4 5 6 7 8 9

				
				
		for(int i=0; i<linhas; i++) {
			for(int j=0; j<colunas; j++){
				if(j==0) {
					matriz[i][j]=0;
				}if(j==1) {
					matriz[i][j]=1;
				}if(j==2) {
					matriz[i][j]=2;
				}if(j==3) {
					matriz[i][j]=3;
				}if(j==4) {
					matriz[i][j]=4;
				}if(j==5) {
					matriz[i][j]=5;
				}if(j==6) {
					matriz[i][j]=6;
				}if(j==7) {
					matriz[i][j]=7;
				}if(j==8) {
					matriz[i][j]=8;
				}if(j==9) {
					matriz[i][j]=9;
				}
			}
		}
		for(int i=0;i<linhas;i++) {
			for(int j=0;j<colunas;j++){
				System.out.print("["+matriz[i][j]+"]");
			}
			System.out.println("");
		}
		
			
		tc.close();
	}
}
