/*TODO: Desafio 4 - Remova todos os valores ímpares:
Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.*/
package view;

import java.util.Arrays;
import java.util.List;

public class Main_Desafio_4 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();
		
		numerosPares.forEach(System.out::println);

	}

}
