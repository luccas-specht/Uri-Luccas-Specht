package ListaRP;

public class Gato {

	private String nome;
	private double peso;
	private double altura;
	private int idade;
	
	
	public Gato() {
	}
	

	public Gato(String nome, double peso, double altura) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	public static boolean miar() {
	
		boolean miar=true;
		System.out.println("O gato miou");
		
		return  miar;
	}
	
	
	
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}
