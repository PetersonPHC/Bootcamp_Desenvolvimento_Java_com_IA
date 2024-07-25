/*TODO:Desafio 17 - Filtrar os números primos da lista:
Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.*/
package view;

import java.util.Arrays;
import java.util.List;

public class Main_Desafio_17 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		numeros.stream().filter(n -> Main_Desafio_17.isPrimo(n)).distinct().forEach(System.out::println);
	}

	private static boolean isPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int ctd = 2; ctd <= Math.sqrt(numero); ctd++) {
			if (numero % ctd == 0) {
				return false;
			}
		}
		return true;
	}
}
