package Lista2Java;

import java.util.Scanner;

public class exercicio1Java {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
	
		System.out.println("Digite N1:");
		n1 = ler.nextInt();
		System.out.println("Digite N2:");
		n2 = ler.nextInt();
		
		System.out.println("Digite N3:");
		n3 = ler.nextInt();
		
		
		if (n1 > n2 && n1> n3) {
			
			System.out.println("O maior número: " + n1);
			
		}else if(n2 > n1 && n2>n3){
			
			System.out.println("O maior número: " + n2);
			
		}else if(n3 >n1 && n3 >n2) {
			
			System.out.println("O maior número: " + n3);
		}
	}

}
