import java.util.Scanner;

//Matheus Penteado e Kaik Persike
// Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.
public class TP01Ex18 {
	public static void main(String[]args) {

		Scanner scanner = new Scanner(System.in);//Instancia objeto para scanear valores
		
		double[] valores = new double[5];
		int i;
		double somavalores = 0;
		for(i = 0; i < 5; i++) {			
		System.out.println("Digite o valor do produto " + (i + 1) + ":");
		valores[i] = scanner.nextDouble();
		somavalores += valores[i];
		}
		
		double valorpagamento = 0;
		do {			
			System.out.println("Digite valor referente ao pagamento: ");
			valorpagamento = scanner.nextDouble();
			
			if (valorpagamento < somavalores) {
                System.out.println("Valor insuficiente! Digite um valor maior ou igual à soma das compras.");
            }
		} while(valorpagamento < somavalores);
		
		double troco = valorpagamento - somavalores;		
		System.out.println("Soma total dos produtos: R$" + somavalores);
		System.out.println("O troco a ser devolvido e: R$" + troco);		
	}
}