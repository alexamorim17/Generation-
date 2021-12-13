package Lista_Matriz_Java;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int a,b;
		int N1[][] = new int [4][6];
		int N2[][] = new int [4][6];
		int M1[][] = new int [4][6];
		int M2[][] = new int [4][6];
		
		for(a = 0; a <4; a++) {
			
			for(b = 0; b <6; b++) {
				

				System.out.print("Digite um número: ");
				N1[a][b] = entrada.nextInt();
				
			}
			
		}
		//Imprimindo Matriz 1
		for(a = 0; a <4; a++) {
			
			for(b = 0; b <6; b++) {
				System.out.print("["+ N1[a][b] + "]");
		
			}
			System.out.println(" ");
		}
		
		
		
		
		
		for(a = 0; a <4; a++) {
			
			for(b = 0; b <6; b++) {
				
	
				System.out.println("Digite um número: ");
				N2[a][b] = entrada.nextInt();
				
				
			}
			System.out.println(" ");
		}
		//Imprimindo Matriz 2
		for(a = 0; a <4; a++) {
			
			for(b = 0; b <6; b++) {
				System.out.print("["+ N2[a][b] + "]"+"\t");
		
			}
			
			System.out.println(" ");
		}
		
		
		
		//Soma
		for(a = 0; a <4; a++) {
			
			for(b = 0; b <6; b++) {
				
				M1[a][b] = N1[a][b] + N2[a][b];
				
			}
		}
			
		for(a = 0; a <4; a++) {

			for(b = 0; b <6; b++) {
					System.out.print("["+ M1[a][b] + "]");
			}
			System.out.println(" ");
		}System.out.println(" ");
		//Subtração
		
		for(a = 0; a <4; a++) {
			
			for(b = 0; b <6; b++) {
				
				M2[a][b] = N1[a][b] - N2[a][b];
				
				
			}
			
		}
		
		
		
		for(a = 0; a <4; a++) {
			
			for(b = 0; b <6; b++) {
				System.out.print("["+ M2[a][b] + "]");
		
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		
	}

}
		

		

