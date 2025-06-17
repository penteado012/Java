import java.util.Scanner;

//Matheus Penteado e Kaik Persike
//4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

public class TP01Ex04 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite valor da base: ");
		int base = scanner.nextInt();
		
		System.out.println("Digite o valor da altura: ");
		int altura = scanner.nextInt();
		
		int area = (base * altura) / 2;
		
		System.out.println("A area do seu triângulo é: " + area);			
		
	}
}