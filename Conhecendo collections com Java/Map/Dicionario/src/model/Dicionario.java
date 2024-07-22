package model;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	private Map<String, String> dicionario = new HashMap<>();

	public void adicionarPalavra(String palavra, String definicao) {
		dicionario.put(palavra, definicao);
	}

	public void removerPalavra(String palavra) {
		if (!dicionario.isEmpty()) {
			dicionario.remove(palavra);
		} else {
			throw new NullPointerException("O Dicionário está Vazio");
		}
	}

	public void exibirPalavras() {
		System.out.println(dicionario);
	}

	public String pesquisarPorPalavra(String palavra) {
		String definicao = dicionario.get(palavra);
		return definicao;
	}

}
