package com.bancoDigital.dominio;

public abstract class Conta implements FuncoesBanco, Rendimento{
	
	public static final int AGENCIA_PADRAO = 1;
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void sacar(double valorSaque) {
		this.saldo = saldo - valorSaque;
	}
	
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public void transferir(Conta contaDestino, double valorTransferencia) {
		this.sacar(valorTransferencia);
		contaDestino.depositar(valorTransferencia);
		
	}
	
	

	protected void informacoesComuns() {
		System.out.println("Saldo : " + this.saldo);
		System.out.println("Numero : " + this.numero);
		System.out.println("Agencia : " + this.agencia);
	}
	
	
	
	
	
}
