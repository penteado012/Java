import java.util.Scanner;

public class Ex03 {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);		
		int nmes;
		
		while(true) {
		System.out.println("Digite o numero do mes [1 a 12]");
		nmes = scanner.nextInt();
			if(nmes < 1 || nmes > 12) {
				continue;
			}
			break;
		}
		
		switch(nmes) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("O mes escolhido tem 31 dias");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("O mes escolhido tem 30 dias");
				break;
			case 2:
				System.out.println("O mes escolhido tem 28 dias");
				break;
			default:
				System.out.println("Número invalido, favor digitar o numero correto");
				break;			
		}
		scanner.close();
	}
}