import java.awt.*;
import java.awt.event.*;

public class Form6 extends Frame implements ActionListener{

    private int k1 = 0;
    private int k2 = 0;
    private int k3 = 0;

    Button b1 = new Button("Botão 1: ");
    Button b2 = new Button("Botão 2: ");
    Button b3 = new Button("Botão 3: ");

    Label l1 = new Label("Botão 1 ainda nao foi clicado");
    Label l2 = new Label("Botão 2 ainda nao foi clicado");
    Label l3 = new Label("Botão 3 ainda nao foi clicado");

    Form6(String titulo, int largura, int altura, int colinic, int lilinic){
        super(titulo);
        setSize(largura, altura);
        setLocation(colinic, lilinic);
        setLayout(new FlowLayout());
        

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        add(b1);
        add(b2);
        add(b3);

        add(l1);
        add(l2);
        add(l3);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            ++k1;
            l1.setText("O botão 1 foi clicado: " + k1 + " vezes");
        } else if (e.getSource() == b2) {
            ++k2;
            l2.setText("O botão 2 foi clicado: " + k2 + " vezes");
        } else if (e.getSource() == b3) {
            ++k3;
            l3.setText("O botão 3 foi clicado: " + k3 + " vezes");
        }
    }   

    public static void main(String[] args) throws Exception {
        Form6 f = new Form6("Processador de evento", 300, 200, 50, 50);
        f.addWindowListener(new fechaJanela());
        f.setVisible(true);
    } 
}

    class fechaJanela extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }
    

    

