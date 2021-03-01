package pacoteJava;
import java.util.Random;
public class Array_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
//		que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
//		imprima a média aritmética dos lançamentos, contabilize e apresente também
//		quantas foram as ocorrências da maior pontuação.		 
		int k, maior = 0;
		float media = 0;
		int[] vet = new int[10];
		 // new faz a instância do objeto
		Random gerador = new Random();

		for (k = 0; k < 10; k++) {
			vet[k] = gerador.nextInt(6) + 1;
			System.out.println(" O valor do lançamento " + (k + 1) + "º é --->" + vet[k]);
			 if(vet[k] == 6) {
			    	maior++;
			    }
		}
		for (k = 0; k < 10; k++)  {
			media = media + vet[k] ;
			   
	}
		System.out.println("Média dos valores resultantes do lançamento = " + media/10);
		System.out.printf("O número 6 foi observado  " + maior + " vez(es)");
	}

}
