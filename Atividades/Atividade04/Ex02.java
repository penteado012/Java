import java.util.Scanner;

// Matheus Penteado e Kaik Persike
//2. Crie um programa que permite executar uma expressão matemática simples, semelhante a 17 + 3 e 3.14159 * 4.7. A expressão deve ser digitada pelo usuário. A entrada sempre consistirá em um número, seguido de um operador e depois outro número. Os operadores permitidos são: +, -, *, and /. O programa deve ler a expressão e trazer seu resultado. O programa deve permitir saída quando o 0 for o primeiro número. Utilizar comando switch.

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] partes;
        char operador;

        while (true) { 
            System.out.println("Digite sua expressão: [ex: 11 + 11], para sair digite 0[zero]");
            String entrada = scanner.nextLine().trim();
			
			if(entrada.equals("0")) {
				System.out.println("Programa Finalizado!");
				break;
			}
			
			partes = entrada.split("\\s+");   
			
            if (partes.length != 3) {
                System.out.println("Erro no formato da expressão! Tente novamente.");
                continue;
            }   
			
            if (!partes[0].matches("-?\\d+(\\.\\d+)?") || !partes[2].matches("-?\\d+(\\.\\d+)?")) {
                System.out.println("Erro: Entrada inválida. Certifique-se de digitar números corretamente.");
                continue;
            }
			
            double num1 = Double.parseDouble(partes[0]);
            double num2 = Double.parseDouble(partes[2]);
			
            operador = partes[1].charAt(0);
            if (operador != '+' && operador != '-' && operador != '*' && operador != '/') {
                System.out.println("Erro: Operador inválido. Use +, -, * ou /.");
                continue;
            }
			
            if (operador == '/' && num2 == 0) {
                System.out.println("Erro: Divisão por zero não é permitida!");
                continue;
            }
			
            double resultado = 0;
            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    resultado = num1 / num2;
                    break;
            }
			
            System.out.println("Resultado: " + num1 + " " + operador + " " + num2 + " = " + resultado);
        }
		
        scanner.close();
    }
}
