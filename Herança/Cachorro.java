package Herança;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		 this.setNome(nome);
		 this.setIdade(idade);
	}
	public void Correr() {
		
		Boolean correr = true;
		System.out.println("Correndo ...");
	}
}
