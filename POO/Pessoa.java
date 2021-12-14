package POO;

public class Pessoa {
	
	private String primeiro_nome;
	private String segundo_nome;
	private String ultimo_nome;
	
	
	



	public Pessoa(String primeiro,String segundo,String ultimo){
		
		primeiro_nome = primeiro;
		segundo_nome = segundo;
		ultimo_nome = ultimo;
	
	
	}
	
	public String getnomeCompleto() {
		
		String nomeCompleto = primeiro_nome + segundo_nome + ultimo_nome;
		return nomeCompleto;
	}
}