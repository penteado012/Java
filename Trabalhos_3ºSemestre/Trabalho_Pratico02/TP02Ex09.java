// Matheus Penteado e Kaik Persike
// 9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário, sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos ementos, calcular e exibir a matriz transposta.

import java.util.Scanner;

public class TP02Ex09 {
	public static void main (String []args){
		Scanner scanner = new Scanner(System.in);
		
		int quantidadeLinhamatriz;
		int quantidadeColunasmatriz;
		
		int k = 1;
		
		do{
			System.out.println("Digite a quantidade de linhas que deseja na sua matriz: [maximo(10)]");
			quantidadeLinhamatriz = scanner.nextInt();
		}while(quantidadeLinhamatriz <= 0 || quantidadeLinhamatriz > 10);
		
		do{
			System.out.println("Digite a quantidade de colunas que deseja na sua matriz: [maximo(10)]");
			quantidadeColunasmatriz = scanner.nextInt();
		}while(quantidadeColunasmatriz <= 0 || quantidadeColunasmatriz > 10);
		
		int[][] matriz = new int[quantidadeLinhamatriz][quantidadeColunasmatriz];
		
		
		for(int i = 0; i < quantidadeLinhamatriz; i++){
			for(int j = 0; j < quantidadeColunasmatriz; j++){
				System.out.println("Digite o valor[" + (k) + "] da matriz:");
				matriz[i][j] = scanner.nextInt();
				k += 1;
			}
		}
		
		int[][] matriztransposta = new int[quantidadeColunasmatriz][quantidadeLinhamatriz]; 
		
		for(int i = 0; i < quantidadeLinhamatriz; i++) {
			for(int j = 0; j < quantidadeColunasmatriz; j++) {
				matriztransposta[j][i] = matriz[i][j];
			}
		}
		
		System.out.print("\n\n");
		System.out.print("Exibindo a matriz transposta: \n\n");
		
		for(int i = 0; i < matriztransposta.length; i++){
			for(int j = 0; j < matriztransposta[i].length; j++){
				System.out.print(matriztransposta[i][j] + "\t|\t");
			}
			System.out.println();
		}
	}
}