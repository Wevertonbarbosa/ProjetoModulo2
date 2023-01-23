package telaDeInicio;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.ParseException;

public class FormFisica extends JFrame {

    JFrame frameFisica = new JFrame("Formulário Pessoa Física");
    JPanel pnlFormFisica = new JPanel();
    JTextField txtNome, txtEmail;
    JLabel lblNome, lblEmail;
    JFormattedTextField txtCpf, txtTelefone;
    JLabel lblCpf, lblTelefone;
    JButton btnCorrente, btnPoupanca;
    JLabel lblDeposito;
    JFormattedTextField txtDeposito;

    JTextField txt = new JTextField();

    public FormFisica() throws ParseException {
        getFrameFisica();
    }

    public JFrame getFrameFisica() throws ParseException {
        frameFisica.setVisible(true);
        frameFisica.setPreferredSize(new Dimension(500, 400));
        frameFisica.setSize(500, 400);
        frameFisica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameFisica.setLocationRelativeTo(null);
        frameFisica.setResizable(false);

        pnlFormFisica.setLayout(null);
        pnlFormFisica.setPreferredSize(new Dimension(500,400));
        pnlFormFisica.setSize(500,400);
        pnlFormFisica.setBackground(new Color(0x767E8896, true));



        lblNome = new JLabel("Nome:", JLabel.CENTER);
        lblNome.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblNome.setBounds(60, 60, 100, 20);
        txtNome = new JTextField(20);
        txtNome.setBounds(150, 60, 250, 25);

        lblCpf = new JLabel("CPF:", JLabel.CENTER);
        lblCpf.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblCpf.setBounds(60, 100, 100, 20);
        txtCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        txtCpf.setBounds(150, 100, 250, 25);

        lblEmail = new JLabel("Email:", JLabel.CENTER);
        lblEmail.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblEmail.setBounds(60, 140, 100, 20);
        txtEmail = new JTextField();
        txtEmail.setBounds(150, 140, 250, 25);

        lblTelefone = new JLabel("Telefone:", JLabel.CENTER);
        lblTelefone.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblTelefone.setBounds(60, 180, 100, 20);
        txtTelefone = new JFormattedTextField(new MaskFormatter("## (##) #####-####"));
        txtTelefone.setBounds(150, 180, 250, 25);

        lblDeposito = new JLabel("Deposito:");
        lblDeposito.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblDeposito.setBounds(78, 220, 200, 20);
        txtDeposito = new JFormattedTextField();
        txtDeposito.setBounds(150, 220, 250, 25);


        btnCorrente = new JButton("Conta Corrente");
        btnPoupanca = new JButton("Conta Poupança");

        btnCorrente.setBackground(new Color(0x1010A2));
        btnPoupanca.setBackground(new Color(0x1010A2));

        btnCorrente.setForeground(new Color(0xFFFFFF));
        btnPoupanca.setForeground(new Color(0xFFFFFF));

        btnCorrente.setFont(new Font("Arial Black", Font.TYPE1_FONT, 15));
        btnPoupanca.setFont(new Font("Arial Black", Font.TYPE1_FONT, 15));

        btnCorrente.setBounds(30, 290, 200, 45);
        btnPoupanca.setBounds(270, 290, 200, 45);

        btnCorrente.addActionListener(this::importeDadosCorrente);
        btnPoupanca.addActionListener(this::importeDadosPoupanca);



        pnlFormFisica.add(lblNome);
        pnlFormFisica.add(txtNome);

        pnlFormFisica.add(lblCpf);
        pnlFormFisica.add(txtCpf);

        pnlFormFisica.add(lblTelefone);
        pnlFormFisica.add(txtTelefone);

        pnlFormFisica.add(lblEmail);
        pnlFormFisica.add(txtEmail);

        pnlFormFisica.add(lblDeposito);
        pnlFormFisica.add(txtDeposito);

        pnlFormFisica.add(btnCorrente);
        pnlFormFisica.add(btnPoupanca);

        frameFisica.add(pnlFormFisica);

        return frameFisica;
    }

    private void importeDadosCorrente(ActionEvent actionEvent) {
    }

    private void importeDadosPoupanca(ActionEvent actionEvent) {
    }


    public static void main(String[] args) throws ParseException {
        FormFisica fisica = new FormFisica();
        fisica.getContentPane().add(fisica);
    }


}
