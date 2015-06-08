package br.unibh.escola.entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;


	@Entity
	@Table(name = "TB_SALA")
	@NamedQueries({ @NamedQuery(name = "Sala.findByCapacidade", query = "select s from Sala s where s.capacidade >= :capacidade") })
	public class Sala {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name = "codigo", length = 10, nullable = false, unique = true)
	private String codigo;
	
	@NotNull
	@Column(name = "capacidade", nullable = false)
	private int capacidade;
	
	
	@Column(name="qBranco", nullable=false) 
	private boolean qBranco;
	
	@Column(name="dtShow", nullable=false)
	private boolean dtShow;
	
	@Column(name="PC", nullable=false)
	private boolean PC;
	
	@Column(name = "observacao", length = 255, nullable = true)
	private String observacao;
	
	@NotNull
	@Column(name="status")
	private int status;
	
	@Column(name="dataTerminoManutencao", nullable=true)
	@Temporal(value = TemporalType.DATE)
	private Date dataTerminoManutencao;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="sala")
	private List<Disciplina> disciplinas;
	
	public Sala(){}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public boolean isqBranco() {
		return qBranco;
	}

	public void setqBranco(boolean qBranco) {
		this.qBranco = qBranco;
	}

	public boolean isdtShow() {
		return dtShow;
	}

	public void setDtShow(boolean dtShow) {
		this.dtShow = dtShow;
	}

	public boolean isPC() {
		return PC;
	}

	public void setPC(boolean PC) {
		this.PC = PC;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setobservacao(String observacao) {
		this.observacao = observacao;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getdataTerminoManutencao() {
		return dataTerminoManutencao;
	}

	public void setdataTerminoManutencao(Date dataTerminoManutencao) {
		this.dataTerminoManutencao = dataTerminoManutencao;
	}
	
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}


	@Override
	public String toString() {
		return "Sala [id=" + id + ", codigo=" + codigo + ", capacidade="
				+ capacidade + ", qBranco=" + qBranco + ", dtShow=" + dtShow
				+ ", PC=" + PC + ", observacao=" + observacao + ", status="
				+ status + ", dataTerminoManutencao=" + dataTerminoManutencao
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (PC ? 1231 : 1237);
		result = prime * result + capacidade;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime
				* result
				+ ((dataTerminoManutencao == null) ? 0 : dataTerminoManutencao
						.hashCode());
		result = prime * result + (dtShow ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((observacao == null) ? 0 : observacao.hashCode());
		result = prime * result + (qBranco ? 1231 : 1237);
		result = prime * result + status;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sala other = (Sala) obj;
		if (PC != other.PC)
			return false;
		if (capacidade != other.capacidade)
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dataTerminoManutencao == null) {
			if (other.dataTerminoManutencao != null)
				return false;
		} else if (!dataTerminoManutencao.equals(other.dataTerminoManutencao))
			return false;
		if (dtShow != other.dtShow)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (observacao == null) {
			if (other.observacao != null)
				return false;
		} else if (!observacao.equals(other.observacao))
			return false;
		if (qBranco != other.qBranco)
			return false;
		if (status != other.status)
			return false;
		return true;
	}	
	
	
}
