// Matheus Penteado e Kaik Persike
//2. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de erro, se necessário. Após a digitação, exibir: a. O maior valor; b. A soma dos valores; c. A média aritmética dos valores.

import java.util.Scanner;

public class TP02Ex02{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] valores = new double[10];
		double maior = 0;
		double soma = 0;
		double media;
		
		for(int i = 0; i < 10; ++i) {
			do{
			System.out.println("Digite o valor: [" + (i+1) + "]");
			valores[i] = scanner.nextDouble();
			
			if(valores[i] < 0){
				System.out.println("Erro! o valor deve ser maior que 0[zero]");
			}
			}while(valores[i] < 0);
			
			soma += valores[i];
			
			if(valores[i] > maior) {
				maior = valores[i];
			}				
		}
		
		media = soma / 10;
		
		System.out.println("Maior Valor Digitado: " + maior);
		System.out.println("Soma dos valores: " + soma);
		System.out.println("Media Aritmetica: " + media);
	}
}