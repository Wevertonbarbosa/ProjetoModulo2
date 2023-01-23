package telaDeInicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FormFisica extends JFrame {

    JFrame frameFisica = new JFrame("Formulário");

    public boolean escolheuPoupanca = false;

    public boolean escolheuCorrete = false;

    public JPanel painelFisica = new JPanel();

    public JLabel lblNomeFisica = new JLabel("Nome:");
    public JTextField txtNomeFisica = new JTextField();
    public JLabel lblEmailFisica = new JLabel("Email:");
    public JTextField txtEmailFisica = new JTextField();
    public JLabel lblCpfFisica = new JLabel("Cpf:");
    public JTextField txtCpfFisica = new JTextField();

    public JLabel lblTelFisica = new JLabel("Telefone: ");
    public JTextField txtTelefoneFisica = new JTextField();

    //Juridico
    public JLabel lblNomeFantasiaJuridico = new JLabel("Nome Fantasia:");
    public JTextField txtNomeFanatasiaJuridico = new JTextField();
    public JLabel lblEmailJuridico = new JLabel("Email:");
    public JTextField txtEmailJuridico = new JTextField();
    public JLabel lblCnpjJuridico = new JLabel("CNPJ:");
    public JTextField txtCnpjJuridico = new JTextField();

    public JLabel lblSociaJuridico = new JLabel("Razão Social: ");

    public JTextField txtSocialJuridico = new JTextField();

    public JLabel lblDeposito = new JLabel("Deposito");

    public JTextField txtDeposito = new JTextField();

    public JButton btnCorrente = new JButton("Conta Corrente");

    public JButton btnPoupanca = new JButton("Conta Poupança");

    //Fisica
    public String dadosNomeFisica, dadosEmailFisica;

    public String dadosTel, dadosCpf;


    //Juridica

    public String dadosFantasia, dadosEmailJuridico;

    public String dadosCnpj, dadosSocial;

    public FormFisica() {
        getFrameFisica();
    }

    public JFrame getFrameFisica() {
        frameFisica.setVisible(false);
        frameFisica.setPreferredSize(new Dimension(500, 400));
        frameFisica.setSize(500, 400);
        frameFisica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameFisica.setLocationRelativeTo(null);
        frameFisica.setResizable(false);

        painelFisica.setLayout(null);

        lblNomeFisica.setBounds(70, 40, 200, 30);
        txtNomeFisica.setBounds(140, 40, 200, 25);
        lblNomeFantasiaJuridico.setBounds(30, 40, 200, 30);
        txtNomeFanatasiaJuridico.setBounds(140, 40, 200, 25);

        lblEmailFisica.setBounds(70, 80, 200, 30);
        txtEmailFisica.setBounds(140, 80, 200, 25);
        lblEmailJuridico.setBounds(70, 80, 200, 30);
        txtEmailJuridico.setBounds(140, 80, 200, 25);

        lblCpfFisica.setBounds(70, 120, 200, 30);
        txtCpfFisica.setBounds(140, 120, 200, 25);
        lblCnpjJuridico.setBounds(70, 110, 200, 30);
        txtCnpjJuridico.setBounds(140, 110, 200, 25);


        lblTelFisica.setBounds(70, 160, 200, 30);
        txtTelefoneFisica.setBounds(140, 160, 200, 25);
        lblSociaJuridico.setBounds(30, 150, 200, 30);
        txtSocialJuridico.setBounds(140, 150, 200, 25);

        lblDeposito.setBounds(70,200,200,30);
        txtDeposito.setBounds(140,200,200,25);

        btnCorrente.setBounds(100, 260, 150, 30);
        btnPoupanca.setBounds(250, 260, 150, 30);

        btnCorrente.addActionListener(this::importeDadosCorrente);
        btnPoupanca.addActionListener(this::importeDadosPoupanca);

        painelFisica.add(lblNomeFisica);
        painelFisica.add(txtNomeFisica);

        painelFisica.add(lblEmailFisica);
        painelFisica.add(txtEmailFisica);

        painelFisica.add(lblCpfFisica);
        painelFisica.add(txtCpfFisica);

        painelFisica.add(lblTelFisica);
        painelFisica.add(txtTelefoneFisica);

        painelFisica.add(btnCorrente);
        painelFisica.add(btnPoupanca);

        //Juridco
        painelFisica.add(lblNomeFantasiaJuridico);
        painelFisica.add(txtNomeFanatasiaJuridico);

        painelFisica.add(lblEmailJuridico);
        painelFisica.add(txtEmailJuridico);

        painelFisica.add(lblCnpjJuridico);
        painelFisica.add(txtCnpjJuridico);

        painelFisica.add(lblSociaJuridico);
        painelFisica.add(txtSocialJuridico);

        painelFisica.add(lblDeposito);
        painelFisica.add(txtDeposito);

        frameFisica.add(painelFisica);

        return frameFisica;
    }


    private void importeDadosCorrente(ActionEvent actionEvent) {
        Dados dados = new Dados();
        TelaInicial tela = new TelaInicial();
        dados.getFrameDados().setVisible(true);
        frameFisica.dispose();

        //Pega Valor
        dadosNomeFisica = txtNomeFisica.getText();
        dadosEmailFisica = txtEmailFisica.getText();
        dadosTel = txtTelefoneFisica.getText();
        dadosCpf = txtCpfFisica.getText();


        //Setar o Valor
        if (tela.escolheuFisico){
            dados.txtMostraNomeFisica.setText(dadosNomeFisica);
            dados.txtMostraEmailFisica.setText(dadosEmailFisica);
            dados.txtMostrarTelFisica.setText(dadosTel);
            dados.txtMostrarCpfFisica.setText(dadosCpf);
            //Desligo os campos e label Juridico
            dados.mostrarFantasia.setVisible(false);
            dados.txtMotrarFantasia.setVisible(false);
            JOptionPane.showMessageDialog(null, dadosNomeFisica);
        }
    }

    private void importeDadosPoupanca(ActionEvent actionEvent) {
        dadosFantasia = txtNomeFanatasiaJuridico.getText();
        dadosEmailFisica = txtEmailJuridico.getText();
        dadosCnpj = txtCnpjJuridico.getText();
        dadosSocial = txtSocialJuridico.getText();
    }


    public static void main(String[] args) {
        FormFisica fisica = new FormFisica();
        fisica.getContentPane().add(fisica);
    }


}
