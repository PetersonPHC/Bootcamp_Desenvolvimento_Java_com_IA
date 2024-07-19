package view;

import model.SomaNumeros;

public class Main {

	public static void main(String[] args) {
		SomaNumeros listaDeNumeros = new SomaNumeros();
		
		listaDeNumeros.adicionarNumero(5);
		listaDeNumeros.adicionarNumero(7);
		listaDeNumeros.adicionarNumero(3);
		listaDeNumeros.adicionarNumero(8);
		listaDeNumeros.adicionarNumero(10);
		listaDeNumeros.adicionarNumero(15);
		listaDeNumeros.adicionarNumero(9);
		
		
		System.out.println(listaDeNumeros.calcularSoma());

		System.out.println(listaDeNumeros.encontrarMaiorNumero());
		System.out.println(listaDeNumeros.encontrarMenorNumero());
		
		listaDeNumeros.exibirNumeros();

	}

}
