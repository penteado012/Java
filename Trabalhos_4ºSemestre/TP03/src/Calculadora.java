import javax.swing.JButton;
import javax.swing.JFrame;//para criar janela
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.*;

public class Calculadora extends JFrame{
    private JTextField display;
    private double valor1 = 0;
    private String operador = "";
    private boolean novaOperacao = true;
    public Calculadora(){
        setTitle("Calculadora");
        setSize(250, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        display = new JTextField("0");
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(5, 4));
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton bDiv = new JButton("/");

        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton bMult = new JButton("*");

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton bMenos = new JButton("-");

        JButton b0 = new JButton("0");
        JButton bPonto = new JButton(".");
        JButton bC = new JButton("C");
        JButton bIgual = new JButton("=");
        JButton bMais = new JButton("+");

        painel.add(b7);
        painel.add(b8);
        painel.add(b9);
        painel.add(bDiv);

        painel.add(b4);
        painel.add(b5);
        painel.add(b6);
        painel.add(bMult);

        painel.add(b1);
        painel.add(b2);
        painel.add(b3);
        painel.add(bMenos);

        painel.add(b0);
        painel.add(bPonto);        
        painel.add(bIgual);
        painel.add(bMais);
        painel.add(bC);

        add(painel, BorderLayout.CENTER);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);
        setVisible(true);
    }

    private void clicarBotao(String texto){
        switch (texto) {
            case "C":
                display.setText("0");
                valor1 = 0;
                operador = "";
                novaOperacao = true;                
                break;

            case "+":
            case "-":
            case "*":
            case "/":
            valor1 = Double.parseDouble(display.getText());
            operador = texto;
            novaOperacao = true;
            break;

            case "=":
                calcular();
                operador = "";
                break;

            default:
                if(novaOperacao){
                    valor1 = 0;
                    operador = "";
                }
            break;
        }
    }
}
