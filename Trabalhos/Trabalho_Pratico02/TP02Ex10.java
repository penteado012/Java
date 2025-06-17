// Matheus Penteado e Kaik Persike
// 10. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário, sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos, calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x colunas).
import java.util.Scanner;

public class TP02Ex10 {
	public static void main (String []args){
		Scanner scanner = new Scanner(System.in);
		
		int ordem;		
		int k = 1;
		
		do {
            System.out.println("Digite a ordem da matriz quadrada [max 10]:");
            ordem = scanner.nextInt();
        } while (ordem <= 0 || ordem > 10);
        
        int[][] matriz = new int[ordem][ordem];		
		
		for(int i = 0; i < ordem; i++){
			for(int j = 0; j < ordem; j++){
				System.out.println("Digite o valor[" + (k) + "] da matriz:");
				matriz[i][j] = scanner.nextInt();
				k += 1;
			}
		}
        int[][] matrizInversa = new int[ordem][ordem];
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                matrizInversa[i][j] = matriz[i][ordem - 1 - j];
            }
        }
        System.out.println("\nMatriz inversa (espelhada horizontalmente):");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print(matrizInversa[i][j] + "\t| ");
            }
            System.out.println();
        }
        scanner.close();
	}
}