package Atividades.Exercicio_Aula05;
import javax.swing.JOptionPane;

class Exercicio02 {
    public static void main(String[] args) {
        int num = -1;
        int num2;
        do{
            try{
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro Número(0 para sair"));

                if(num == 0)
                {
                    System.exit(0);
                }

                num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Número: "));

                double soma = num + num2;
                double multiplicacao = num * num2;
                int divisao = num / num2;

            JOptionPane.showMessageDialog(null, "Soma: " + soma + "\nMultiplicação: " + multiplicacao + "\nDivisão: " + divisao);

            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Valor Inválido! Digite apenas números!!!", "ERRO", JOptionPane.ERROR_MESSAGE
                );
            } catch(ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Valor Inválido! Não é permitido 0 como segundo número na divisão!!!", "ERRO", JOptionPane.ERROR_MESSAGE
                );
            }        
            
        }while(num != 0 );
    }    
}