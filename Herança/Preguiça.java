package Herança;

public class Preguiça extends Animal{
	
	public Preguiça(String nome, int idade) {
		 this.setNome(nome);
		 this.setIdade(idade);
	}
	public void SubirArvore() {
		
		Boolean subir = true;
		System.out.println("Subindo arvóre...");
	}
}
