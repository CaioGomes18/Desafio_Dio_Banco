package com.bancoDigital.dominio;


public class ContaCorrente extends Conta{
	
	private static int SEQUENCIAL = 1;
	public static final double INDICE_RENDIMENTO_MEDIO_POR_MES = 0.001;
	
	
	public ContaCorrente() {
		super.agencia = Conta.AGENCIA_PADRAO;
		super.numero = SEQUENCIAL++;
	}
	
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Corrente : ");
		informacoesComuns();
	}

	@Override
	public double calculoRendimento() {
		return this.saldo * INDICE_RENDIMENTO_MEDIO_POR_MES;
		
	}
}
