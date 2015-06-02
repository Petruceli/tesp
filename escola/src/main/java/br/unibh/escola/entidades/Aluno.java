package br.unibh.escola.entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@PrimaryKeyJoinColumn
@Table(name = "TB_ALUNO", uniqueConstraints = @UniqueConstraint(columnNames = "matricula"))
@NamedQueries({ @NamedQuery(name = "Aluno.findByName", query = "select a from Aluno a where a.nome like :nome") })
public class Aluno extends Pessoa {

	@NotNull
	@Column(unique = true)
	private Long matricula;

	@NotNull
	@Column(name = "dataAniversairo")
	@Temporal(TemporalType.DATE)
	private Date dataAniversairo;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "aluno_disciplina", joinColumns = @JoinColumn(name = "id_aluno"), inverseJoinColumns = @JoinColumn(name = "id_disciplina"))
	private List<Disciplina> disciplinas;

	public Aluno() {
	}

	public Aluno(Long id, Long matricula, String nome, String cpf,
			Date dataAniversairo) {
		super(id, nome, cpf);
		this.matricula = matricula;
		this.dataAniversairo = dataAniversairo;
	}

	public Aluno(Long id, Long matricula, String nome, String cpf) {
		super(id, nome, cpf);
		this.matricula = matricula;
	}

	public Aluno(Long id, Long matricula, String nome) {
		super(id, nome, null);
		this.matricula = matricula;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public Date getDataAniversairo() {
		return dataAniversairo;
	}

	public void setDataAniversairo(Date dataAniversairo) {
		this.dataAniversairo = dataAniversairo;
	}

	public static boolean verificaMatricula(String matricula) {
		if (matricula == null) {
			return false;
		} else if (matricula.trim().equals("")) {
			return false;
		} else if (matricula.length() != 8) {
			return false;

		}
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "Aluno [matricula=" + matricula
				+ ", dataAniversairo=" + dataAniversairo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((dataAniversairo == null) ? 0 : dataAniversairo.hashCode());
		result = prime * result
				+ ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (dataAniversairo == null) {
			if (other.dataAniversairo != null)
				return false;
		} else if (!dataAniversairo.equals(other.dataAniversairo))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

}
