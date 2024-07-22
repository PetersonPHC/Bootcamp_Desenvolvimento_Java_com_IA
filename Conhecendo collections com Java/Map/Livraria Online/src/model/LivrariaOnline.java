package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
	Map<String, Livro> livrosDisponiveis = new HashMap<>();

	public void adicionarLivro(String link, String titulo, String autor, double preco) {
		livrosDisponiveis.put(link, new Livro(titulo, autor, preco));
	}

	public void removerLivro(String titulo) {
		List<String> listaTitulosRemover = new ArrayList<>();
		if (!livrosDisponiveis.isEmpty()) {
			for (Map.Entry<String, Livro> linkComLivro : livrosDisponiveis.entrySet()) {
				if (linkComLivro.getValue().getTitulo().equalsIgnoreCase(titulo)) {
					listaTitulosRemover.add(linkComLivro.getKey());
				}
			}
			for (String link : listaTitulosRemover) {
				livrosDisponiveis.remove(link);
			}

		} else {
			System.err.println("A lista de livros está vazia, tente adicionar um livro primeiro.");
		}
	}

	public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {

		// coloca o que tem que ordenar em uma list/ArrayList
		List<Map.Entry<String, Livro>> livrosParaOrdenar = new ArrayList<>(livrosDisponiveis.entrySet());

		// ordena a lista
		Collections.sort(livrosParaOrdenar, new OrdenaPorPreco());

		// cria o Map que será retornado
		Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

		// Insere os valores da lista no map para retorná-lo
		for (Map.Entry<String, Livro> LinkComLivroOrdenado : livrosParaOrdenar) {
			livrosOrdenadosPorPreco.put(LinkComLivroOrdenado.getKey(), LinkComLivroOrdenado.getValue());
		}
		// retorna o novo Map Já Ordenado por Preço
		return livrosOrdenadosPorPreco;
	}

	public void pesquisarLivrosPorAutor(String autor) {
		for (Livro livro : livrosDisponiveis.values()) {
			if (livro.getAutor().equalsIgnoreCase(autor)) {
				System.out.println(livro);
			}
		}
	}

	public Livro obterLivroMaisCaro() {
		Livro livroMaisCaro = new Livro("", "", Integer.MIN_VALUE);
		for (Livro livro : livrosDisponiveis.values()) {
			if (livro.getPreco() > livroMaisCaro.getPreco()) {
				livroMaisCaro = livro;
			}
		}
		return livroMaisCaro;
	}

	public Livro obterLivroMaisBarato() {

		Livro livroMaisBarato = new Livro("", "", Integer.MAX_VALUE);
		for (Livro livro : livrosDisponiveis.values()) {
			if (livro.getPreco() < livroMaisBarato.getPreco()) {
				livroMaisBarato = livro;
			}
		}
		return livroMaisBarato;
	}
}
