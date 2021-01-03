package Lista;

public class PessoaE2 {
	//aan<----->ana<--->bruna<--->carla<--->carlos<--->daniela<-->daniella<-->ester<--->henrique<-->talita
	
	private String nome;
	private PessoaE2 sucessor;
	private PessoaE2 antecessor;;
	
	
	
	
	// v=variavel de parametro.
	PessoaE2(String nome){
		this.sucessor=null;  //vai iniciar com; 'NULL' pq sou eu que vou atribuir os valores.
		this.antecessor=null;
		this.nome=nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public PessoaE2 getSucessor() {
		return sucessor;
	}

	public void setSucessor(PessoaE2 sucessor) {
		this.sucessor = sucessor;
	}
	
	public PessoaE2 getAntecessor() {
		return antecessor;
	}
	
	public void setAntecessor(PessoaE2 antecessor) {
		this.antecessor = antecessor;
	}

	
	
	
}
	
	
	
