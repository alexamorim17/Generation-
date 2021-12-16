package exercicios_continuação;

public class Preguiça extends Animal {
	
	public Preguiça(String nome, int idade) {
		
		super.setNome(nome);
		super.setIdade(idade);
	
	


}
	void subindoArvore() {
		System.out.println("Subindo a arvóre lentamente..");

}

	@Override
	void emitirSom() {
		
		System.out.println("Fazendo soms.");
	}

	@Override
	void Correr() {
		// TODO Auto-generated method stub
		
		System.out.println("Está subindo a arvóre");
		
	}
	
}