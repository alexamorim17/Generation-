package Exercícios_POO;

public class Cliente {
	
	//Definindo Atributos
	String nome;
	String data;
	double Dinheiro;
	
	private String primeiro_nome;
	private String segundo_nome;
	private String ultimo_nome;
	public int idade;
	
	
	//Definindo Métodos
	
	  void comprar(double renda) {
		 
		if(renda > 1000) {
			 System.out.println("Cliente comprou");
		}else {
			System.out.println("Cliente não comprou");
		}
	 }
	  
	  
	  public Cliente(String primeiro,String segundo,String ultimo) {
		  
		  primeiro_nome = primeiro;
		  segundo_nome = segundo;
		  ultimo_nome = ultimo;
		  
		  
		  
	  }
	  
	  public String nomeCompleto() {
		  
		  String nomeCompleto = primeiro_nome + segundo_nome + ultimo_nome;
		  this.nome = nomeCompleto;
		  return nomeCompleto;
	  }
	  
	
}
