package Exerc�cios_POO;

public class exercicio2_Cliente_POO {

	public static void main(String[] args) {
		
		Avi�o aviao = new Avi�o();
		
		aviao.cor = "Azul";
		aviao.material = "Metal";
		aviao.velocidade = 100;
		
		aviao.carregar(200);
		System.out.println(aviao.cor);
		System.out.println(aviao.material);
		System.out.println(aviao.voar(100));
		

	}

}
