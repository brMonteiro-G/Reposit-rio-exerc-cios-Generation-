package pacoteJava;

import java.util.Scanner;

public class Array_4 {
//Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
//	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
//	diagonal, ou seja, diagonal principal.

	public static void main(String[] args) {

		int soma = 0, l, c, soma1 = 0;
		Scanner ler = new Scanner(System.in);
		int[][] array = new int[3][3];

		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				System.out.println("Entre com o valor das matrizes");
				array[l][c] = ler.nextInt();

			}
		}

		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				soma = soma + array[l][c];
				if (l == c) {
					soma1 = soma1 + array[l][c];
				}
			}
		}
			for (l = 0; l < 3; l++) {
				for (c = 0; c < 3; c++) {
					System.out.println("O elemento  " +l +" "+ c +"  da matriz resultante "+ "---> "  +  array[l][c]);
					 
				}
			}
			System.out.println("A soma dos valores é ---> " + soma);
			System.out.println("A soma dos valores da diagonal principal é ---> "+ soma1);

	}
}
