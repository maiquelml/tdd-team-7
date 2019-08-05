package br.tdd.filter;

import br.tdd.entities.Pessoa;

public class Filtro {
	
	private String cpf;
	
	public Filtro(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Pessoa[] filtrarClientes(Pessoa[] lista) {
		
		for(Pessoa item : lista){
			
			if(item.getCpf() == this.getCpf()) {
				Pessoa[] novaLista = {
						item 
				};

				return novaLista;
			}
		}
		
		return lista;
	}
}
