package Herança;

public class Animal {

	private String nome;
	private int idade;

	
	
	

	public void emitirSom() {
		
		boolean som = true;
		System.out.println("Está emitindo som ? "+ som);
		
		
		
		
	}

	//GETS E SETS
	
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
	

	
	//STATUS
	public void status() {
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: "+idade);
		emitirSom();
	}
	
	

	
	
}
