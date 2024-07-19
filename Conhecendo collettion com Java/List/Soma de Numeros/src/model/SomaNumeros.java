package model;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	
	private List<Integer> listaDeNumeros;

	public SomaNumeros() {
		this.listaDeNumeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		listaDeNumeros.add(numero);
		System.out.println("Número: " + numero + " adicionado a lista.");
	}
	
	public int calcularSoma() throws NullPointerException {
		int soma = 0;
		if(listaDeNumeros.isEmpty()) {
			throw new NullPointerException("A lista está vazia!");
		}else {
			for(int numero : listaDeNumeros) {
				soma += numero;
			}
			return soma;
		}
		
	}

	public int encontrarMaiorNumero() throws NullPointerException {
		if(listaDeNumeros.isEmpty()) {
			throw new NullPointerException("A lista está vazia!");
		}else {
			Integer maiorNumero = Integer.MIN_VALUE;
			for(int numero : listaDeNumeros) {
				if(numero >= maiorNumero) {
					maiorNumero = numero;
				}
			}
			return maiorNumero;
		}
	}
	
	public int encontrarMenorNumero() throws NullPointerException {
		if(listaDeNumeros.isEmpty()) {
			throw new NullPointerException("A lista está vazia!");
		}else {
			Integer menorNumero = Integer.MAX_VALUE;
			for(int numero : listaDeNumeros) {
				if(numero <= menorNumero) {
					menorNumero = numero;
				}
			}
			return menorNumero;
		}
	}
	
	public void exibirNumeros() {
		for(int numero : listaDeNumeros) {
			System.out.print(numero + "; ");
		}
	}
}
