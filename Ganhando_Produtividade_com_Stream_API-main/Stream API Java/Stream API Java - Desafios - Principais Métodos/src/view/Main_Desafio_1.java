/*TODO:Desafio 1 - Mostre a lista na ordem numérica:
Crie um programa que utilize a Stream API para ordenar 
lista de números em ordem crescente e a exiba no console.*/

package view;

import java.util.Arrays;
import java.util.List;

public class Main_Desafio_1 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		numeros.stream().sorted().forEach(n -> System.out.print(n + " "));
	}

}
