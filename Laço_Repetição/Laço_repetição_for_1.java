package pacoteJava;

import java.util.Scanner;

public class Laço_repetição_for_1 {
	// Informar todos os números de 1000 a 1999 que quando divididos por 11
	// obtemos resto = 5.

	public static void main(String[] args) {
		
		int x,num=0, cont=0;
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Quantos números de 1000 a 1999 que dividos por 11 tem resto = 5? ");
		System.out.println("Pressione 0 para saber ");
		num = ler.nextInt();
		
     if(num==0) {
		for(x=1000;x<=1999;x++) {
			
			if(x%11==5) {
			 
				cont = cont + 1;
				
			}
			
		}
		System.out.println("Temos " + cont + "  condições que atendem essas condições ");
      }	
     else {
    	 
    	 System.out.println("Nem queria te contar mesmo");
    	 System.out.println("Fim do programa !!!");
     }
	

	}
}
