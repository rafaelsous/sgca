package com.rafaelsousa.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leito")
public class Leito implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 4)
	private Long id;

	@Column(name = "tipo_alojamento")
	private Alojamento tipoAlojamento;

	@Column(name = "tipo_quarto")
	private Quarto tipoQuarto;

	private PosicaoLeito posicaoLeito;

	private StatusQuarto status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Alojamento getTipoAlojamento() {
		return tipoAlojamento;
	}

	public void setTipoAlojamento(Alojamento tipoAlojamento) {
		this.tipoAlojamento = tipoAlojamento;
	}

	public Quarto getTipoQuarto() {
		return tipoQuarto;
	}

	public void setTipoQuarto(Quarto tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}

	public StatusQuarto getStatus() {
		return status;
	}

	public void setStatus(StatusQuarto status) {
		this.status = status;
	}

	public PosicaoLeito getPosicaoLeito() {
		return posicaoLeito;
	}

	public void setPosicaoLeito(PosicaoLeito posicaoLeito) {
		this.posicaoLeito = posicaoLeito;
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
		Leito other = (Leito) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
