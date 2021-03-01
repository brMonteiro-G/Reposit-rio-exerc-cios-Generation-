package pacoteJava;
import java.util.Scanner;
public class laço_repetição_dowhile_5 {
	//Crie um programa que leia um número do teclado até que encontre um
		//número igual a zero. No final, mostre a soma dos números
		//digitados.(DO...WHILE) 
	public static void main(String[] args) {
		
		int x,num=1,soma=0;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número ");
			num = ler.nextInt();
			soma = soma +num;
		}while(num!=0);
		
		System.out.println("A soma dos números é:"+ soma );
   }
}
