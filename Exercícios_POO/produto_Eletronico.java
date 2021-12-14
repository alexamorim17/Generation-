package Exercícios_POO;

public class produto_Eletronico {
	
	//Definindo atributos
	
	
	String nome;
	String marca;
	Double preco;
	
	public produto_Eletronico(String n, String m, Double p){
		
		nome = n;
		marca = m;
		preco = p;
	}
	
	void carregando(double porcentagem) {
		
		if (porcentagem == 100) {
			
			System.out.println(porcentagem+"%" + " Jogo Carregado! Iniciando...");
		}else {
			System.out.println(porcentagem + " Carregando");
		}

	}
	
	void baixando() {
		
		System.out.println("Baixando...");
	}
	
	void jogar() {
		System.out.println("Você está jogando");
	}
	
	
	


}
