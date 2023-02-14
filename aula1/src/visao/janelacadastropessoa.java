package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.Funcionariodao;
import modelo.Funcionario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Color;

public class janelacadastropessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelacadastropessoa frame = new janelacadastropessoa();
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
	public janelacadastropessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 316);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("nome");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 95, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
			if (nome.isEmpty()) {
				JOptionPane.showMessageDialog(null, "você não inseriu sua senha");
			}
			
			Funcionario func = new Funcionario();
			func.setNome(nome);
			
			Funcionariodao bdpessoa = Funcionariodao.getInstance();
			bdpessoa.inserir(func);
			}
		});
		btnNewButton.setBounds(152, 7, 89, 23);
		contentPane.add(btnNewButton);
		
		txtNome = new JTextField();
		txtNome.setBounds(56, 8, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
	}
	
}
