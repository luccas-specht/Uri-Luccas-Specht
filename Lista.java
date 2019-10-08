package Lista;

public class Lista {

	public class Pessoa2 {

		
	    private String nome;
	    private Pessoa2 proximo;
	    private Pessoa2 anterior;
	   
	    public Pessoa2(String nome){
	        this.anterior = null;
	        this.proximo = null;
	        this.nome = nome;
	    }
	 
	    public String getNome() {
	        return nome;
	    }
	 
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	 
	    public Pessoa2 getProximo() {
	        return proximo;
	    }
	 
	    public void setProximo(Pessoa2 proximo) {
	        this.proximo = proximo;
	    }
	 
	    public Pessoa2 getAnterior() {
	        return anterior;
	    }
	 
	    public void setAnterior(Pessoa2 anterior) {
	        this.anterior = anterior;
	    }
	 
	   
	 
	}
}
