package Exercícios_POO;

import java.util.Scanner;

class funcionária {
	
	public String nome;
	public Double salario;
	private int anos_de_empresa;
	String cargo ;
	
	

	

	void trabalhando() {
		
		System.out.println("Você está trabalhando");	

	}
	void desenvolvendo() {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Desenvolvendo: ");
		this.cargo = ler.nextLine();	
		
		ler.close();

	}
	
	

	public int getAnos_de_empresa() {
		return anos_de_empresa;
	}
	public void setAnos_de_empresa(int anos_de_empresa) {
		this.anos_de_empresa = anos_de_empresa;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
