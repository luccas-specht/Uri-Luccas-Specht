package Proposta7;


import java.util.Scanner;


public class CountingSort {


	
	
	

	public static void ordena(int[] a, int m){
        int n = a.length;
         
        int vetorAuxiliar[] = new int[m];
         
        //1ª - (Inicializar com zero)
        for(int i = 0; i < m; i++){
            vetorAuxiliar[i] = 0;
        }
         
        //2ª - Contagem das ocorrencias
        for(int i = 0; i < n; i++){
            vetorAuxiliar[a[i]]++;
        }
 
        //3ª - Ordenando os indices do vetor auxiliar
        int sum = 0;                
        for(int i = 1; i < m; i++){
            int dum = vetorAuxiliar[i];
            vetorAuxiliar[i] = sum;
            sum += dum;
        }       
        int vetorOrdenado[] = new int[n];
        for(int i = 0; i < n; i++){
            vetorOrdenado[vetorAuxiliar[a[i]]] = a[i];
            vetorAuxiliar[a[i]]++;
        }
         
        //4ª Retornando os valores ordenados para o vetor de entrada
        for (int i = 0; i < n; i++){
            a[i] = vetorOrdenado[i];
        }
    }
	



}
