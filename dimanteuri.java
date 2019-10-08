package fila;
import java.util.Scanner;

public class dimanteuri {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		int n = t.nextInt();
		
		for (int i=0 ; i<n ; i++){
			int cont=0, troca=1;
			
			String diamante="";
			diamante = t.nextLine();
		
			diamante = diamante.replace("[.]","");
			
			while(troca==1){
				if(diamante.indexOf("<>") != 1){ 
					cont++;
					diamante = diamante.replaceFirst("<>","");
				}
				else
					troca=0;
			}
			System.out.println(cont);
		}
		
	}

}