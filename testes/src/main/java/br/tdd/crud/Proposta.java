package br.tdd.crud;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.log4j.Logger;

import br.tdd.entities.Pessoa;

public class Proposta extends Pessoa {
	final static Logger logger = Logger.getLogger(Proposta.class);

	public Proposta(String nome, String sexo, String cpf, long cnh, String dataNascimento, long rg, String orgaoEmissor,
			String dataEmissao, String telefone, String celular, String email, String enedereco, int numeroCasa,
			String cep, String estado, String convenio, int matriculaConvenio, float valorDesejado) {
		super(nome, sexo, cpf, cnh, dataNascimento, rg, orgaoEmissor, dataEmissao, telefone, celular, email, enedereco,
				numeroCasa, cep, estado, convenio, matriculaConvenio, valorDesejado);
	}

	private int status;
	private String mensagem;

	public void IncluirProposta() {

		if (this.getNome() == null) {
			setStatus(11);
			mensagem = "Favor informar o nome";
			System.out.println(mensagem);
		} else if (this.getSexo() != "Masculino" && this.getSexo() != "Feminino") {
			setStatus(11);
			mensagem = "Favor informar o sexo";
			System.out.println(mensagem);
		} else if (this.getCpf() == null) {
			setStatus(11);
			mensagem = "Favor informar o CPF";
			System.out.println(mensagem);
		} else if (this.getDataNascimento() == null) {
			setStatus(11);
			mensagem = "Favor informar a Data de Nascimento";
			System.out.println(mensagem);
		} else {
			System.out.println(this.getNome());
			setStatus(10);
			mensagem = "Proposta Incluída com Sucesso";
			System.out.println(mensagem);
		}

	}

	public void AlterarProposta() {
		if (getStatus() == 20) {
			this.setRg(1234567890);
			this.setCep("93265-000");
			this.setEnedereco("Avenida Teste");
			this.setNumeroCasa(1234);
			this.setEstado("RS");
			setStatus(30);
			mensagem = "Proposta Alterada com Sucesso";
			System.out.println(mensagem);
			System.out.println("Novo status: " + getStatus());
		} else {
			mensagem = "Proposta não disponível para alteração";
			System.out.println(mensagem);
		}
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	/**
	 * O método removeProposta removerá a proposta enviada por parâmetro utilizando
	 * o nome da pessoa constante na proposta (apenas para teste pois uma mesma
	 * pessoa pode possuir mais de uma proposta)
	 * 
	 * @param nomeCliente
	 */
	public boolean removeProposta(String nomeCliente) {
		ArrayList<String> propostas = new ArrayList<String>();
		propostas.add("Fulano");
		propostas.add("Ciclano");
		propostas.add("Beltrano");

		System.out.println(propostas);

		if (propostas.removeIf(name -> name.equals(nomeCliente))) {
			System.out.println("Proposta removida com sucesso.");
			return true;
		}
		return false;
	}

}
