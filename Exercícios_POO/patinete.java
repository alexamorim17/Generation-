package Exercícios_POO;

public class patinete {
	
	//Definindo atributos
	private String modelo;
	private String cor;
	private String material;
	private Boolean parado;
	
	
	//Definindo Método Construtor
	
	public patinete(String modelo, String cor, String material) {
		
		
		this.modelo = modelo;
		this.cor = cor;
		this.material = material;
		
		
	}
	//Definindo métodos
	
	
	
	 void Correndo() {
		 
		 this.parado = false;
			 
			 System.out.println("Correndo com o patenete...");
			

}

	void parar() {
		
		if(this.parado == true) {
			
			System.out.println("Você está parado.");
		}else {
			System.out.println("Freie para parar.");
		}
	}
	//GETS E SETS

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Boolean getParado() {
		return parado;
	}

	public void setParado(Boolean parado) {
		this.parado = parado;
	}
	
	
	//Status
	
	void Status() {
		
		System.out.println("Modelo: "+ this.modelo + "\nCor: "+ this.cor + "\nMaterial: "+ this.material);
	}
}
