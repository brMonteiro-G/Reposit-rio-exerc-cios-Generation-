package pacoteJava;
import java.util.Scanner;
public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
//		atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
		
		int i, k=5, soma=0;
		Scanner ler = new Scanner(System.in);
		int vet[] = new int [k]; 
		int maior= vet[0];
		
		for(i=0;i<5;i++) {
			System.out.println("Entre com o "+ (i+1) + "º  valor :");
			vet[i] = ler.nextInt();
			
		}
		
		for(i=0;i<5;i++) {
			
			soma = soma + vet[i];
			  if(vet[i]>maior){
				  	maior = vet[i];
			  }
		}
		for(i=0;i<5;i++)	{
			if(vet[i]==maior) {
				System.out.println("O valor numérico na posição " + (i+1) + " Foi de ---> " + vet[i] + " <---  maior valor");
			}
			else {
				System.out.println("O valor numérico na posição " + (i+1) + " Foi de --->" + vet[i]);
		}
			
		}
	}

}
