package uri_random;

import java.util.Scanner;
public class UriFuncionario_1008 {

	public static void main(String[] args) {
		Scanner tc= new Scanner(System.in);
		
		int id=tc.nextInt(); 
		int horas=tc.nextInt(); 
		float salario=tc.nextFloat();
		
		
		System.out.println("NUMBER = "+id);
		System.out.printf("SALARY = U$ %.2f\n",(float)(horas*salario));
		
		tc.close();
	}
}








