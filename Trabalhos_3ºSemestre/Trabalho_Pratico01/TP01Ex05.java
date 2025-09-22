import java.util.Scanner;

//Matheus Penteado e Kaik Persike
//Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.

public class TP01Ex05 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite valor do diametro: ");
		double raio = scanner.nextDouble()/2;
		
		double volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);
		
		System.out.println("O volume de sua esfera e: " + volume);			
		
	}
}