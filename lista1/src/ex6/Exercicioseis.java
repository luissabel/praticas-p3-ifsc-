package ex6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicioseis extends JFrame {

	private JPanel contentPane;
	private JTextField txtnome;
	private JTextField txtn1;
	private JTextField txtn2;
	private JTextField txtn3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicioseis frame = new Exercicioseis();
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
	public Exercicioseis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtnome = new JTextField();
		txtnome.setBounds(98, 11, 86, 20);
		contentPane.add(txtnome);
		txtnome.setColumns(10);

		txtn1 = new JTextField();
		txtn1.setBounds(98, 42, 86, 20);
		contentPane.add(txtn1);
		txtn1.setColumns(10);

		txtn2 = new JTextField();
		txtn2.setBounds(98, 72, 86, 20);
		contentPane.add(txtn2);
		txtn2.setColumns(10);

		txtn3 = new JTextField();
		txtn3.setBounds(98, 103, 86, 20);
		contentPane.add(txtn3);
		txtn3.setColumns(10);

		JLabel lblNewLabel = new JLabel(" nome do aluno:");
		lblNewLabel.setBounds(20, 14, 77, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("nota 1:");
		lblNewLabel_1.setBounds(51, 42, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("nota 2:");
		lblNewLabel_2.setBounds(51, 73, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("nota 3:");
		lblNewLabel_3.setBounds(51, 103, 46, 14);
		contentPane.add(lblNewLabel_3);

		JButton btnNewButton = new JButton("calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String n1 = txtn1.getText();
				String n2 = txtn2.getText();
				String n3 = txtn3.getText();
				
				Double n1D = Double.valueOf(n1);
				Double n2D = Double.valueOf(n2);
				Double n3D = Double.valueOf(n3);
				
				double media = (n1D + n2D + n3D) / 3.0;
				JOptionPane.showMessageDialog(null, media);
				
						
						
						

			}
		});
		btnNewButton.setBounds(95, 152, 89, 23);
		contentPane.add(btnNewButton);
	}
}
