package Herança;

public class Cavalo extends Animal{

		
	public Cavalo(String nome, int idade) {
		 this.setNome(nome);
		 this.setIdade(idade);
	}
	 void Correr() {
		
		Boolean correr = true;
		System.out.println("Correndo ...");
	}
}
