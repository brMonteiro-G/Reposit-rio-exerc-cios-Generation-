package pacoteJava;
import java.util.Scanner;

public class E5 {
	public static void main(String[] args) {
		
		float n1,n2,n3,calculo;
		try (Scanner ler = new Scanner(System.in)){
		
		System.out.println("Digite a nota da P1");
		n1 = ler.nextFloat(); 
		System.out.println("Digite a nota da P2");
		n2 = ler.nextFloat(); 
		System.out.println("Digite a nota da P3");
		n3 = ler.nextFloat(); 
		
		calculo = (n1*2 + n2*3 + n3*5)/10;
		
		System.out.println("A média do aluno foi de:  " + calculo );
		
		}
		
	}

}
