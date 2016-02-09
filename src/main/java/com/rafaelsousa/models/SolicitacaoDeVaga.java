package com.rafaelsousa.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="solicitacao_de_vaga")
public class SolicitacaoDeVaga implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(length=11)
	private Long id;
	
	@Column(length=10)
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@Column(length=8)
	private String hora;
	
	@Column(name="hospital_solicitante")
	private Hospital hospitalSocilitante;
	
	private AssistenteSocial solicitante;
	
	private Hospede hospede;
	
	private boolean exame;
	
	private boolean consulta;
	
	private boolean cirurgia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Hospital getHospitalSocilitante() {
		return hospitalSocilitante;
	}

	public void setHospitalSocilitante(Hospital hospitalSocilitante) {
		this.hospitalSocilitante = hospitalSocilitante;
	}

	public AssistenteSocial getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(AssistenteSocial solicitante) {
		this.solicitante = solicitante;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public boolean isExame() {
		return exame;
	}

	public void setExame(boolean exame) {
		this.exame = exame;
	}

	public boolean isConsulta() {
		return consulta;
	}

	public void setConsulta(boolean consulta) {
		this.consulta = consulta;
	}

	public boolean isCirurgia() {
		return cirurgia;
	}

	public void setCirurgia(boolean cirurgia) {
		this.cirurgia = cirurgia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		SolicitacaoDeVaga other = (SolicitacaoDeVaga) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
