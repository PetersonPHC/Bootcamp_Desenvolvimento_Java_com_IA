/*TODO:Desafio 5 - Calcule a média dos números maiores que 5:
Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.*/
package view;

import java.util.Arrays;
import java.util.List;

public class Main_Desafio_5 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		long ctd = numeros.stream().filter(n -> n > 5).count();
		int soma = numeros.stream().filter(n -> n > 5).reduce(0, (n1, n2) -> Integer.sum(n1, n2));
		double media = soma / ctd;
		System.out.println(media);
	}
}
