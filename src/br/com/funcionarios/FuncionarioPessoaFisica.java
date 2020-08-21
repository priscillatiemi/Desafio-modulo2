package br.com.funcionarios;

public class FuncionarioPessoaFisica {
	
	private String endereco;
	private String nome;
	private String cpf;
	private String email;
	private int setor;
	private String nit;
	private double salario;
	private double supervisor;
	private double gerente;
	
	
	public FuncionarioPessoaFisica(String endereco, String nome, String cpf, String email, int setor, String nit, double salario, double supervisor, double gerente) {
		this.endereco = endereco;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.setor = setor;
		this.nit = nit;
		this.salario = salario;
		this.supervisor = supervisor;
		this.gerente = gerente;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public double getSalario(){
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSupervisor() {
		return supervisor = supervisor+(supervisor*0.08);
	}
	public void setSupervisor(double supervisor) {
		this.supervisor = supervisor;
	}
	public double getGerente() {
		return gerente = gerente+(gerente*0.12);
	}
	public void setGerente(double gerente) {
		this.gerente = gerente;
	}
	
	
	
	
}
