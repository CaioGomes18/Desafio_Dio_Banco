package com.bancoDigital.service;

import com.bancoDigital.dominio.Conta;
import com.bancoDigital.dominio.ContaCorrente;
import com.bancoDigital.dominio.ContaPoupanca;

import java.util.Scanner;

public class RealizacaoConta {
	private static int opcao;
	static Scanner input = new Scanner(System.in);
	static private double valor;
	public static void realizarFuncao(Conta conta) {
		
		do {
			System.out.println("\t0-sair\n\t1 - Deposito\n\t2-sacar");
			opcao = input.nextInt();
			if(opcao == 2) {
				System.out.println("Quanto deseja sacar?");
				valor = input.nextDouble();
				conta.sacar(valor);
			}else if(opcao == 1){
				System.out.println("Quanto deseja depositar?");
				valor = input.nextDouble();
				conta.depositar(valor);
			}

			if (conta instanceof ContaPoupanca) {
			    ((ContaPoupanca) conta).imprimirExtrato();
			}
			if (conta instanceof ContaCorrente) {
			    ((ContaCorrente) conta).imprimirExtrato();
			}
		}while(opcao != 0);
		
	}
	
	public static void Rendimento_conta(Conta conta) {
		System.out.println("Relatório rendimento da conta");
		double rendimento = conta.calculoRendimento();
		System.out.println("O rendimento da conta será de " + rendimento + " R$ nesse momento");
	}
}
