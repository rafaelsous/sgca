package com.rafaelsousa.models;

public enum EstadoCivil {
	SOLTEIRO(1, "Solteiro"), 
	CASADO(2, "Casado"),
	OUTROS(3, "Outros");
	
	private int id;
	private final String descrição;
	
	private EstadoCivil(int codigo, String descricao) {
		this.id = codigo;
		this.descrição = descricao;
	}
	
	public String getDescrição() {
		return descrição;
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
