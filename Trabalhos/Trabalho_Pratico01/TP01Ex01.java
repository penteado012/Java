import java.util.Scanner;

//Matheus Penteado e Kaik Persike
//1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.

public class TP01Ex01 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);//Instancia objeto para scanear valores
		
		System.out.println("Digite valor da base: ");
		int base = scanner.nextInt();
		
		System.out.println("Digite o valor da altura: ");
		int altura = scanner.nextInt();
		
		int area = base * altura;//Calcula a area do retangulo
		
		System.out.println("A area do seu retângulo é: " + area);			
		
	}
}