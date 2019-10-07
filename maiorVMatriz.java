package Aleatorio;

import java.util.Scanner;

public class maiorVMatriz {

	
	
	
	
//	3 \u2013 Declarar e alimentar uma matriz quadrada de ordem 5. Em seguida solicitar que o usuário digite um
//	valor X para ser pesquisado nessa matriz. 
	
	//Construir uma rotina de busca para verificar se numero está
//	armazenado na matriz. Caso esse número ocorra na matriz, imprimir na tela a sua localização (linha e
//	coluna). Se o elemento não for encontrado na matriz ou a mensagem de \u201cnão encontrado\u201d.
//	
	
	
	
	
	
	
	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
 //1°
		int linhas=0, colunas=0;
		
		
		
		
		System.out.println("add quantidade de linhas");
		linhas=tc.nextInt();
		System.out.println("add quantidade de colunas");
		colunas=tc.nextInt();
		
		int matriz[][]= new int [linhas][colunas];
		
		//add valores na matriz
		System.out.println("add valores na matriz");
		
		for (int i =0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
				System.out.println("na posicao: ["+i+","+j+"]");
				matriz[i][j]=tc.nextInt();
			}
		}
		
		//printa
		
		System.out.println("elementos da matriz:\n");
		for(int i=0;i<linhas;i++) {
	
			for(int j=0;j<colunas;j++) {	
				System.out.print("["+matriz[i][j]+"]");
			}
			System.out.println("");
		
		}
		
		//2°
		int auxmaior=0, posiL=0, posiC=0;
		for(int i =0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
				
				if(matriz[i][j]>auxmaior) {
					auxmaior=matriz[i][j];
					posiL=i;
					posiC=j;
					
				}	
			}
		}
		
		 System.out.printf("O maior valor está na linha: %d, coluna: %d\n" , posiL , posiC);
		 System.out.println("Maior elemento encontrado na matriz: " +auxmaior);	
		
	
		
		
		 
		
tc.close();
	}
}























	






