// Matheus Penteado e Kaik Persike
// 11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário, sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos, calcular e exibir determinante da matriz.

import java.util.Scanner;

public class TP02Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ordem;

        do {
            System.out.print("Digite a ordem da matriz quadrada (até 10): ");
            ordem = scanner.nextInt();
        } while (ordem <= 0 || ordem > 10);

        int[][] matriz = new int[ordem][ordem];
        int k = 1;

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Digite o valor [" + k + "]: ");
                matriz[i][j] = scanner.nextInt();
                k++;
            }
        }

        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int determinante = 0;

        if (ordem == 2) {
            determinante = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
        } else if (ordem == 3) {
            determinante =
                matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1]) -
                matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0]) +
                matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);
        } else {
            System.out.println("\nDeterminante só disponível para matrizes 2x2 ou 3x3 neste exemplo.");
            return;
        }

        System.out.println("\nDeterminante da matriz: " + determinante);
    }
}
