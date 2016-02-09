package com.rafaelsousa.models;

public enum TipoHospede {
	ACOMPANHANTE(1, "Acompanhante"),
	PACIENTE(2, "Paciente");
	
	private int id;
	private final String descricao;
	
	private TipoHospede(int codigo,String descricao) {
		this.id = codigo;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getCodigo() {
		return id;
	}

	public void setCodigo(int codigo) {
		this.id = codigo;
	}
	
	@Override
	public String toString() {
		return String.valueOf(id);
	}

}
