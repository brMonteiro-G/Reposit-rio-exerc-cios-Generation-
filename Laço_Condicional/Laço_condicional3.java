package pacoteJava;
import java.util.Scanner;
public class La�o_condicional3 {
	public static void main(String[] args) {
		
		int idade; 
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero");
		idade = ler.nextInt();
		
		if(10<=idade && idade <= 14) {
		System.out.println("Voc� est� na categoria de 10 at� 14 anos");
		}
		if(15<=idade && idade <= 17) {
			System.out.println("Voc� est� na categoria de 15 at� 17 anos");
			}
		if(18<=idade && idade <= 25) {
			System.out.println("Voc� est� na categoria de 18 at� 25 anos");
			}
		if(idade<10 || idade>25 ) {
			System.out.println("Voc� n�o se encaixa em nenhuma categoria !!!");
		}
		
	}

}
