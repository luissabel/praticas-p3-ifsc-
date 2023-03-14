package ex4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercicio4 extends JFrame implements ActionListener {
    private JTextField campo1, campo2;
    private JButton soma, subtracao, divisao, multiplicacao;

    public Exercicio4() {
        campo2 = new JTextField(10);
        campo2.setBounds(321, 6, 86, 20);

        divisao = new JButton("dividir");
        divisao.setBounds(309, 34, 61, 23);
        divisao.addActionListener(this);

        JPanel painel = new JPanel();
        painel.setLayout(null);
        JLabel label = new JLabel("Valor 1:");
        label.setBounds(22, 9, 37, 14);
        painel.add(label);
        
                campo1 = new JTextField(10);
                campo1.setBounds(69, 6, 86, 20);
                painel.add(campo1);
        JLabel label_1 = new JLabel("Valor 2:");
        label_1.setBounds(274, 9, 37, 14);
        painel.add(label_1);
        painel.add(campo2);
        painel.add(divisao);
        getContentPane().add(painel);
        
                subtracao = new JButton("subtrair");
                subtracao.setBounds(65, 34, 69, 23);
                subtracao.addActionListener(this);
                painel.add(subtracao);
                
                        soma = new JButton("somar");
                        soma.setBounds(149, 34, 61, 23);
                        soma.addActionListener(this);
                        painel.add(soma);
                        
                                multiplicacao = new JButton("multiplicar");
                                multiplicacao.setBounds(220, 34, 79, 23);
                                multiplicacao.addActionListener(this);
                                painel.add(multiplicacao);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double valor1 = Double.parseDouble(campo1.getText());
        double valor2 = Double.parseDouble(campo2.getText());
        double resultado = 0;
        if (e.getSource() == soma) {
            resultado = valor1 + valor2;
        } else if (e.getSource() == subtracao) {
            resultado = valor1 - valor2;
        } else if (e.getSource() == divisao) {
            resultado = valor1 / valor2;
        } else if (e.getSource() == multiplicacao) {
            resultado = valor1 * valor2;
        }

        JOptionPane.showMessageDialog(this, "Resultado: " + resultado);
    }

    public static void main(String[] args) {
        new Exercicio4();
    }
}
