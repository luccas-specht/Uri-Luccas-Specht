package uri_random;

import java.util.*;
public class thor_URI1865 {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
	
		String nome;
		int forca;
		
		int teste =tc.nextInt();
		for(int i=0;i<teste; i++){
			
			nome=tc.next();
			forca=tc.nextInt();
			
			
			if(nome.equals("Thor")) {
				System.out.println("Y");
			}else {
				System.out.println("N");
				
			}	
		}
		
		tc.close();
	}
}