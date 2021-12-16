package exercicios_continuação;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		
		super.setNome(nome);
		super.setIdade(idade);
	
	


}
	@Override
	void Correr() {
		
		System.out.println("Relichando");
		
	}

	@Override
	void emitirSom() {
		
		System.out.println("Trotando");
	}
	
	

}
