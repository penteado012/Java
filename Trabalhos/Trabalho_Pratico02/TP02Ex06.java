// Matheus Penteado e Kaik Persike
// 6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.

import java.util.Scanner;

public class TP02Ex06 {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		
		String[][] matriz = {{"Matheus", "Kaik", "Isabelle"},
							{"Junior", "Marcia", "Heitor"}};
						  
		System.out.println("Os valores da matriz: ");
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++){
				System.out.print(matriz[i][j] + " | ");
			}
			System.out.println();
		}			 
	}
}