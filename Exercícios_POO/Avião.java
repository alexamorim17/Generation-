package Exerc�cios_POO;

public class Avi�o {

	
	//atributos
	String material;
	String marca;
	String cor;
	int pessoas;
	double velocidade;
	
	
	//m�todos
	
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
			
		}else if(this.pessoas < 100 && pessoas >40) {
			
			System.out.println("Regular");
			
		}else if(this.pessoas <40 && pessoas > 0) {
			
			System.out.println("Poucos Passageiros");
		}else{
			
			System.out.println("Vazio");
		}
		
		
		
	}
	
}
