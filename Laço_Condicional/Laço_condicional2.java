package pacoteJava;

import java.util.Scanner;

public class La�o_condicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float num1, num2, num3;
		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com o primeiro n�mero");
		num1 = ler.nextFloat();
		System.out.println("Entre com o segundoo n�mero");
		num2 = ler.nextFloat();
		System.out.println("Entre com o terceiro n�mero");
		num3 = ler.nextFloat();

		if (num1 < num2 && num1 < num3) {
			if (num2 < num3) {
				System.out.println("Em ordem crescene --->" + num1 + "  " + num2 + "  " + num3);
			} else if (num3 < num2) {
				System.out.println("Em ordem crescene --->" + num1 + "  " + num3 + "  " + num2);
			}

		}

		if (num2 < num3 && num2 < num1) {
			if (num3 < num1) {
				System.out.println("Em ordem crescene --->" + num2 + "  " + num3 + "  " + num1);
			} else if (num1 < num3) {
				System.out.println("Em ordem crescene --->" + num2 + "  " + num1 + "  " + num3);
			}

		}
		if (num3 < num2 && num3 < num1) {
			if (num2 < num1) {
				System.out.println("Em ordem crescene --->" + num3 + "  " + num2 + "  " + num1);
			} else if (num1 < num2) {
				System.out.println("Em ordem crescene --->" + num3 + "  " + num1 + "  " + num2);
			}

		}
	}
}
