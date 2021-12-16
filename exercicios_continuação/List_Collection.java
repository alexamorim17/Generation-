package exercicios_continuação;

import java.util.ArrayList;
import java.util.Scanner;

public class List_Collection {

	public static void main(String[] args) {
		
		ArrayList<String> loja = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		String produto;
		while(loja.size() < 10) {
			
			System.out.println("Digite o produto em estoque( 0 para parar): ");
			produto = ler.nextLine();
			if (produto == "0") {
				System.out.println("Você tem :"+loja.size()+" em estoque");
				break;
			}
			loja.add(produto);
			
		}
		
		if(loja.isEmpty()) {
			
			System.out.println("Estoque encontra-se vazio.");
		}else {
			System.out.println("Você tem :"+loja.size()+" em estoque");	;
		}
		}
		

	}


