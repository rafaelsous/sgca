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
@Table(name="check_in")
public class CheckIn implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Hospede hospede;
	
	@Column(name="data_entrada", length=10)
	@Temporal(TemporalType.DATE)
	private Date dataEntrada;
	
	@Column(name="data_saida", length=10)
	@Temporal(TemporalType.DATE)
	private Date dataSaida;
	
	private boolean refeicoes;
	
	@Column(name="jogo_de_cama")
	private boolean jogoDeCama;
	
	private Leito leito;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public boolean isRefeicoes() {
		return refeicoes;
	}

	public void setRefeicoes(boolean refeicoes) {
		this.refeicoes = refeicoes;
	}

	public boolean isJogoDeCama() {
		return jogoDeCama;
	}

	public void setJogoDeCama(boolean jogoDeCama) {
		this.jogoDeCama = jogoDeCama;
	}

	public Leito getLeito() {
		return leito;
	}

	public void setLeito(Leito leito) {
		this.leito = leito;
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
		CheckIn other = (CheckIn) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
