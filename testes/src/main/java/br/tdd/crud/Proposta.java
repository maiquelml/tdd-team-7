package br.tdd.crud;

import br.tdd.entities.Pessoa;

public class Proposta {

	private int status;
	private String mensagem;

	public void IncluirProposta() {
		Pessoa pessoa = new Pessoa("Marcelo Mariath", "Masculino", "005.394.690-17", 2536859, "11/01/1985", 4085791,
				"SJS", "01/02/2002", "51-3032-3599", "51-98452-6699", "teste@teste.com.br", "rua teste", 200,
				"92415-999", "RS", "SIAPE", 1757, (float) 10.000);
		setStatus(10);
		mensagem = "Proposta Incluída com Sucesso";
		System.out.println(pessoa.getNome());
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
