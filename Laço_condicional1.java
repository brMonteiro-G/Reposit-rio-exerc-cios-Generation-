package pacoteJava;

import java.util.Scanner;

public class La�o_condicional1 {
	public static void main(String[] args) {

		int n1 = 0, n2 = 0, n3 = 0;
		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com n�meros inteiros e positivos");
		System.out.println("Digite o primeiro n�mero");
		n1 = ler.nextInt();
		System.out.println("Digite o segundo n�mero");
		n2 = ler.nextInt();
		System.out.println("Digite o terceiro n�mero");
		n2 = ler.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior n�mero dentre os tr�s �:" + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("O maior dentre os tr�s �:" + n2);
		}

		else if (n3 > n2 && n3 > n1) {
			System.out.println("O maior n�mero dentre os tr�s �:" + n3);
		} else {
			System.out.println("Os n�meros s�o iguais!!!");
		}
	}

}
