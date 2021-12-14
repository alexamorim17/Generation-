package Exercícios_POO;

public class Avião {

	
	//atributos
	String material;
	String marca;
	String cor;
	int pessoas;
	double velocidade;
	
	
	//métodos
	
	double voar(double quantidade) {
		
		this.velocidade = this.velocidade + quantidade;
		
		return this.velocidade;
	}
	
	double descer(double quantidade) {
		
	
		this.velocidade = this.velocidade - quantidade;
		
		return this.velocidade;
	}
	
	 void carregar(int passageiros) {
		
		if (passageiros> 100) {
			System.out.println("Cheio");
			
		}else if(passageiros < 100 && passageiros >40) {
			
			System.out.println("Regular");
			
		}else if(passageiros <40 && passageiros > 0) {
			
			System.out.println("Poucos Passageiros");
		}else{
			
			System.out.println("Vazio");
		}
		
		
		
	}
	
}
