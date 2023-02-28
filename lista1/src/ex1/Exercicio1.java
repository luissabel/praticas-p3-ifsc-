package ex1;
import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Double precoLitro = 0.0;
		Integer quantidadeLitros = 0;
		
			precoLitro = Double.valueOf(JOptionPane.showInputDialog("Qual o preço do litro de gasolina?"));
			quantidadeLitros = Integer.valueOf(JOptionPane.showInputDialog("quantos litros de gasolina foram usados?"));
			
			JOptionPane.showMessageDialog(null, "o valor total foi "+ calculoTota(quantidadeLitros,precoLitro));
			
	}
			public static Double calculoTota (Integer quantidadeLitros, Double precoLitros) {
				Double totalpagamento = precoLitros*quantidadeLitros;
				return totalpagamento;
			}

	}

