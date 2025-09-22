import java.util.Scanner;

//Matheus Penteado e Kaik Persike
//3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.

public class TP01Ex03 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);//Instancia objeto para scanear valores
		
		System.out.println("Digite valor do diagonal: ");
		int diagonal = scanner.nextInt();
		
		int area = (diagonal*diagonal)/2;
		
		System.out.println("A area do quadrado é: " + area);			
		
	}
}