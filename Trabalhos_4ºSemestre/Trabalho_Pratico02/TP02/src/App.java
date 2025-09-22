import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class App extends JFrame implements ActionListener {   

    JButton btnOk = new JButton("OK");
    JButton btnLimpar = new JButton("Limpar");
    JButton btnMostrar = new JButton("Mostrar");
    JButton btnSair = new JButton("Sair");

    private JTextField txtNome = new JTextField(10);
    private JTextField txtIdade = new JTextField(10);
    private JTextField txtEndereco = new JTextField(10);

    private List<Aluno> alunos = new ArrayList<>();

    public App() {    

    JPanel painelSuperior = new JPanel(new GridLayout(3, 2, 10, 10));

    painelSuperior.add(new Label("Nome: "));
    painelSuperior.add(txtNome);

    painelSuperior.add(new Label("Idade: "));
    painelSuperior.add(txtIdade);

    painelSuperior.add(new Label("Endereço: "));
    painelSuperior.add(txtEndereco);

    btnOk.addActionListener(this);
    btnLimpar.addActionListener(this);
    btnMostrar.addActionListener(this);
    btnSair.addActionListener(this);

    JPanel painelInferior = new JPanel();
    painelInferior.add(btnOk);
    painelInferior.add(btnLimpar);
    painelInferior.add(btnMostrar);
    painelInferior.add(btnSair);

    add(painelSuperior, BorderLayout.NORTH);
    add(painelInferior, BorderLayout.SOUTH);   

    setTitle("TP02 - LP2I4");
    setSize(400, 180);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnOk){
            String nome = txtNome.getText();
            int idade = Integer.parseInt(txtIdade.getText());
            String endereco = txtEndereco.getText();

            alunos.add(new Aluno(endereco, idade, nome));
            JOptionPane.showMessageDialog(this, "Aluno Cadatrado!");
        } else if (e.getSource() == btnLimpar) {
            txtEndereco.setText("");
            txtIdade.setText("");
            txtNome.setText("");
        } else if (e.getSource() == btnMostrar) {
            StringBuilder mensagem = new StringBuilder();
            for (Aluno aluno : alunos) {                
                if(aluno != null){
                    mensagem.append("Id: ").append(aluno.getUuid())
                    .append(" Nome: ").append(aluno.getNome())
                    .append("\n");              
                }                
            }
            JOptionPane.showMessageDialog(this, mensagem.toString());
        } else if(e.getSource() == btnSair){
            System.exit(0);
        }
    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}
