package br.com.funcionarios;

public class FuncionarioPessoaJuridica {
	private String endereco;
	private String nome;
	private String email;
	private int setor;
	private String dataDeAdmissao;
	private String dataDeDemissao;
	private String cnpj;
	private double salarioJuridico;
	public FuncionarioPessoaJuridica(String endereco, String nome, String email, int setor, String dataDeAdmissao,
			String dataDeDemissao, String cnpj, double salarioJuridico) {
		this.endereco = endereco;
		this.nome = nome;
		this.email = email;
		this.setor = setor;
		this.dataDeAdmissao = dataDeAdmissao;
		this.dataDeDemissao = dataDeDemissao;
		this.cnpj = cnpj;
		this.salarioJuridico = salarioJuridico;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSetor() {
		return setor;
	}
	public void setSetor(int setor) {
		this.setor = setor;
	}
	public String getDataDeAdmissao() {
		return dataDeAdmissao;
	}
	public void setDataDeAdmissao(String dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	public String getDataDeDemissao() {
		return dataDeDemissao;
	}
	public void setDataDeDemissao(String dataDeDemissao) {
		this.dataDeDemissao = dataDeDemissao;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public double getSalario() {
		return salarioJuridico;
	}
	public void setSalario(double salarioJuridico) {
		this.salarioJuridico = salarioJuridico;
	}
	
	
}
