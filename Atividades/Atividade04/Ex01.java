// Matheus Penteado e Kaik Persike
// 1. Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado do tamanho informado com asteriscos e espaços em branco. Seu programa deve funcionar para quadrados com lados de todos os tamanhos entre 1 e 20.

package aula04;
import java.util.Scanner;

public class Ex01 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		int qtd;
		
		do {
			System.out.println("Digite um nº entre [1] e [21]: ");
			qtd = scanner.nextInt();
			
		} while (qtd < 1 || qtd>20);
		
		for(int i =0; i < qtd; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < qtd-2; i++) {
			System.out.print("*");
			for (int j = 0; j < qtd-2; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println("");
		}
		for(int i =0; i < qtd; i++) {
			System.out.print("*");
		}
	}
}
