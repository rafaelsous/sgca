package com.rafaelsousa.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario extends Pessoa {

	private static final long serialVersionUID = 1L;

	@Column(length=10, unique=true)
	private String matricula;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
