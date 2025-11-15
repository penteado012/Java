import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {
    private JTextField display;
    private double valor1 = 0;
    private double valor2 = 0;
    private String operador = "";
    private boolean novaOperacao = true;

    public Calculadora() {
        setTitle("Calculadora");
        setSize(250, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        display = new JTextField("0");
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);
        
        JPanel painel = new JPanel(new GridLayout(5, 4));

        // Botões
        JButton[] botoes = {
            new JButton("7"), new JButton("8"), new JButton("9"), new JButton("/"),
            new JButton("4"), new JButton("5"), new JButton("6"), new JButton("*"),
            new JButton("1"), new JButton("2"), new JButton("3"), new JButton("-"),
            new JButton("0"), new JButton("."), new JButton("="), new JButton("+"),
            new JButton("C")
        };

        for (JButton b : botoes) {
            painel.add(b);
            b.addActionListener(e -> clicarBotao(b.getText()));
        }

        add(painel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void clicarBotao(String texto) {
    switch (texto) {
        case "C":
            display.setText("0");
            valor1 = 0;
            valor2 = 0;
            operador = "";
            novaOperacao = true;
            break;

        case "+":
        case "-":
        case "*":
        case "/":
            valor1 = Double.parseDouble(display.getText());
            operador = texto;
            display.setText(display.getText() + " " + operador + " ");
            novaOperacao = false;
            break;

        case "=":
            try {
                if (operador.isEmpty()) return; // se não tiver operador, não faz nada

                String textoDisplay = display.getText();

                // Escapa o operador para o split funcionar corretamente
                String operadorRegex = "\\Q" + operador + "\\E";
                String[] partes = textoDisplay.split("\\s*" + operadorRegex + "\\s*");

                if (partes.length == 2) {
                    valor1 = Double.parseDouble(partes[0]);
                    valor2 = Double.parseDouble(partes[1]);

                    double resultado = calcular(valor1, valor2, operador);
                    display.setText(String.valueOf(resultado));

                    valor1 = resultado;
                    operador = "";
                    novaOperacao = true;
                }
            } catch (Exception e) {
                display.setText("Erro");
            }
            break;

        case ".":
            String textoAtual = display.getText();

            if (novaOperacao) {
                display.setText("0.");
                novaOperacao = false;
                break;
            }

            String numeroAtual;
            if (operador.isEmpty()) {
                numeroAtual = textoAtual;
            } else {
                int posOp = textoAtual.lastIndexOf(operador);
                numeroAtual = textoAtual.substring(posOp + 1).trim();
            }

            if (!numeroAtual.contains(".")) {
                display.setText(display.getText() + ".");
            }
            break;

        default:
            if (novaOperacao || display.getText().equals("0")) {
                display.setText(texto);
                novaOperacao = false;
            } else {
                display.setText(display.getText() + texto);
            }
            break;
    }
}


    private double calcular(double v1, double v2, String op) {
        switch (op) {
            case "+": return v1 + v2;
            case "-": return v1 - v2;
            case "*": return v1 * v2;
            case "/": return (v2 != 0) ? v1 / v2 : Double.NaN;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
