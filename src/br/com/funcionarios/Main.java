package br.com.funcionarios;

public class Main {

	public static void main(String[] args) {

		FuncionarioPessoaFisica pessoaFisica = new FuncionarioPessoaFisica("rua 1", "Felipe", "333333", "felipe@felipe.com", 3, "555555", 1500.00, 2000.00, 2500.00);
		FuncionarioPessoaJuridica pessoaJuridica = new FuncionarioPessoaJuridica("rua2","incognituous","incognituous@incognitous.com",5, "25/03/2019", "00/00/00","888888",3500.00);
		Ferias ferias = new Ferias("rua 1", "Felipe", "333333", "felipe@felipe.com", 3, "555555", 1500.00, 2000.00, 2500.00);
		
		System.out.println(pessoaFisica.getSupervisor());
		System.out.println(pessoaFisica.getGerente());
		
		
		System.out.println(ferias);
		
	}

}
