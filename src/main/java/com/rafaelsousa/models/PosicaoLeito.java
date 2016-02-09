package com.rafaelsousa.models;

public enum PosicaoLeito {

	EM_CIMA(1, "Em cima"), EMBAIXO(2, "Embaixo"), NO_CANTO(3, "No canto");

	private int id;
	private final String descricao;
	
	private PosicaoLeito(int id, String descricao) {
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
