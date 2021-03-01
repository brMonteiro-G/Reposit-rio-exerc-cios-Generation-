package pacoteJava;
import java.util.Scanner;
public class E8 {
	
	public static void main(String[] args) {
		
	 Scanner ler = new Scanner(System.in);
		float Ci,Cd,Cf,Custo_total=0;
		 
		 System.out.println("Digite o custo total de fábrica");
		 Cf = ler.nextFloat(); 
		 
		 Ci = Cf*45/100;
		 Cd = Cf*28/100; 
		 
		 Custo_total = Ci + Cd + Cf;
	
	 System.out.println("O preço que o consumidor irá pagar é:" + Custo_total);
	 
		
	}

}
