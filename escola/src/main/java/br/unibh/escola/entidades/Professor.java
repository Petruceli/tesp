package br.unibh.escola.entidades;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Entity
@PrimaryKeyJoinColumn
@Table(name = "TB_PROFESSOR", uniqueConstraints = @UniqueConstraint(columnNames = "salario"))
@NamedQueries({ @NamedQuery(name = "Professor.findByName", query = "select p from Professor p where p.nome like :nome") })
public class Professor extends Pessoa {

	@NotNull
	@DecimalMin(value = "500")
	@DecimalMax(value = "50000")
	@Column(name = "salario", columnDefinition = "Decimal(10,2)")
	private BigDecimal salario;
	public static Double BONUS = 0.10D;

	public Professor(){}
	
	public Professor(Long id, String nome, String cpf, BigDecimal salario) {
		super(id, nome, cpf);
		this.salario = salario;
	}

	public Professor(Long id, String nome, String cpf) {
		super(id, nome, cpf);
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public static Double getBONUS() {
		return BONUS;
	}

	public static void setBONUS(Double bONUS) {
		BONUS = bONUS;
	}

	@Override
	public String toString() {
		return super.toString() + "Professor [salario=" + salario + "]";
	}

}
