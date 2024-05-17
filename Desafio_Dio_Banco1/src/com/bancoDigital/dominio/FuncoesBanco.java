package com.bancoDigital.dominio;

public interface FuncoesBanco {
	void sacar(double valorSaque);
	
	void depositar(double valorDeposito);
	
	void transferir(Conta contaDestino, double valorTransferencia);
	
	
	
}
