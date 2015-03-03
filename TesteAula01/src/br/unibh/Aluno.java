package br.unibh;

import java.util.Date;

public class Aluno extends Pessoa {

	private Long matricula;
	private Date dataAniversario;

	public Aluno(Long matricula, String nome, String cpf, Date dataAniversario) {
		super(nome, cpf);
		this.matricula = matricula;
		this.dataAniversario = dataAniversario;
	}

	public Aluno(Long matricula, String nome, String cpf) {
		super(nome, cpf);
		this.matricula = matricula;
	}

	public Aluno(Long matricula, String nome) {
		super(nome, null);
		this.matricula = matricula;
	}

	public static boolean verificaMatricula(String matricula) {
		if (matricula == null || matricula.trim().equals("") || matricula.length() != 8){
			return false;
		}
		return true;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	@Override
	public String toString() {
		return super.toString() + " Aluno [matricula=" + matricula
				+ ", dataAniversario=" + dataAniversario + "]";
	}

}
