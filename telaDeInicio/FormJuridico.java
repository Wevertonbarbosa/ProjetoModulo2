package telaDeInicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.ParseException;

public class FormJuridico extends JFrame {


    TelaInicial tela = new TelaInicial();

    JFrame frameJuridica = new JFrame("Formulário Pessoa Física");

    public JPanel painelJuridico = new JPanel();

    public JLabel lblNomeFantasiaJuridico = new JLabel("Nome Fantasia:");
    public JTextField txtNomeFanatasiaJuridico = new JTextField();
    public JLabel lblEmailJuridico = new JLabel("Email:");
    public JTextField txtEmailJuridico = new JTextField();
    public JLabel lblCnpjJuridico = new JLabel("CNPJ:");
    public  JTextField txtCnpjJuridico = new JTextField();

    public JLabel lblSociaJuridico= new JLabel("Razão Social: ");

    public JTextField txtSocialJuidico = new JTextField();

    public JButton btnCorrente = new JButton("Conta Corrente");

    public JButton btnPoupanca = new JButton("Conta Poupança");

    public FormJuridico()  {

    }


    public JFrame getFrameJuridica() {
        frameJuridica.setVisible(true);
        frameJuridica.setPreferredSize(new Dimension(500, 400));
        frameJuridica.setSize(500, 400);
        frameJuridica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameJuridica.setLocationRelativeTo(null);
        frameJuridica.setResizable(false);

        painelJuridico.setLayout(null);

        lblNomeFantasiaJuridico.setBounds(70,40,200,30);
        txtNomeFanatasiaJuridico.setBounds(140,40,200,25);

        lblEmailJuridico.setBounds(70,80,200,30);
        txtEmailJuridico.setBounds(140,80, 200, 25);

        lblNomeFantasiaJuridico.setBounds(30,120,200,30);
        txtNomeFanatasiaJuridico.setBounds(140,120,200,25);

        lblCnpjJuridico.setBounds(70,160,200,30);
        txtCnpjJuridico.setBounds(140,160,200,25);

        lblSociaJuridico.setBounds(30,200,200,30);
        txtSocialJuidico.setBounds(140,200,200,25);

        btnCorrente.setBounds(100,230,150,30);
        btnPoupanca.setBounds(250,230,150,30);

        btnCorrente.addActionListener(this::importeDadosCorrenteJuridico);
        btnPoupanca.addActionListener(this::importeDadosPoupancaJuridico);

        painelJuridico.add(lblNomeFantasiaJuridico);
        painelJuridico.add(txtNomeFanatasiaJuridico);

        painelJuridico.add(lblEmailJuridico);
        painelJuridico.add(txtEmailJuridico);

        painelJuridico.add(lblNomeFantasiaJuridico);
        painelJuridico.add(txtNomeFanatasiaJuridico);

        painelJuridico.add(lblCnpjJuridico);
        painelJuridico.add(txtCnpjJuridico);

        painelJuridico.add(lblSociaJuridico);
        painelJuridico.add(txtSocialJuidico);

        painelJuridico.add(btnCorrente);
        painelJuridico.add(btnPoupanca);

        frameJuridica.add(painelJuridico);

        return frameJuridica;
    }



    private void importeDadosCorrenteJuridico(ActionEvent actionEvent) {
        if (tela.escolheuFisico){

        }
    }

    private void importeDadosPoupancaJuridico(ActionEvent actionEvent) {
    }

    public static void main(String[] args)  {
    FormJuridico juridico = new FormJuridico();
    juridico.getContentPane().add(juridico.getFrameJuridica());

    }

}
