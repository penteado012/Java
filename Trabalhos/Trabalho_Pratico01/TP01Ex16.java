import java.util.Scanner;

//Matheus Penteado e Kaik Persike
//16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo. Lembre-se que uma função trigonométrica trabalha em radianos.
public class TP01Ex16 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);//Instancia objeto para scanear valores
		
		System.out.println("Digite o valor em graus: ");
		double anguloRad = Math.toRadians(scanner.nextDouble());
		
		System.out.println("Seno: " + Math.sin(anguloRad));
		System.out.println("Cosseno: " + Math.cos(anguloRad));
		
        if (Math.cos(anguloRad) == 0) {
            System.out.println("Divisão por zero!!!");
        } else {
            System.out.println("Tangente: " + Math.tan(anguloRad));
            System.out.println("Secante: " + 1 / Math.cos(anguloRad));
        }
		
	}
}