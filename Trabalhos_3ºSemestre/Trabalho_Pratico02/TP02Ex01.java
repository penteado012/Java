// Matheus Penteado e Kaik Persike
//1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro. Caso contrário solicitar novamente apenas o segundo valor.

import java.util.Scanner;

public class TP02Ex01{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double v1, v2;
		System.out.println("Digite o primeiro valor: ");
		v1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		v2 = scanner.nextDouble();
		
		if(v2 <= v1) {
			do{
				System.out.println("ERRO! O segundo valor deve ser maior que o primeiro valor.");
				System.out.println("Digite o segundo valor: ");
				v2 = scanner.nextDouble();
			}while(v2 <= v1);
		}
		
		System.out.println("Primeiro valor: " + v1);
		System.out.println("Segundo valor: " + v2);
	}
}