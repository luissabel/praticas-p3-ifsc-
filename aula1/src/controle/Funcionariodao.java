package controle;

import java.util.ArrayList;

import modelo.Funcionario;

public class Funcionariodao {
	
	private static ArrayList<Funcionario> listaFuncionarios;
	
	public Funcionariodao() {
		listaFuncionarios = new ArrayList<>();
	}
	public boolean inserir(Funcionario func) {
		listaFuncionarios.add(func);
		return false;
	}
	public ArrayList<Funcionario> listar(){
		return listaFuncionarios;
	}
	public static Funcionariodao getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}
