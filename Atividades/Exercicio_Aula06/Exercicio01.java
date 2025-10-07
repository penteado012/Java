import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Exercicio01 {

    

    public static void main(String[] args){
            new Compo01("Text senha: ", 250, 250, 50, 50);
    }     
}

class Compo01 extends JFrame implements ActionListener{
    private JLabel l1 = new JLabel("Digite seu nome: ");
    private JTextField campo1 = new JTextField("nome", 20);
    private JLabel l2 = new JLabel("Digite sua senha: ");
    private JPasswordField campo2 = new JPasswordField(5);
    private JPanel p1 = new JPanel(new GridLayout(4, 1));
    
    Compo01(String tit, int larg, int alt, int col, int lin){
        super(tit);
        setSize(larg, alt);
        setLocation(col, lin);
        campo1.addActionListener(this);
        campo2.addActionListener(this);
        p1.add(l1);
        p1.add(campo1);
        p1.add(l2);
        p1.add(campo2);
        add(p1);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == campo1)
            campo2.requestFocus();
        if (e.getSource() == campo2)
        System.exit(0);
    }    


}

    class Compo02 extends Frame {

    private Label l1 = new Label("Digite o texto");
    private TextArea caixa1 = new TextArea(5,20);

    Compo02(String titulo, int largura, int altura, int colinic, int lininic)
    {
        super(titulo);
        setSize(largura,altura);
        setLocation(colinic,lininic);
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(l1);
        add(caixa1);
    }
}

class Compo02a extends Frame
{
    private JLabel l1 = new JLabel("Digite o texto:");
    private JTextArea caixa1 = new JTextArea(5, 20);
    private JScrollPane j = new JScrollPane(caixa1);

    Compo02a(String titulo, int largura, int altura, int colinic, int lilinic){
        super(titulo);
        setSize(largura, altura);
        setLocation(colinic, lilinic);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(l1);
        add(j);
    }
}
