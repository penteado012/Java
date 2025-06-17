import java.util.Scanner;

//Matheus Penteado e Kaik Persike
//7. Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.

public class TP01Ex07 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);//Instancia objeto para scanear valores
		
		System.out.println("Digite valor da nota 1: ");
		int nota1 = scanner.nextInt();
		
		System.out.println("Digite valor da nota 2: ");
		int nota2 = scanner.nextInt();

		double notafinal = Math.pow((nota1*nota2), 1.0/2.0);
		
		System.out.println("A media geometrica e: " + notafinal);			
		
	}
}