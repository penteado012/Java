import java.util.Scanner;

//Matheus Penteado e Kaik Persike
//10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.

public class TP01Ex10 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);//Instancia objeto para scanear valores
		
		System.out.println("Digite valor da temperatura em Cº: ");
		double celsius = scanner.nextDouble();
		
		double fahrenheit = celsius*(9.0/5.0) + 32;
		
		System.out.println("A temperatura em Fahrenheit e " + fahrenheit);			
		
	}
}