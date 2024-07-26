package view;
import java.util.prefs.BackingStoreException;

import model.Banco;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente("Venilton Rocha", "111.222.333-44","Desenvolvedor");
		Cliente peterson = new Cliente("Peterson Chaia", "999.888.777-66","Desenvolvedor");
		
		Conta contaCorrenteVenilton = new ContaCorrente(venilton);
		Conta contaPoupancaVenilton = new ContaPoupanca(venilton);
		Conta contaCorrentePeterson = new ContaCorrente(peterson);
		Conta contaPoupancaPeterson = new ContaPoupanca(peterson);

		contaCorrenteVenilton.depositar(1300.50);
		contaCorrenteVenilton.transferir(950, contaPoupancaVenilton);
		
		contaCorrenteVenilton.imprimirExtrato();
		contaPoupancaVenilton.imprimirExtrato();
		
		System.out.println();
		
		contaCorrentePeterson.depositar(2500.00);
		contaCorrentePeterson.transferir(1500, contaPoupancaPeterson);

		contaCorrentePeterson.imprimirExtrato();
		contaPoupancaPeterson.imprimirExtrato();
	
		System.out.println("\n*************************************************************\n");
	
		Banco banco = new Banco();
		
		banco.adicionarConta(contaPoupancaPeterson);
		banco.adicionarConta(contaPoupancaVenilton);
		
		banco.exibirContas();
	}

}
