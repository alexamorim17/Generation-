package Exercícios_POO;

public class Avião {

	
	//atributos
	String material;
	String marca;
	String cor;
	int passageiros;
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
			System.out.println("Status: Cheio");
			
		}else if(this.passageiros < 100 && passageiros >40) {
			
			System.out.println("Status: Regular");
			
		}else if(this.passageiros <40 && passageiros > 0) {
			
			System.out.println("Status: Poucos Passageiros");
		}else{
			
			System.out.println("Status: Vazio");
		}
		
		
		
	}
	
}
