package view;

import model.ConjuntoPalavrasUnicas;

public class Main {

	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
		conjuntoPalavrasUnicas.adicionarPalavra("Java");
		conjuntoPalavrasUnicas.adicionarPalavra("Python");
		conjuntoPalavrasUnicas.adicionarPalavra("C#");
		conjuntoPalavrasUnicas.adicionarPalavra("C++");
		conjuntoPalavrasUnicas.adicionarPalavra("Kotlin");
		conjuntoPalavrasUnicas.adicionarPalavra("C++");
		
		conjuntoPalavrasUnicas.exibirPalavrasUnicas();
		
		conjuntoPalavrasUnicas.verificarPalavra("C#");
		conjuntoPalavrasUnicas.removePalavra("C++");
		conjuntoPalavrasUnicas.verificarPalavra("C++");
		
		conjuntoPalavrasUnicas.exibirPalavrasUnicas();

	}

}
