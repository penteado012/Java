import java.util.Scanner;

//Matheus Penteado e Kaik Persike
// 14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio “r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão digitados.

public class TP01Ex14 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);//Instancia objeto para scanear valores
		
		System.out.println("Digite o valor do raio: ");
		double volumeEsfera = (4.0/3.0) * Math.PI * Math.pow(scanner.nextDouble(), 3);
		
		System.out.println("Digite o valor da aresta: ");
		double volumeCubo = Math.pow(scanner.nextDouble(), 3);
		
		System.out.println("O volume livre e " + (volumeCubo - volumeEsfera));			
		
	}
}