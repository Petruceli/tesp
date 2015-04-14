package br.unibh.escola.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;



	@Entity
	@Table(name = "TB_PESSOA")
	@Inheritance(strategy=InheritanceType.JOINED)
	public abstract class Pessoa {

	@Id
	private Long id;
	
	@NotBlank
	@NotNull
	@Size(min = 5, max = 100)
	@Pattern(regexp = "[A-Za-z À-ú ]*", message = "must contain only letters and spaces")
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;

	@NotBlank
	@NotNull
	@Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")
	@Column(unique = true)
	private String cpf;

	public Pessoa(Long id, String nome, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
	}

	
}
