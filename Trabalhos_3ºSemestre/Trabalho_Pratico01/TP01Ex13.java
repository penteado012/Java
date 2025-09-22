import java.util.Scanner;

//Matheus Penteado e Kaik Persike
//13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso (em s) que serão digitados.

public class TP01Ex13 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);//Instancia objeto para scanear valores
		
		System.out.println("Digite velocidade inicial: ");
		double vinicial = scanner.nextDouble();
		
		System.out.println("Digite a aceleração: ");
		double aceleracao = scanner.nextDouble();
		
		System.out.println("Digite o tempo do percurso em segundos: ");
		double tempopercurso = scanner.nextDouble();
		
		double vfinal = vinicial + aceleracao * tempopercurso;
		
		double vfinal_km = vfinal * 3.6;
		
		System.out.println("A velocidade final é: " + vfinal_km + "km/h");			
		
	}
}