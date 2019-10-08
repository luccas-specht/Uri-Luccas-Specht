package Lista1;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		
		int matriz [][] = new int [3][3];
		Scanner t= new Scanner(System.in);
		System.out.print("x");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matriz[i][j] = t.nextInt();
				
			}
		
		}
	
	
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int x=0;x<3;x++) {
					for(int y=0;y<3;y++) {
	
						if(matriz[i][j]<matriz[x][y]) {
							int o = matriz[i][j];
							matriz[i][j]=matriz[x][y];
							matriz[x][y]=o;
						}
					}
				}
			}
		}
		
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matriz[i][j]+ " ");			
			}
			System.out.print(" "+"\n");
		}
			
			
			
			
			
			
//	4,3,2,1
//		1,8,3,2
//		9,1,4,8
//		8,3,2,1
//		
			
			
			
			
			
}

}
