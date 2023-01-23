package telaDeInicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.ParseException;

public class TelaInicial extends JFrame{
    JFrame frame = new JFrame();
    FormFisica fisica = new FormFisica();

//    FormJuridico juridico = new FormJuridico();

    public JPanel painelMain = new JPanel();

    public JButton btnFisica = new JButton("Pessoa Fisica");

    public JButton btnJuridico = new JButton("Pessoa Jurídica");

    public boolean escolheuFisico = false;
    public boolean escolheuJuridico = false;

    public TelaInicial()  {
    }

    public JFrame getFrame() {
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(500,400));
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        painelMain.setLayout(null);
        painelMain.setBackground(new Color(0x767E8896, true));

        btnFisica.setBounds(70,120,140,38);
        btnJuridico.setBounds(250,120,140,38);

        btnFisica.setBackground(new Color(0x1010A2));
        btnJuridico.setBackground(new Color(0x1010A2));

        btnFisica.setForeground(new Color(0xFFFFFF));
        btnJuridico.setForeground(new Color(0xFFFFFF));

        btnFisica.addActionListener(this::acessoFisico);
        btnJuridico.addActionListener(this::acessoJuridico);

        painelMain.add(btnFisica);
        painelMain.add(btnJuridico);
        frame.add(painelMain);

        return frame;
    }
    private void acessoFisico(ActionEvent actionEvent) {
        escolheuFisico = true;
        fisica.getFrameFisica().setVisible(true);

        fisica.lblNomeFantasiaJuridico.setVisible(false);
        fisica.txtNomeFanatasiaJuridico.setVisible(false);

        fisica.lblEmailJuridico.setVisible(false);
        fisica.txtEmailJuridico.setVisible(false);

        fisica.lblCnpjJuridico.setVisible(false);
        fisica.txtCnpjJuridico.setVisible(false);

        fisica.lblSociaJuridico.setVisible(false);
        fisica.txtSocialJuridico.setVisible(false);

        frame.dispose();

    }
    private void acessoJuridico(ActionEvent actionEvent) {
        escolheuJuridico = true;
        fisica.getFrameFisica();

        fisica.lblNomeFisica.setVisible(false);
        fisica.txtNomeFisica.setVisible(false);

        fisica.lblEmailJuridico.setVisible(false);
        fisica.txtEmailJuridico.setVisible(false);

        fisica.lblCpfFisica.setVisible(false);
        fisica.txtCpfFisica.setVisible(false);

        fisica.lblTelFisica.setVisible(false);
        fisica.txtTelefoneFisica.setVisible(false);

        frame.dispose();
    }

    public static void main(String[] args) {
        TelaInicial tela = new TelaInicial();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.getContentPane().add(tela.getFrame());
    }

}
