package br.tdd.entities;

public class Pessoa {

	private String nome;
	private String Sexo;
	private String cpf;
	private long cnh;
	private String dataNascimento;
	private long rg;
	private String orgaoEmissor;
	private String dataEmissao;
	private String telefone;
	private String celular;
	private String email;
	private String endereco;
	private int numeroCasa;
	private String cep;
	private String estado;

	public Pessoa(String nome, String sexo, String cpf, long cnh, String dataNascimento, long rg, String orgaoEmissor,
			String dataEmissao, String telefone, String celular, String email, String endereco, int numeroCasa,
			String cep, String estado, String convenio, int matriculaConvenio, float valorDesejado) {

		this.nome = nome;
		Sexo = sexo;
		this.cpf = cpf;
		this.cnh = cnh;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
		this.orgaoEmissor = orgaoEmissor;
		this.dataEmissao = dataEmissao;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.endereco = endereco;
		this.numeroCasa = numeroCasa;
		this.cep = cep;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public long getCnh() {
		return cnh;
	}

	public void setCnh(long cnh) {
		this.cnh = cnh;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
