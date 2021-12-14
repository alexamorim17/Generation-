package Exercícios_POO;

public class exercicio3_Eletronico_POO {

	public static void main(String[] args) {
		
		produto_Eletronico videogame = new produto_Eletronico("Playstation5", "Sony", 4000.00 );
		
		System.out.println(videogame.nome +"\n"+videogame.marca+ "\n"+ "R$"+videogame.preco );
		videogame.baixando();
		videogame.carregando(100);
		videogame.jogar();
		
	
		

	}

}
