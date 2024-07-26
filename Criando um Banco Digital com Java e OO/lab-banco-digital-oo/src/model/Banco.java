package model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Banco {

	@Getter
	@Setter
	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}

	public void removerConta(String CPF) {
		boolean validacao = false;
		if (contas.isEmpty()) {
			System.err.println("A Lista de Contas está vazia. Tente adicionar uma conta primeiro!");
		} else {

			for (Conta conta : contas) {
				if (conta.cliente.getCPF() == CPF) {
					contas.remove(conta);
					validacao = true;
				}
			}
			if (!validacao)
				;
			System.err.println("Conta não encontrada");
		}
	}

	public void exibirContas() {
		if (contas.isEmpty()) {
			System.err.println("A Lista de Contas está vazia.");
		} else {

			System.out.println("LISTA DE CONTAS CADASTRADAS");
			for (Conta conta : contas) {
				System.out.println(conta.toString());
			}
		}
	}
}
