package com.rafaelsousa.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="hospede")
public class Hospede extends Pessoa {

	private static final long serialVersionUID = 1L;

	@Column(length=30)
	private String naturalidade;
	
	@Column(name="estado_civil")
	private EstadoCivil estadoCivil;
	
	@Column(name="nome_da_mae", length=50)
	private String nomeDaMae;
	
	@Column(length=30)
	private String município;
	
	@Column(length=2)
	private char[] uf;
	
	@Column(name="tipo_hospede", length=15)
	private TipoHospede tipo;
	
	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNomeDaMae() {
		return nomeDaMae;
	}

	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}

	public String getMunicípio() {
		return município;
	}

	public void setMunicípio(String município) {
		this.município = município;
	}

	public char[] getUF() {
		return uf;
	}

	public void setUF(char[] uf) {
		this.uf = uf;
	}

	public TipoHospede getTipo() {
		return tipo;
	}

	public void setTipo(TipoHospede tipo) {
		this.tipo = tipo;
	}
	
}
