import java.io.*;
import java.util.*;

public class matriz_URI_1534 {

	public static void main(String[] args)  {
       
		Scanner tc= new Scanner(System.in);
		Random g= new Random();
		
		//System.out.println("quantidade de linhas e colunas");
		//é o quantidade das linhas e colunas. que sera a mesma
		int n=tc.nextInt();
		
		int matriz[][]=new int[n][n];
		
		
            
		if(3<=n&&n<70) {
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					matriz[i][j]=g.nextInt(4);
				}
			}
			
			for(int i=0;i<n;i++) {
				 for(int j=0;j<n;j++) {
					 System.out.print(""+matriz[i][j]+"");
				 }
				 System.out.println("");
			 }
			 
			 		
		}
		
		
	
		 tc.close();	
	}
}



