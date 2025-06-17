import java.util.Scanner;

//Matheus Penteado e Kaik Persike
//12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados.

public class TP01Ex12 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);//Instancia objeto para scanear valores
		
		System.out.println("Digite valor do raio: ");
		double raio = scanner.nextDouble();
		
		System.out.println("Digite valor da altura: ");
		double altura = scanner.nextDouble();
		
		double volume = (1.0/3.0) * Math.PI*Math.pow(raio, 2) * altura;
		
		System.out.println("O volume do cone e " + volume);			
		
	}
}