package Aleatorio;

import java.util.Scanner;

//package Aleatorio;
//
//
//import javax.swing.JOptionPane;
//
//
//
//public class main_matriz {
//
//	public static void main(String[] args) {
//		
//		int linhas=Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade de linhas"));
//		int colunas=Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade de colunas"));
//		
//		int matriz[][]= new int[linhas][colunas];
//		
//		//add valores a matriz
//		for(int i=0;i<linhas;i++) {
//			for(int j=0;j<colunas;j++) {
//				
//				matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("add valores a posição: [" + (i+1) + "," + (j+1)+ "] da matriz"));
//				
//			}
//		}
//		// imprime resultado
//		
//		String resultado="";
//		for(int i=0;i<linhas;i++) {
//			for(int j=0;j<colunas; j++) {
//				resultado+=matriz[i][j];
//				
//				resultado+="    ";
//				
//				
//			}
//		resultado+="\n";
//		
//		
//		}
//		
//	JOptionPane.showMessageDialog(null, resultado);
//	
//	}
//	
//}




public class main_matriz {


public static void main(String[] args) {
Scanner tc = new Scanner(System.in);

	int linhas=0 /*1° valor é LINHA*/, colunas=0 /*2° valor é COLUNA*/; 
	int soma=0;
	
	
	System.out.println("de a quantidade de linhas:");
	linhas=tc.nextInt();
	System.out.println("de a quantidade de colunas:");
	colunas=tc.nextInt();
	
	int matriz[][]= new int [linhas][colunas];
	
	//add valores
	for(int i=0;i<linhas;i++) {
		for(int j=0;j<colunas;j++) {
		
			System.out.println("add valores para a posição: " +(i+0)+ ","+ (j+0));
			matriz[i][j]=tc.nextInt();
		}
	}
	
	//printa
	
	for (int i=0;i<linhas;i++) {
		
		for(int j=0;j<colunas; j++) {	
			System.out.print(" "+matriz[i][j] +" ");
				
		}
		System.out.println("");
		
	}
	
	for(int i=0;i<linhas;i++) {
		for(int j=0;j<colunas;j++) {
			if(i==j) {
				soma+=matriz[i][j];
				
			}
		}
	}
	
	System.out.println("soma da diagonal principal:"+soma);
	
			
	
	
	
	
	tc.close();		
}

}