package pacoteJava;
import java.util.Random;
public class Array_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
//		que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
//		imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
//		quantas foram as ocorr�ncias da maior pontua��o.		 
		int k, maior = 0;
		float media = 0;
		int[] vet = new int[10];
		 // new faz a inst�ncia do objeto
		Random gerador = new Random();

		for (k = 0; k < 10; k++) {
			vet[k] = gerador.nextInt(6) + 1;
			System.out.println(" O valor do lan�amento " + (k + 1) + "� � --->" + vet[k]);
			 if(vet[k] == 6) {
			    	maior++;
			    }
		}
		for (k = 0; k < 10; k++)  {
			media = media + vet[k] ;
			   
	}
		System.out.println("M�dia dos valores resultantes do lan�amento = " + media/10);
		System.out.printf("O n�mero 6 foi observado  " + maior + " vez(es)");
	}

}
