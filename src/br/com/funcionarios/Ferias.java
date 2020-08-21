package br.com.funcionarios;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ferias extends FuncionarioPessoaFisica implements Solicitacao {

	public Ferias(String endereco, String nome, String cpf, String email, int setor, String nit, double salario, double supervisor, double gerente) {
		super(endereco, nome, cpf, email, setor, nit, salario, supervisor, gerente);
		
	
	}
	public static void main(String[] args) {
		
		LocalDate dataDeAdmissao = LocalDate.of(2019, 3, 25);
		LocalDate dataDeRequerimentoFerias = LocalDate.of(2020,8,21);
		LocalDate dataAtual =  LocalDate.now();
		
	
		DateTimeFormatter valorFormatado =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String dataDeAdmissao1 = dataDeAdmissao.format(valorFormatado);
		System.out.println("Data : "+dataDeAdmissao1);
		
		Period periodo = Period.between(dataDeAdmissao, dataDeRequerimentoFerias);
		System.out.println(periodo.getMonths());
		
		System.out.println(periodo.toTotalMonths());
		
		
		if(periodo.toTotalMonths() < 11) {
			System.out.println("Não é possível tirar férias. Tempo total na empresa abaixo de 11 meses: "+ periodo.toTotalMonths()+" meses.");
		}else {
			System.out.println("Funcionário pode requerir férias e pode nao estar disponivel para trabalho. Tempo total na empresa acima de 11 meses. Tempo total na empresa: "+dataDeAdmissao.lengthOfMonth()+" meses.");

		}

		
	}
	@Override
	public void pedirAumento() {
		LocalDate dataDeAdmissao = LocalDate.of(2019, 3, 25);
		
		if(dataDeAdmissao.lengthOfMonth() > 12) {
			System.out.println("Pode pedir aumento.");
		}else {
			System.out.println("Ainda nao pode pedir aumento");
		}
	}
}
