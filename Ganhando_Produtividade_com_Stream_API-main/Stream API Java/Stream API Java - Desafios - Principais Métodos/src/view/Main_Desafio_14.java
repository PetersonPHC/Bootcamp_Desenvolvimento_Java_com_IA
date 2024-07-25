/*TODO:Desafio 14 - Encontre o maior número primo da lista:
Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.*/
package view;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main_Desafio_14 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		Optional<Integer> maiorPrimo = numeros.stream().filter(n -> Main_Desafio_14.isPrimo(n)).max((n1, n2) -> Integer.compare(n1, n2));

		System.out.println(maiorPrimo.isPresent()? maiorPrimo.get() : "Não existem números primos");
	}

	private static boolean isPrimo(int numero) {

		for(int ctd = 2; ctd <= Math.sqrt(numero); ctd++) {
			if(numero % ctd == 0) {
				return false;
			}
		}
		return true;
	}
}
