package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	private List<Integer> listaDeNumeros;

	public OrdenacaoNumeros() {
		this.listaDeNumeros = new ArrayList<>();
	}

	public void adicionarNumero(int numero) {
		listaDeNumeros.add(numero);
		System.out.println("Número: " + numero + " adicionado a lista.");
	}

	public List<Integer> ordenarAscendente() {
		List<Integer> listaOrdenacaoAscendente = new ArrayList<>(listaDeNumeros);
		Collections.sort(listaOrdenacaoAscendente);
		return listaOrdenacaoAscendente;
	}

	public List<Integer> ordenarDescendente() {
		List<Integer> listaOrdenacaoDescendente = new ArrayList<>(listaDeNumeros);
		listaOrdenacaoDescendente.sort(Collections.reverseOrder());
		return listaOrdenacaoDescendente;
	}

}
