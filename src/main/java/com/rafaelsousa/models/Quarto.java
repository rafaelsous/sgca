package com.rafaelsousa.models;

public enum Quarto {
	
	COMUM(1, "COMUM"), ONCOLOGICO(2, "ONCOLÓGICO");

	private int id;
	private final String descricao;

	private Quarto(int id, String descricao) {
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

	@Override
	public String toString() {
		return String.valueOf(id);
	}
	
}
