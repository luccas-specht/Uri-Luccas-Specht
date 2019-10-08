
import java.util.*;

public class MainT{

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		
		float matriz[][] = new float [13][13];

		float soma=0; int cont=0;	
		
		String operacao=tc.next();
	
		for(int i=0;i<matriz.length;i++){
			for(int j=0; j<matriz.length;j++) {
				matriz[i][j]=tc.nextFloat();
			  }
			}
		if(operacao.equals("S")){
			for(int i=0;i<matriz.length;i++) {
				for(int j=0;j<matriz.length;j++) {
					if(j>i) {
						soma+=matriz[i][j];
					}
				}
			}
			System.out.printf("%.1f",soma);
			
		}if(operacao.equals("M")){
			for(int i=0;i<matriz.length;i++) {
				for(int j=0;j<matriz.length;j++) {
					if(j>i) {
						cont++;
						soma+=matriz[i][j];
					}
				}
			}
			System.out.printf("%.1f",soma/cont);
			
		}
	tc.close();
	}
}
