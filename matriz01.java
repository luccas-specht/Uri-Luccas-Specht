package Aleatorio;

import java.util.Scanner;

public class matriz01 {

	public static void main(String[] args) {
		Scanner tc= new Scanner(System.in);
		
		
		
		int linhas=0, colunas=0;
		System.out.println("add linhas");
		linhas=tc.nextInt();
		System.out.println("add colunas");
		colunas=tc.nextInt();
		
		int matriz[][]= new int [linhas][colunas];
		
	    //troca valores;
		for(int i=0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
				if(i==0||i%2==0){
					matriz[i][j]=-1;
				}else {
					matriz[i][j]=0;
				
				}
//			matriz[i][j]=tc.nextInt();
			}
		}
		
		for(int i=0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
				System.out.print("["+matriz[i][j]+"]");
			}
		System.out.println("");
		}
		
		
//		d) 0:-1 -1 -1 -1 -1 -1
//		   1: 0 0 0 0 0 0
//		   2: -1 -1 -1 -1 -1 -1
//		   3: 0 0 0 0 0 0
//		   4: -1 -1 -1 -1 -1 -1
//		   5: 0 0 0 0 0 0
//		   6: -1 -1 -1 -1 -1 -1
//		   7: 0 0 0 0 0 0
//		   8: -1 -1 -1 -1 -1 -1

		tc.close();
	}

}
