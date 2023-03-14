package ex3;

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        String nota1 = JOptionPane.showInputDialog("Digite a primeira nota:");
        String nota2 = JOptionPane.showInputDialog("Digite a segunda nota:");
        String nota3 = JOptionPane.showInputDialog("Digite a terceira nota:");

        double n1 = Double.parseDouble(nota1);
        double n2 = Double.parseDouble(nota2);
        double n3 = Double.parseDouble(nota3);

        double media = (n1 + n2 + n3) / 3.0;

        if (media >= 6.0) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        } else if (media >= 4.0) {
            JOptionPane.showMessageDialog(null, "Recuperação");
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}