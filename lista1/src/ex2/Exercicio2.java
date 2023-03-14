package ex2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		ArrayList<String> elementos = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			String qnt = JOptionPane.showInputDialog("escreva o elemento:");

			elementos.add(qnt);
		}
		JOptionPane.showMessageDialog(null, elementos);
	}

}
