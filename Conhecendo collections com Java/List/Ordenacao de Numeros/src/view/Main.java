package view;

import model.OrdenacaoNumeros;

public class Main {

	public static void main(String[] args) {
		OrdenacaoNumeros ordenaNumeros = new OrdenacaoNumeros();

		ordenaNumeros.adicionarNumero(5);
		ordenaNumeros.adicionarNumero(15);
		ordenaNumeros.adicionarNumero(9);
		ordenaNumeros.adicionarNumero(12);
		ordenaNumeros.adicionarNumero(3);
		ordenaNumeros.adicionarNumero(1);
		ordenaNumeros.adicionarNumero(2);
		ordenaNumeros.adicionarNumero(7);

		System.out.println("Lista Ordenada em Ordem Ascendente");
		System.out.println(ordenaNumeros.ordenarAscendente());

		System.out.println();

		System.out.println("Lista Ordenada em Ordem Descendente");
		System.out.println(ordenaNumeros.ordenarDescendente());

	}

}
