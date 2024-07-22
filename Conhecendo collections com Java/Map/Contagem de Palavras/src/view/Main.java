package view;

import model.ContagemPalavras;

public class Main {

	public static void main(String[] args) {
		ContagemPalavras contagemPalavras = new ContagemPalavras();

		contagemPalavras.adicionarPalavra("Java", 200);
		contagemPalavras.adicionarPalavra("Python", 105);
		contagemPalavras.adicionarPalavra("C++", 80);
		contagemPalavras.adicionarPalavra("C#", 135);
		contagemPalavras.adicionarPalavra("JavaScript", 250);
		contagemPalavras.adicionarPalavra("Assembly", 50);

		try {
			System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());

			contagemPalavras.exibirContagemPalavras();

			contagemPalavras.removerPalavra("JavaScript");
		
			System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
