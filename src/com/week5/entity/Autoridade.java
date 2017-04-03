package com.week5.entity;

import com.week5.utils.FormatadorNome;

public class Autoridade {

	private String nome;
	private String sobrenome;
	private FormatadorNome formatadorNome;

	public Autoridade(String nome, String sobrenome, FormatadorNome formatadorNome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatadorNome = formatadorNome;
	}

	protected String getTratamento() {
		return this.formatadorNome.formatarNome(nome, sobrenome);

	}

}
