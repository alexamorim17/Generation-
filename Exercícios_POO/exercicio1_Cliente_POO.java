package Exercícios_POO;

public class exercicio1_Cliente_POO {
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Pedro ", "Rodrigues ", "Silva" );
		

		cliente1.nomeCompleto();
		cliente1.comprar(5000.0);
		cliente1.idade = 20;
		
		System.out.println(cliente1.nome+ " "+ cliente1.idade + " de idade");
		
		
		
		
		
		
	}
	
}
