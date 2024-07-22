package view;

import model.LivrariaOnline;

public class Main {

	public static void main(String[] args) {
		LivrariaOnline livraria = new LivrariaOnline();
		
		livraria.adicionarLivro("www.livro1.com", "O Primeiro", "Anônimo", 500);
		livraria.adicionarLivro("www.livro2.com", "O Segundo", "Autor Desconhecido", 399.99);
		livraria.adicionarLivro("www.livro3.com", "O Terceiro", "Anônimo", 250);
		livraria.adicionarLivro("www.livro4.com", "O Quarto", "Anônimo", 100);
		livraria.adicionarLivro("www.livro5.com", "O Quinto", "Autor Desconhecido", 99.99);
		
		System.out.println(livraria.exibirLivrosOrdenadosPorPreco());
		
		System.out.println(livraria.obterLivroMaisCaro());
		System.out.println(livraria.obterLivroMaisBarato());
		
		livraria.removerLivro("O Quarto");
		
		livraria.pesquisarLivrosPorAutor("Anônimo");

	}

}
