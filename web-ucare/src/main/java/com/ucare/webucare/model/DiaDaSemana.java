package com.ucare.webucare.model;

public enum DiaDaSemana {
	
	SEGUNDA(1,"Segunda-Feira"),
	TERCA(2,"Terça-Feira"),
	QUARTA(3,"Quarta-Feira"),
	QUITA(4,"Quinta-Feira"),
	SEXTA(5,"Sexta-Feira"),
	SABADO(6,"Sábado"),
	DOMINGO(7,"Domingo");
	
	private String descricao;
	private int num;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	private DiaDaSemana(int num, String descricao) {
		this.descricao = descricao;
		this.num = num;
	}
}
