package Exercícios_POO;

public class exercicio2_Cliente_POO {

	public static void main(String[] args) {
		
		Avião aviao = new Avião();
		
		aviao.cor = "Azul";
		aviao.material = "Metal";
		aviao.velocidade = 100;
		
		aviao.carregar(70);
		System.out.println("Cor do avião: " + aviao.cor);
		System.out.println("Material do avião: "+aviao.material);
		System.out.println("Velocidade :"+ aviao.voar(100));
		

	}

}
