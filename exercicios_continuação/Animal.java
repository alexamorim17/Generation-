package exercicios_continua��o;

public abstract class Animal {

	
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	private int idade;
	
	
	
	abstract void Correr() ;
	abstract void emitirSom();
	
	
	
}
