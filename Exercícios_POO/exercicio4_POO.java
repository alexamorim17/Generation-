package Exerc�cios_POO;

public class exercicio4_POO {
	
	public static void main(String[] args) {
		
		funcion�ria trabalhador = new funcion�ria();
		
		trabalhador.salario = 1000.00;
		trabalhador.trabalhando();
		trabalhador.desenvolvendo();
		trabalhador.setAnos_de_empresa(6);
		trabalhador.nome = "Robson";
		System.out.println("Nome: "+ trabalhador.nome);
		System.out.println("Atividade: "+trabalhador.cargo);
		System.out.println(trabalhador.getAnos_de_empresa() + " anos");
		System.out.println("R$"+trabalhador.salario);
		
		
		
	}

}
