import java.util.Scanner;

//Matheus Penteado e Kaik Persike
// 15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).

public class TP01Ex15 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);//Instancia objeto para scanear valores
		
		System.out.println("Digite o valor do dolar em real: ");
		double valorDolar = scanner.nextDouble();
		
		System.out.println("Digite a quantidade: ");
		double quantidade = scanner.nextDouble();
		
		System.out.println("U$" + quantidade + " = R$" + (valorDolar*quantidade));			
		
	}
}