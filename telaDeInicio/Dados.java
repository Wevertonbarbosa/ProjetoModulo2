package telaDeInicio;

import javax.swing.*;
import java.awt.*;

public class Dados extends JFrame {

    JFrame frameDados = new JFrame();

    public JPanel painelDados = new JPanel();

    //Dados Fisica
    public JLabel mostrarNomeFisica = new JLabel("Nome");

    public JTextField txtMostraNomeFisica = new JTextField();

    public JLabel mostrarEmailFisica = new JLabel();

    public JTextField txtMostraEmailFisica = new JTextField();

    public JLabel mostrarCpfFisica = new JLabel("Cpf:");

    public JTextField txtMostrarCpfFisica = new JTextField();

    public JLabel mostrarTelFisica = new JLabel("Telefone:");

    public JTextField txtMostrarTelFisica = new JTextField();

    //Dados Juridico

    public JLabel mostrarFantasia = new JLabel("Nome Fantasia");

    public JTextField txtMotrarFantasia = new JTextField();

    public JLabel mostrarEmailJuridica = new JLabel("Email:");

    public JTextField txtMostrarEmailJuridico = new JTextField();

    public JLabel mostrarCnpj = new JLabel("Cnpj:");

    public JTextField txtMostrarCnpj = new JTextField();

    public JLabel mostrarSocial = new JLabel("Razão Social:");

    public JTextField txtMostrarSocial = new JTextField();

    public JLabel mostrarDeposito = new JLabel("Deposito:");

    public JTextField txtMostratDeposito = new JTextField();


    public JFrame getFrameDados() {

        frameDados.setVisible(false);
        frameDados.setPreferredSize(new Dimension(500,400));
        frameDados.setSize(500,400);
        frameDados.setResizable(false);
        frameDados.setLocationRelativeTo(null);
        frameDados.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        painelDados.setLayout(null);

        mostrarNomeFisica.setBounds(70, 40, 200, 30);
        txtMostraNomeFisica.setBounds(140, 40, 200, 25);
        mostrarFantasia.setBounds(30, 40, 200, 30);
        txtMotrarFantasia.setBounds(140, 40, 200, 25);

        mostrarEmailFisica.setBounds(70, 80, 200, 30);
        txtMostraEmailFisica.setBounds(140, 80, 200, 25);
        mostrarEmailJuridica.setBounds(70, 80, 200, 30);
        txtMostrarEmailJuridico.setBounds(140, 80, 200, 25);

        mostrarCpfFisica.setBounds(70, 120, 200, 30);
        txtMostrarCpfFisica.setBounds(140, 120, 200, 25);
        mostrarCnpj.setBounds(70, 110, 200, 30);
        txtMostrarCnpj.setBounds(140, 110, 200, 25);


        mostrarTelFisica.setBounds(70, 160, 200, 30);
        txtMostrarTelFisica.setBounds(140, 160, 200, 25);
        mostrarSocial.setBounds(30, 150, 200, 30);
        txtMostrarSocial.setBounds(140, 150, 200, 25);

        mostrarDeposito.setBounds(70,200,200,30);
        txtMostratDeposito.setBounds(140,200,200,25);

        painelDados.add(mostrarNomeFisica);
        painelDados.add(txtMostraNomeFisica);
        painelDados.add(mostrarFantasia);
        painelDados.add(txtMotrarFantasia);
        painelDados.add(mostrarEmailFisica);
        painelDados.add(txtMostraEmailFisica);
        painelDados.add(mostrarEmailJuridica);
        painelDados.add(txtMostrarEmailJuridico);
        painelDados.add(mostrarCpfFisica);
        painelDados.add(txtMostrarCpfFisica);
        painelDados.add(mostrarCnpj);
        painelDados.add(txtMostrarCnpj);
        painelDados.add(mostrarTelFisica);
        painelDados.add(txtMostrarTelFisica);
        painelDados.add(mostrarSocial);
        painelDados.add(txtMostrarSocial);

        painelDados.add(mostrarDeposito);
        painelDados.add(txtMostratDeposito);

        frameDados.add(painelDados);

        return frameDados;
    }

    public static void main(String[] args) {
        Dados dados = new Dados();
        dados.getContentPane().add(dados.getFrameDados());
    }

}
