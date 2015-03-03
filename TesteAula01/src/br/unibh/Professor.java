package br.unibh;

import java.math.BigDecimal;

public class Professor extends Pessoa {

	private BigDecimal salario;
	public static Double BONUS = 0.10;
	
	public Professor(String nome, String cpf, BigDecimal salario) {
		super(nome, cpf);
		this.salario = salario;
	}
	
	public Professor(String nome, String cpf) {
		super(nome, cpf);
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() + " Professor [salario=" + salario + "]";
	}

	
	
}
