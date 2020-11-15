package com.java.util.entity;

public class Conta {

	private ContaCorrente contaCorrente;
	private ContaPoupanca contaPoupanca;

	public Conta(ContaCorrente contaCorrente, ContaPoupanca contaPoupanca) {
		super();
		this.contaCorrente = contaCorrente;
		this.contaPoupanca = contaPoupanca;
	}

	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public ContaPoupanca getContaPoupanca() {
		return contaPoupanca;
	}

	public void setContaPoupanca(ContaPoupanca contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}

}
