package br.tdd.crud;

import java.util.ArrayList;

/**
 * 
 * @author luis
 * 
 */
public class ControleDeAcesso {
	// final static Logger logger = Logger.getLogger(ControleDeAcesso.class);
	/**
	 * O método verificaListaContemAdministrador() valida se a matrícula recebida
	 * por parâmetro está entre as permitidas para acessar o sistema
	 * 
	 * @param matricula
	 * @return
	 */
	public boolean verificaListaContemAdministrador(String matricula) {
		
		ArrayList<String> admins = new ArrayList<String>();

		admins.add("11239");
		admins.add("11240");
		admins.add("11241");
		admins.add("11242");
		admins.add("11243");
		admins.add("11245");

		for (String a : admins) {
			if (a.equals(matricula)) {
				System.out.println("Acesso com a matrícula " +matricula+ " realizada com sucesso.");
				return true;
			}
		}
		System.out.println("Acesso com a matrícula " +matricula+ " inválida.");
		return false;
	}
}
