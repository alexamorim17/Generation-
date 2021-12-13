package Lista_Matriz_Java;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		int x;
		int vet[] = new int[5];
		
		x = maior();
		imprime(x);
		fim();
		
		

	}
	
	//Definindo classes
	
	public static int maior(){
		
		Scanner ler = new Scanner (System.in);
		int x = 0;
		int vet[] = new int[5];
		for(x = 0; x<5;x++) {
			pergunta();
			vet[x] = ler.nextInt();
			
			
			
		}
		
		
		int maior = vet[0];
		int aux = 0;
		int y = 0;
		
		for (x = 0; x<5; x ++) {
			
			for (y = 1; y <5; y++) {
				
				if (vet[x]>vet[y]) {
					
					aux = vet[x];
					vet[y] = vet[x];
					vet[x] = aux;
				}
			}
			
		}
		
		maior = vet[4];
		return maior;
	}
	
	public static void pergunta() {
		
		System.out.println("Digite um número: ");
	}
	
	public static void imprime(int x) {
		
		System.out.println("O maior valor é :" + x);
	}
	public static void fim() {
		
		System.out.println("FIM DO PROGRAMA");
	}
	
	
}


