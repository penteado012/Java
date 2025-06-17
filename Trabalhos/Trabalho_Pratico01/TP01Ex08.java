import java.util.Scanner;

//Matheus Penteado e Kaik Persike
//8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e dois metros e que um quilômetro possui mil metros, fazer um programa para converter milhas marítimas em quilômetros.

public class TP01Ex08 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);//Instancia objeto para scanear valores
		
		System.out.println("Digite as milhas marítimas a serem convertidas: ");
		double milhasEmKm = scanner.nextDouble()*1.852;
		
		System.out.println("Milhas em km e: " + milhasEmKm + "km");			
		
	}
}