package br.tdd.crud;

import br.tdd.entities.Pessoa;

public class Proposta extends Pessoa {

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
		} else if (this.getSexo() != "Masculino" && this.getSexo() != "Feminino") {
			setStatus(11);
			mensagem = "Favor informar o sexo";
		} else if (this.getCpf() == null) {
			setStatus(11);
			mensagem = "Favor informar o CPF";
		} else if (this.getDataNascimento() == null) {
			setStatus(11);
			mensagem = "Favor informar a Data de Nascimento";
		} else {			
			System.out.println(this.getNome());
			setStatus(10);
			mensagem = "Proposta Incluída com Sucesso";
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
	
}
