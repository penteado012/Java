import java.util.Scanner;

//Matheus Penteado e Kaik Persike
//11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.

public class TP01Ex11 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);//Instancia objeto para scanear valores
		
		System.out.println("Digite valor do diametro: ");
		double raio = scanner.nextDouble()/2;
		
		double area = Math.PI*Math.pow(raio, 2);
		
		System.out.println("A area do circulo e " + area);			
		
	}
}