package pacoteJava;

import java.util.Scanner;

public class La�o_condicional4 {
	public static void main(String[] args) {
		
		double n,calculo1,calculo2;
		String res,res1;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero");
		n = ler.nextFloat();
		
		if (n%2 == 0) {
			System.out.println("Este n�mero � par");
			System.out.println("Voc� gostaria de saber a raiz quadrada desse n�mero ?");
			res = ler.next();
				switch(res) {
				
				case"sim":
					calculo1 = Math.sqrt(n); 
					System.out.println(calculo1);
					break;
				case "n�o":
					System.out.println("Ok");
					break;
				default : 
					System.out.println("Apenas s�o aceitas como resposta sim ou n�o !!!");
				}
			}
		  if(n%2 ==1) {
			  System.out.println("Este n�mero � �mpar");
			  System.out.println("Voc� gostaria de saber a pot�ncia quadrada desse n�mero ?");
				res1 = ler.next();
					switch(res1) {
					
					case"sim":
						calculo2 = Math.pow(n, 2); 
						System.out.println(calculo2);
						break;
					case "n�o":
						System.out.println("Ok");
						break;
					default : 
						System.out.println("Apenas s�o aceitas como resposta sim ou n�o !!!");
			  
			
		   }
					System.out.println("Fim do programa!!");
		}
	}
}
