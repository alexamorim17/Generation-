package exercicios_continua��o;

public class Pregui�a extends Animal {
	
	public Pregui�a(String nome, int idade) {
		
		super.setNome(nome);
		super.setIdade(idade);
	
	


}
	void subindoArvore() {
		System.out.println("Subindo a arv�re lentamente..");

}

	@Override
	void emitirSom() {
		
		System.out.println("Fazendo soms.");
	}

	@Override
	void Correr() {
		// TODO Auto-generated method stub
		
		System.out.println("Est� subindo a arv�re");
		
	}
	
}