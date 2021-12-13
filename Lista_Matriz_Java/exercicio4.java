package Lista_Matriz_Java;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int x[][] = new int[3][3];
		int total = 0;
		
		for(int a = 0; a <3; a++) {
			
			for (int b = 0; b<3; b++) {
				
				imprimir();
				x[a][b] = entrada.nextInt();
				total = total + x[a][b];
				
				
			}
		}
		entrada.close();
		
		System.out.println("Total: "+total);
		System.out.println("Soma diagonal principal:" + (x[0][0] + x[1][1]+ x[2][2]));
	}
	
	public static void imprimir() {
		
		System.out.println("Digite um número: ");
		}
}
