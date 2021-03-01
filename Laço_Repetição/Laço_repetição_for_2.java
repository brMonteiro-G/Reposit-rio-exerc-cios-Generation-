package pacoteJava;
import java.util.Scanner;
public class Laço_repetição_for_2 {
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares.
	public static void main(String[] args) {
		
		int y, num, contpar=0,contimpar=0;
		Scanner ler = new Scanner(System.in);
		
		for(y=1;y<=10;y++) {
			
			System.out.println("Entre com "+ y + "º  valor");
			num = ler.nextInt();
			if(num%2==0) {
				contpar++;
			}
			else {
				contimpar++;
			}
		}
		System.out.println("Temos " + contpar +  " valores pares" );
		System.out.println("Temos "+ contimpar + " valores impares");
	}
}
