package fila;

import java.util.Scanner;
 
public class Fila {
    int capacidadeMaxima;
    int container[];
    int tamanho;
   
    public Fila(int capacidadeMaxima){
        this.capacidadeMaxima = capacidadeMaxima;
        this.container = new int[capacidadeMaxima];
        this.tamanho = 0;
    }
   
   
    public boolean adiciona(int valor){
        if(tamanho < capacidadeMaxima){
            this.container[tamanho++] = valor;
            return true;
        }
        return false;
    }
    
 
    public boolean remove(){
        if(this.tamanho == 0)
            return false;
        int valorRemovido = this.container[0];
        for(int i = 1; i < this.tamanho; i++)
            this.container[i-1] = this.container[i];
        this.tamanho--;
        return true;
    }
   
    @Override
    public String toString(){
        String saida = "";
        for(int i=0; i < tamanho; i++)
            saida += "["+this.container[i]+"]";
        return saida;
    }
   
   
    
    
    
    
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
     
        
        int numeroDeCaixas = leitor.nextInt();
        int numeroDeAtendimentos = leitor.nextInt();
        
        
        System.out.println("atende");
        
        int a=leitor.nextInt();
        
        
        
        
        
        
        
        Fila caixas[] = new Fila[numeroDeCaixas];
       
        
        
        
        
        for(int i = 0; i < numeroDeCaixas; i++){
            caixas[i] = new Fila(numeroDeAtendimentos);
        }
       
       
        for(int i = 0; i < numeroDeAtendimentos; i++){
            int atendimento = leitor.nextInt();
            int menor = numeroDeAtendimentos+1;
            int menorFila = 0;
           
            
            for(int c = 0; c < numeroDeCaixas; c++){
                if(caixas[c].tamanho < menor){
                    menor = caixas[c].tamanho;
                    menorFila = c;
                }
            }
            caixas[menorFila].adiciona(atendimento);
           
        }
       
        for(int i = 0; i < numeroDeCaixas; i++){
            System.out.println(caixas[i]);
        }
    }
   
 
}