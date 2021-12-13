package Lista_Matriz_Java;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int x;
		
		
		
		Scanner ler = new Scanner (System.in);
		int valores[] = new int [10];
		int contador = 0;
		int maior = valores[0];
		int total = 0;
		
		
		// Definindo os elementos
		for( x = 0; x<10; x++) {
			
			imprimir();
			valores[x] = ler.nextInt();
			
			total = total + valores[x];
			
			if( maior < valores[x]) {
				maior = valores[x];
				contador += 1;
			}
			
		}
		
		
		for(x = 0; x < 10; x++) {
			
			System.out.println(valores[x]);
		}
		media(total);
		
		System.out.println("Maior número: "+maior);
		System.out.println("N° de vezes que o maior apareceu: "+contador);
		System.out.println("Média: "+media(total));
		System.out.println("Total: "+ total);
		
	

	}
	
	
	
	public static double media(double a) {
		
		Double media;
		
		media = a/10;
		
		return media;
		
	}
	
	public static void imprimir()
	{
		System.out.println("Digite o valor: ");
			}
		
	

	}


