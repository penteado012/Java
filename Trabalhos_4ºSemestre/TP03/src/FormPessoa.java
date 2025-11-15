import java.awt.*;
import javax.swing.*;       

public class FormPessoa extends JFrame{
    private Pessoa pessoa;
    private Pessoa umaPessoa;
    public FormPessoa() {
        pessoa = new Pessoa();
        setTitle("Form Pessoa");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Painel vertical para empilhar campos
        JPanel painelCampos = new JPanel();
        painelCampos.setLayout(new BoxLayout(painelCampos, BoxLayout.Y_AXIS));
        painelCampos.setBorder(BorderFactory.createEmptyBorder(0, 1, 0, 0));

        // ========== CAMPO 1 (KP) ==========
        JPanel topo = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));

        JTextField Numero = new JTextField();
        Numero.setEditable(false);
        Numero.setText(String.valueOf("NUMERO DO KP: " + pessoa.getKp()));
        Numero.setPreferredSize(new java.awt.Dimension(200, 40));

        topo.add(Numero);
        painelCampos.add(topo);

        // ========== CAMPO 2 (Nome) ==========
        JPanel topo2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));

        JLabel lblNome = new JLabel("Digite seu nome: ");
        JTextField Nome = new JTextField();
        Nome.setPreferredSize(new java.awt.Dimension(150, 25));

        topo2.add(lblNome);
        topo2.add(Nome);
        painelCampos.add(topo2);

        // ========== CAMPO 3 (Sexo) ==========

        JPanel topo3 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));

        JLabel lblSexo = new JLabel("Selecione seu sexo:");
        
        JRadioButton rtbMasculino = new JRadioButton("Masculino");
        JRadioButton rtbFeminino = new JRadioButton("Feminino");

        ButtonGroup grupoSexo = new ButtonGroup();
        grupoSexo.add(rtbFeminino);
        grupoSexo.add(rtbMasculino);

            rtbMasculino.setPreferredSize(new java.awt.Dimension(150, 25));
            rtbFeminino.setPreferredSize(new java.awt.Dimension(150, 25));

        topo3.add(lblSexo);
        topo3.add(rtbMasculino);
        topo3.add(rtbFeminino);
        painelCampos.add(topo3);

        add(painelCampos, BorderLayout.NORTH);

        // ========== CAMPO 4 (Idade) ==========

        JPanel topo4 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));

        JLabel lblIdade = new JLabel("Digite sua Idade:  ");
        JTextField Idade = new JTextField();
        Idade.setPreferredSize(new java.awt.Dimension(150, 25));

        topo4.add(lblIdade);
        topo4.add(Idade);
        painelCampos.add(topo4);

        add(painelCampos, BorderLayout.NORTH);

        // ========== CAMPO 5 (Botao OK) ==========

        JPanel topo5 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));

        JButton jbtOk = new JButton("OK");
        jbtOk.setPreferredSize(new java.awt.Dimension(150, 25));

        topo5.add(jbtOk);
        painelCampos.add(topo5);

        add(painelCampos, BorderLayout.NORTH);

        // ========== Eventos de Botoes ==========
        jbtOk.addActionListener(e -> {
            if(Nome.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha o campo Nome obrigatório!");
                return;
            }

            String s;
            if(rtbMasculino.isSelected()){
                s = "M";
            } else {
                s = "F";
            }
            if(!s.equals("M") && !s.equals("F")){
                JOptionPane.showMessageDialog(null, "Digite M ou F! No Campo Sexo");
                return;
            }

            if(Idade.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha o campo Idade obrigatório!");
                return;
            }

            String nomePessoa = Nome.getText().trim();
            char se = s.charAt(0);
            int idadePessoa = Integer.parseInt(Idade.getText().trim());

            umaPessoa = new Pessoa(nomePessoa, se, idadePessoa);

            Numero.setText(String.valueOf("NUMERO DO KP: " + pessoa.getKp()));

            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
        });

        Idade.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent e) {
        char c = e.getKeyChar();
        if (!Character.isDigit(c)) {
            e.consume(); // impede digitar
        }

        // Impede digitar mais de 2 dígitos
        if (Idade.getText().length() >= 2) {
            e.consume();
        }
    }
    });
    // ========== CAMPO 6 (Botao Mostrar) ==========

        JPanel topo6 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));

        JButton jbtMostrar = new JButton("Mostrar");
        jbtMostrar.setPreferredSize(new java.awt.Dimension(150, 25));

        topo6.add(jbtMostrar);
        painelCampos.add(topo6);

        add(painelCampos, BorderLayout.CENTER);

    // ========== CAMPO 6 (Botao Mostrar) ===========
        jbtMostrar.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Numero do Kp: " + umaPessoa.kp + "\n" +
            "Nome: " + umaPessoa.nome + "\n" +
            "Sexo: " + umaPessoa.sexo + "\n" + 
            "Idade: " + umaPessoa.idade + "\n");
        });

        setVisible(true);
    }

    
}
