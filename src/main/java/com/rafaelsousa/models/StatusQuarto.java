package com.rafaelsousa.models;

public enum StatusQuarto {
	
	LIVRE(1, "LIVRE"), RESERVADO(2, "RESERVADO"), OCUPADO(3, "OCUPADO");

	private int id;
	private final String descricao;

	private StatusQuarto(int id, String descricao) {
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

}
