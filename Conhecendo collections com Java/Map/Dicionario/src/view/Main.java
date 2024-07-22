package view;

import model.Dicionario;

public class Main {

	public static void main(String[] args) {
		Dicionario d = new Dicionario();
		
		d.adicionarPalavra("Substantivo", "Palavra que nomeia seres em geral, como objetos, lugares, qualidades e ações.");
		d.adicionarPalavra("Verbo", "Palavra que indica ações, estados, processos ou fenômenos");
		d.adicionarPalavra("Adjetivo", "Descreve características de substantivos.");
		d.adicionarPalavra("Pronome", "Substitui ou acompanha o substantivo.");
		d.adicionarPalavra("Advérbio", "Palavra invariável que acompanha e modifica o sentido de verbos, adjetivos ou outros advérbios");
		
		d.exibirPalavras();

		d.removerPalavra("Advérbio");
		d.removerPalavra("Adjetivo");
		d.exibirPalavras();
		
		System.out.println(d.pesquisarPorPalavra("Verbo"));
	}

}
