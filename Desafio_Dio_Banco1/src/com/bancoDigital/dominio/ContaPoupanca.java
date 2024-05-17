package com.bancoDigital.dominio;

public class ContaPoupanca extends Conta{
	private static int SEQUENCIAL = 2;
	public static final double INDICE_RENDIMENTO_MEDIO_POR_MES = 0.005;
	
	
	public ContaPoupanca() {
		super.agencia = Conta.AGENCIA_PADRAO;
		super.numero = SEQUENCIAL++;
	}
	
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Poupança: ");
		informacoesComuns();
	}

	@Override
	public double calculoRendimento() {
		return this.saldo * INDICE_RENDIMENTO_MEDIO_POR_MES;		
	}
}
