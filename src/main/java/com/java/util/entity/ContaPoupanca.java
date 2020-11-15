package com.java.util.entity;

public class ContaPoupanca {

	private Integer agencia;
	private Integer numero;

	public ContaPoupanca(Integer agencia, Integer numero) {
		this.agencia = agencia;
		this.numero = numero;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
