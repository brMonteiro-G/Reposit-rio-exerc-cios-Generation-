package pacoteJava;

import java.util.Scanner;

public class La�o_repeti��o_for_1 {
	// Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
	// obtemos resto = 5.

	public static void main(String[] args) {
		
		int x,num=0, cont=0;
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Quantos n�meros de 1000 a 1999 que dividos por 11 tem resto = 5? ");
		System.out.println("Pressione 0 para saber ");
		num = ler.nextInt();
		
     if(num==0) {
		for(x=1000;x<=1999;x++) {
			
			if(x%11==5) {
			 
				cont = cont + 1;
				
			}
			
		}
		System.out.println("Temos " + cont + "  condi��es que atendem essas condi��es ");
      }	
     else {
    	 
    	 System.out.println("Nem queria te contar mesmo");
    	 System.out.println("Fim do programa !!!");
     }
	

	}
}
