package pacoteJava;
import java.util.Scanner;
public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
//		atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
		
		int i, k=5, soma=0;
		Scanner ler = new Scanner(System.in);
		int vet[] = new int [k]; 
		int maior= vet[0];
		
		for(i=0;i<5;i++) {
			System.out.println("Entre com o "+ (i+1) + "�  valor :");
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
				System.out.println("O valor num�rico na posi��o " + (i+1) + " Foi de ---> " + vet[i] + " <---  maior valor");
			}
			else {
				System.out.println("O valor num�rico na posi��o " + (i+1) + " Foi de --->" + vet[i]);
		}
			
		}
	}

}
