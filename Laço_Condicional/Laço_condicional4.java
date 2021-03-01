package pacoteJava;

import java.util.Scanner;

public class Laço_condicional4 {
	public static void main(String[] args) {
		
		double n,calculo1,calculo2;
		String res,res1;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		n = ler.nextFloat();
		
		if (n%2 == 0) {
			System.out.println("Este número é par");
			System.out.println("Você gostaria de saber a raiz quadrada desse número ?");
			res = ler.next();
				switch(res) {
				
				case"sim":
					calculo1 = Math.sqrt(n); 
					System.out.println(calculo1);
					break;
				case "não":
					System.out.println("Ok");
					break;
				default : 
					System.out.println("Apenas são aceitas como resposta sim ou não !!!");
				}
			}
		  if(n%2 ==1) {
			  System.out.println("Este número é ímpar");
			  System.out.println("Você gostaria de saber a potência quadrada desse número ?");
				res1 = ler.next();
					switch(res1) {
					
					case"sim":
						calculo2 = Math.pow(n, 2); 
						System.out.println(calculo2);
						break;
					case "não":
						System.out.println("Ok");
						break;
					default : 
						System.out.println("Apenas são aceitas como resposta sim ou não !!!");
			  
			
		   }
					System.out.println("Fim do programa!!");
		}
	}
}
