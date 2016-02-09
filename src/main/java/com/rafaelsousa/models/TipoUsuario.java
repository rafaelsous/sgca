package com.rafaelsousa.models;

public enum TipoUsuario {

	COORDENADOR(1, "Coordenador"),
	ADMINISTRATIVO(2, "Administrativo"),
	ASSISTENTE_SOCIAL(3, "Assistente social");
	
	private int id;
	private String descricao;
	
	private TipoUsuario(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return String.valueOf(id);
	}
	
}
