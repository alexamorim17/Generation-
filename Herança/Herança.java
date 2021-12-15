package Herança;

public class Herança {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro("Bilu", 10);
		Cavalo v = new Cavalo ("Bolt", 15);
		Preguiça p = new Preguiça("Sid",4);
		
		c.status();
		c.Correr();
		v.status();
		v.Correr();
		p.status();
		p.SubirArvore();
		
		

	}

}
