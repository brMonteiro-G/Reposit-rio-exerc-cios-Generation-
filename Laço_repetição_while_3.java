package pacoteJava;

import java.util.Scanner;

public class La�o_repeti��o_while_3 {
//Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
//	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//	idade for =-99.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade=0 , cont1 = 0, cont2 = 0;
		Scanner ler = new Scanner(System.in);
		
//		System.out.println("Digite sua idade");
//		idade = ler.nextInt();
		while (idade != -99  ) {
			
			System.out.println("Digite sua idade");
			idade = ler.nextInt();
			
			 
			if(idade<110 && idade>0) {
		
				if (idade > 50) {

				 cont1++;
					}
				
				else if (idade < 21) {
				
					cont2++;
				
					}
			}
				else {
					System.out.println("op��o inv�lida");
				}
			
			
			
		}
		System.out.println("O n�mero de pessoas com menos de 21 anos ---> " + cont2);
		System.out.println("O n�mero de pessoas com mais de 50 anos ---> " + cont1);
		}

		

	}


