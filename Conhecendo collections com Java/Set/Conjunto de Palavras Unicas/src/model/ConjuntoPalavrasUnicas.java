package model;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	private Set<String> conjuntoPalavras;

	public ConjuntoPalavrasUnicas() {
		super();
		conjuntoPalavras = new HashSet<>();
	}

	public void adicionarPalavra(String palavra) {
		conjuntoPalavras.add(palavra);
	}

	public void removePalavra(String palavra) {
		boolean palavraEncontrada = false;
		for (String palavraNoConjunto : conjuntoPalavras) {
			if (palavra == palavraNoConjunto) {
				conjuntoPalavras.remove(palavra);
				System.out.println("Palavra Removida do Conjunto");
				palavraEncontrada = true;
				break;
			}
		}
		if (!palavraEncontrada) {
			System.out.println("Palavra Não Encontrada no Conjunto");
		}
	}

	public void verificarPalavra(String palavra) {
		boolean palavraEncontrada = false;
		for (String palavraNoConjunto : conjuntoPalavras) {
			if (palavra == palavraNoConjunto) {
				System.out.println("Palavra Encontrada no Conjunto");
				palavraEncontrada = true;
				break;
			}
		}
		if (!palavraEncontrada) {
			System.out.println("Palavra Não Encontrada no Conjunto");
		}
	}

	public void exibirPalavrasUnicas() {
		System.out.println(conjuntoPalavras);
	}
}
