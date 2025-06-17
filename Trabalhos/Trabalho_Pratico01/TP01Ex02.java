import java.util.Scanner;

//Matheus Penteado e Kaik Persike
//2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.

public class TP01Ex02 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);//Instancia objeto para scanear valores
		
		System.out.println("Digite valor da aresta: ");
		int aresta = scanner.nextInt();
		
		int area = (aresta * aresta);
		
		System.out.println("A area do quadrado é: " + area);			
		
	}
}