package fila;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class parenteses {

   
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String entrada = "";
        int qtdParentesesAbertos = 0;
        int i = 0;
        boolean b=false;
        while (i < 10000) {
            i++;
            entrada = br.readLine();
            if (entrada == null) {
                break;
            } else {
                char[] expressao = entrada.toCharArray();

                for (int j = 0; j < expressao.length; j++) {
                    switch (expressao[j]) {
                        case '(':
                            qtdParentesesAbertos++;
                            break;
                        case ')':
                            qtdParentesesAbertos--;
                            break;
                    }
                    if (qtdParentesesAbertos < 0) {
                        System.out.println("incorrect");
                        b=true;
                        break;
                    } 

                }
                 if (qtdParentesesAbertos == 0) {
                        System.out.println("correct");
                    } 
                 else if(!b) {
                   System.out.println("incorrect");
                 }
            }
                 qtdParentesesAbertos = 0;
                 b=false;

        }
    }
}