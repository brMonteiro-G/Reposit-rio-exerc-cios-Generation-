package pacoteJava;
import java.util.Scanner;
public class la�o_repeti��o_dowhile_5 {
	//Crie um programa que leia um n�mero do teclado at� que encontre um
		//n�mero igual a zero. No final, mostre a soma dos n�meros
		//digitados.(DO...WHILE) 
	public static void main(String[] args) {
		
		int x,num=1,soma=0;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite um n�mero ");
			num = ler.nextInt();
			soma = soma +num;
		}while(num!=0);
		
		System.out.println("A soma dos n�meros �:"+ soma );
   }
}
