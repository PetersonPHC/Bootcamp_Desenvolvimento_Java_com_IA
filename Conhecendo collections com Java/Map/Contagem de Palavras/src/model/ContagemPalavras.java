package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ContagemPalavras {
	private Map<String, Integer> contagemPalavras = new HashMap<>();

	public void adicionarPalavra(String palavra, Integer contagem) {
		contagemPalavras.put(palavra, contagem);
	}

	public void removerPalavra(String palavra) throws Exception {
		if (!contagemPalavras.isEmpty()) {
			if (contagemPalavras.containsKey(palavra)) {
				contagemPalavras.remove(palavra);
			} else {
				throw new Exception("Palavra Inexistente");
			}
		} else {
			throw new Exception("A Contagem Está Vazia! Adicione pelo menos uma palavra.");
		}
	}

	public void exibirContagemPalavras() {
		System.out.println(contagemPalavras);
	}

	public String encontrarPalavraMaisFrequente() throws Exception {

		if (!contagemPalavras.isEmpty()) {
			String chavePalavraMaisFrequente = "";
			Integer valorPalavraMaisFrequente = Integer.MIN_VALUE;
			for (Entry<String, Integer> palavraComContagem : contagemPalavras.entrySet()) {
				if (palavraComContagem.getValue() > valorPalavraMaisFrequente) {
					valorPalavraMaisFrequente = palavraComContagem.getValue();
					chavePalavraMaisFrequente = palavraComContagem.getKey();
				}
			}
			return chavePalavraMaisFrequente;

		} else {
			throw new Exception("A Contagem Está Vazia! Adicione pelo menos uma palavra.");
		}
	}

}
