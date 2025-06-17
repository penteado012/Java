import java.util.Scanner;

//Matheus Penteado e Kaik Persike
//6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.

public class TP01Ex06 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);//Instancia objeto para scanear valores
		
		System.out.println("Digite valor da nota 1: ");
		int nota1 = scanner.nextInt();
		
		System.out.println("Digite valor da nota 2: ");
		int nota2 = scanner.nextInt();
		
		System.out.println("Digite valor da nota 3: ");
		int nota3 = scanner.nextInt();
		
		System.out.println("Digite valor da nota 4: ");
		int nota4 = scanner.nextInt();
		
		
		double notafinal = (nota1+nota2+nota3+nota4) / 4;
		
		System.out.println("A media aritmetica e: " + notafinal);			
		
	}
}