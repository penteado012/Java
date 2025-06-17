import java.util.Scanner;

//Matheus Penteado e Kaik Persike
//9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.

public class TP01Ex09 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);//Instancia objeto para scanear valores
		
		System.out.println("Digite valor da resistencia: ");
		double resistencia = scanner.nextDouble();
		
		System.out.println("Digite valor da corrente eletrica: ");
		double correnteEletrica = scanner.nextDouble();
		
		double tensao = correnteEletrica * resistencia;
		
		System.out.println("O valor da tensao e " + tensao);			
		
	}
}