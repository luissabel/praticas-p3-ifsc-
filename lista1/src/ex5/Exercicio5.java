package ex5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio5 extends JFrame {

	private JPanel contentPane;
	private JTextField lado1;
	private JTextField lado2;
	private JTextField lado3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 frame = new Exercicio5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lado1 = new JTextField();
		lado1.setBounds(10, 11, 86, 20);
		contentPane.add(lado1);
		lado1.setColumns(10);
		
		lado2 = new JTextField();
		lado2.setBounds(106, 11, 86, 20);
		contentPane.add(lado2);
		lado2.setColumns(10);
		
		lado3 = new JTextField();
		lado3.setBounds(202, 11, 86, 20);
		contentPane.add(lado3);
		lado3.setColumns(10);
		
		JButton verificador = new JButton("verificar");
		verificador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double l1=Double.valueOf(lado1.getText());
				double l2=Double.valueOf(lado1.getText());
				double l3=Double.valueOf(lado1.getText());
		
				if ((l1==l2)&&(l2==l3)) {
						JOptionPane.showMessageDialog(verificador, "triângulo equilátero");
				}
				if (((l1==l2)&&(l2!=l3))||((l2!=l1)&& (l2 == l3))|| ((l1==l3))&& (l1!=l2)){
					JOptionPane.showMessageDialog(verificador, "triângulo isóceles");
				}
				if  ((l1!=l2)&&(l1!=l3)&&(l2!=l3)) {	
				JOptionPane.showMessageDialog(verificador, "triângulo escaleno");
				}	
			}
		});
		verificador.setBounds(298, 10, 89, 23);
		contentPane.add(verificador);
	}
}
