package Exerc�cios_POO;

public class exercicio2_Cliente_POO {

	public static void main(String[] args) {
		
		Avi�o aviao = new Avi�o();
		
		aviao.cor = "Azul";
		aviao.material = "Metal";
		aviao.velocidade = 100;
		
		aviao.carregar(70);
		System.out.println("Cor do avi�o: " + aviao.cor);
		System.out.println("Material do avi�o: "+aviao.material);
		System.out.println("Velocidade :"+ aviao.voar(100));
		

	}

}
