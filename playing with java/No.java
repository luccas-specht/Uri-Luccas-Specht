package Proposta7;

public class No {
            private String nome;
	    private No cima;
            private No baixo;
	    private No proximo;
	    private No anterior;
	   
	    public No(String nome){
	        this.nome = nome;
                this.anterior = null;
	        this.proximo = null;
                this.cima = null;
	        this.baixo = null;
	        
	    }
	 
	    public String getNome() {
	        return nome;
	    }
	 
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	 
	    public No getProximo() {
	        return proximo;
	    }
	 
	    public void setProximo(No proximo) {
	        this.proximo = proximo;
	    }
	 
	    public No getAnterior() {
	        return anterior;
	    }
	 
	    public void setAnterior(No anterior) {
	        this.anterior = anterior;
	    }
	 
            public No getCima() {
	        return cima;
	    }
	 
	    public void setCima(No cima) {
	        this.cima = cima;
	    }
            
            public No getBaixo() {
	        return baixo;
	    }
	 
	    public void setBaixo(No baixo) {
	        this.baixo = baixo;
	    }
	}
	 

