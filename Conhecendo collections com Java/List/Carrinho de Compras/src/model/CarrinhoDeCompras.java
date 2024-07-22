package model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> carrinho = new ArrayList<>();

	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinho.add(new Item(nome, preco, quantidade));
		System.out.println("Item adicionado com Sucesso!");
	}

	public void removerItem(String nome) {
		List<Item> listaDeRemocao = new ArrayList<>();
		for (Item i : carrinho) {
			if (i.getNome().equalsIgnoreCase(nome)) {
				listaDeRemocao.add(i);
			}
		}
		carrinho.removeAll(listaDeRemocao);
		System.out.println("Item removido com Sucesso!");
	}

	public double calcularValorTotal() {
		double valorFinal = 0;
		for (Item i : carrinho) {
			valorFinal += i.getPreco() * i.getQuantidade();
		}
		return valorFinal;
	}

	public void exibirItens() {
		for (Item i : carrinho) {
			System.out.println((carrinho.indexOf(i) + 1) + "° " + i.toString());
		}
	}
}
