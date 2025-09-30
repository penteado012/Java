public class ExercicioTryCath {
    public static void main(String[] args) throws Exception {
            int a = 10;
            int b = 0;

        try {
            int resultado = a / b; // Isso vai gerar uma exceção
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        }finally {
            System.out.println("Bloco finally: sempre será executado.");
        }

        System.out.println("Programa continua executando...");
    }
}
