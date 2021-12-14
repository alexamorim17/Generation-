package Lista2Java;

import java.util.Scanner;

public class exercicio2Java {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		int n1,n2,n3, a, b, c;
		
		
		a = 0;
		b = 0;
		c = 0;
		System.out.println("Digite N1:");
		n1 = ler.nextInt();
		System.out.println("Digite N2:");
		n2 = ler.nextInt();
		
		System.out.println("Digite N3:");
		n3 = ler.nextInt();
		
		//n1
		if( n1 > n2 & n1 > n2){
			
			a = n1;
			
		}else if (n2> n3 && n2> n1) {
			
			a = n2;
		}else if (n3 > n2 && n3>n1) {
			
			a = n3;
		}
		
		
		
		//n2
		
		if((n1 > n2 || n1 >n3) && (n1 < n2 || n1 < n3)){
			
			b = n1;
			
			
		}else if((n2 > n1 || n2 >n3) && (n2 < n1 || n2 < n3)){
			
			b = n2;
			
			
		}else if((n3 > n1 || n3 >n2) && (n3 < n1 || n3 < n2)){
			
			b = n2;
			
		}
		
		//n3
		
		if(n1 < n2 && n1 <n3) {
			
			c = n1;
		}else if(n2 < n1 && n2 <n3) {
			
			c = n2;
		}else if (n3 < n2 && n3 <n1) {
			
			c = n3;
		}
		
		
		//Resultado
		System.out.println(c +" , "+b +" , "+a);
		
	}
}
