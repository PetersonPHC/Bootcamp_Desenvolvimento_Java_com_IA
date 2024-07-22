package model;

import java.util.Comparator;
import java.util.Map;

public class Livro {
	private String titulo;
	private String autor;
	private double preco;

	public Livro() {
		super();
	}

	public Livro(String titulo, String autor, double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Livro {Titulo=" + titulo + ", Autor: " + autor + ", Preço: " + preco + "}\n";
	}

}

class OrdenaPorPreco implements Comparator<Map.Entry<String, Livro>> {
	@Override
	public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
		return Double.compare(livro1.getValue().getPreco(), livro2.getValue().getPreco());
	}
}
