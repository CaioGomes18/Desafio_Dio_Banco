package com.bancoDigital.main;

import java.util.Scanner;
import com.bancoDigital.dominio.*;
import com.bancoDigital.service.RealizacaoConta;
import com.bancoDigital.service.*;
public class Main {
	public static void main(String [] args) {
		
		
		
		double valorDeposito = 0;
		Scanner input = new Scanner(System.in);
		int escolhaConta = 0;
		int escolha;
		
		System.out.println("Bem vindo ao sistema do banco");
		System.out.println("Você deseja criar qual tipo de conta : Poupaça ou Conrrente?");
		System.out.println("Aperte 1 para poupança ou 2 para Corrente e aperte Enter.");
		
		escolhaConta = input.nextInt();
		
		
		if(escolhaConta == 1) {
			
			Conta conta = new ContaPoupanca();
			System.out.println("deseja depositar alguma quantia inicial?");
			
			
			String qI = input.next();
			qI.toUpperCase();
			
			if(qI.equalsIgnoreCase("sim") ) {
				System.out.println("Valor a ser depositado ?");
				valorDeposito = input.nextDouble();
				conta.depositar(valorDeposito);
				
				
			}
			if (conta instanceof ContaPoupanca) {
			    ((ContaPoupanca) conta).imprimirExtrato();
			}
			
			System.out.println("Deseja realizar alguma operação?");
			System.out.println("1-deposito e saque, 2-transferencia ou 3 para ver o rendimento da conta no mês");
			escolha = input.nextInt();
			switch(escolha) {
			case 1:
				RealizacaoConta.realizarFuncao(conta);
				break;
				
			case 2:
				Conta contaTransferencia = new ContaPoupanca();
				
				conta.transferir(contaTransferencia, 500);
			case 3:
				RealizacaoConta.Rendimento_conta(conta);
				break;
			}
			
		}
		
		if(escolhaConta == 2) {
			Conta conta= new ContaPoupanca();
			System.out.println("deseja depositar alguma quantia inicial?");
			
			
			String qI = input.next();
			qI.toUpperCase();
			
			if(qI.equalsIgnoreCase("sim") ) {
				System.out.println("Valor a ser depositado ?");
				valorDeposito = input.nextDouble();
				conta.depositar(valorDeposito);
				
				
			}
			if (conta instanceof ContaPoupanca) {
			    ((ContaPoupanca) conta).imprimirExtrato();
			}
			
			System.out.println("Deseja realizar alguma operação?");
			System.out.println("1-deposito e saque, 2-transferencia ou 3 para ver o rendimento da conta no mês");
			escolha = input.nextInt();
			switch(escolha) {
			case 1:
				RealizacaoConta.realizarFuncao(conta);
				break;
				
			case 2:
				Conta contaTransferencia = new ContaPoupanca();
				
				conta.transferir(contaTransferencia, 500);
			case 3:
				RealizacaoConta.Rendimento_conta(conta);
				break;
			}
			
			
		}
		
		
		
		
		
		
		
	}
}
