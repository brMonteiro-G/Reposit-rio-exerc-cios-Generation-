package pacoteJava;

import java.util.Scanner;

public class E3 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int s, h, m, totais;

		System.out.println("Digite o tempo em segundos");
		totais = ler.nextInt();

		h = totais / 3600;

		m = (totais%3600) / 60;
		s = ((totais % 3600) / 60) / 60;
		
		System.out.println(" O tempo é \n" + h + "horas\n" + m + "minutos\n" + s + "segundos");
		
	}
}
