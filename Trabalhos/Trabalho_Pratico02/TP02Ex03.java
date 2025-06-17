// Matheus Penteado e Kaik Persike
//3. Entrar via teclado com N valores quaisquer. O valor N (que representa a quantidade de numeros) sera digitado, devera ser positivo, porem menor que vinte. Caso a quantidade nao satisfaca a restricao, enviar mensagem de erro e solicitar o valor novamente. Apos a digitacao dos "N" valores, exibir: a. O maior valor; b. O menor valor; c. A soma dos valores; d. A media aritmetica dos valores; e. A porcentagem de valores que sao positivos; f. A porcentagem de valores negativosimport java.util.Scanner;

import java.util.Scanner;
public class TP02Ex03{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		char fim = 'S';
		
		while(fim == 'S' || fim == 's'){
		
			int vDigitavel = 0;
			int j = 0;
			
			while(j == 0){
				System.out.println("Quantos valores deseja digitar?[devera ser positivo e menor que 20]");
				vDigitavel = scanner.nextInt();
				if(vDigitavel <= 0) {
					System.out.println("O valor deve ser maior que zero!");
					continue;
				}
				if(vDigitavel > 20) {
					System.out.println("O valor deve ser menor que 20");
					continue;
				}
				j = 1;
			}
			
			double[] valores = new double[vDigitavel];
			double maior = Integer.MIN_VALUE;
			double soma = 0;
			double media;
			double menor = Double.MAX_VALUE;
			double quantValorPositivo = 0;
			double quantValorNegativo = 0;
			
			
			for(int i = 0; i < vDigitavel; ++i) {
				
				System.out.println("Digite o valor: [" + (i+1) + "]");
				valores[i] = scanner.nextDouble();
				
				soma += valores[i];
				
				if(valores[i] > maior) {
					maior = valores[i];
				}			
				if(valores[i] < menor){
					menor = valores[i];
				}
				if(valores[i] > 0) {
					quantValorPositivo++;
				}
				if(valores[i] < 0) {
					quantValorNegativo++;
				}
			}
			
			
			media = soma / vDigitavel;
			
			System.out.println("Maior Valor Digitado: " + maior);
			System.out.println("Menor Valor Digitado: " + menor);		
			System.out.println("Soma dos valores: " + soma);
			System.out.println("Media Aritmetica: " + media);
			
			double porcValorPositivo = (quantValorPositivo / vDigitavel) * 100;
			double porcValorNegativo = (quantValorNegativo / vDigitavel) * 100;
			
			System.out.println("Porcentagem de valores positivos: " + porcValorPositivo + "%");		
			System.out.println("Porcentagem de valores negativos: " + porcValorNegativo + "%");
		
			System.out.println("Deseja fazer uma nova execução? [S(sim)] ou [N)não]");
			fim = scanner.next().charAt(0);
		}
		
	}
}