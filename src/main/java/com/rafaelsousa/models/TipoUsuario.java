package com.rafaelsousa.models;

public enum TipoUsuario {

	COORDENADOR(1, "Coordenador"),
	ADMINISTRATIVO(2, "Administrativo"),
	ASSISTENTE_SOCIAL(1, "Assistente social");
	
	private int id;
	private final String descricao;
	
	private TipoUsuario(int codigo, String descricao) {
		this.id = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return id;
	}

	public void setCodigo(int codigo) {
		this.id = codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return String.valueOf(id);
	}
	
}
