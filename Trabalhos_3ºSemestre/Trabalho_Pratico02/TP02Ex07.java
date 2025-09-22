// Matheus Penteado e Kaik Persike
// 7. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.

import java.util.Scanner;

public class TP02Ex07 {
	public static void main (String []args){
		Scanner scanner = new Scanner(System.in);
		
		int[][] matriz = new int[3][4];
		int k = 1;
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				System.out.println("Digite o valor[" + (k) + "]:");
				matriz[i][j] = scanner.nextInt();
				k += 1;
			}
		}
		
		System.out.println("\n\n");
		
		System.out.print("Sua matriz sem multiplicar: \n\n");
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				System.out.print(matriz[i][j] + " | ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		System.out.println("Digite uma constante multiplicativa:");
		int multiplicativa = scanner.nextInt();
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++) {
				matriz[i][j] *= multiplicativa;
			}
		}
		
		System.out.print("\n\n");
		
		System.out.print("Sua matriz multiplicando pela constante:\n\n");
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				System.out.print(matriz[i][j] + " | ");
			}
			System.out.println();
		}
	}
}