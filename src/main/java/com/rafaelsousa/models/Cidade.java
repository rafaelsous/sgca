package com.rafaelsousa.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cidades")
public class Cidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cidade_ID", length=11)
	private Long id;
	
	@Column(length=50)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="estado_ID", referencedColumnName="estado_ID")
	private Estado estado;
	
	@Column(length=1)
	private boolean capital;

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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public boolean isCapital() {
		return capital;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
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
		Cidade other = (Cidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ID: " + getId() + "\nNome: " + nome 
				+ "\nEstado: " + String.copyValueOf(estado.getSigla()) + "\n\n";
	}

}
