/*TODO:Desafio 3 - Verifique se todos os números da lista são positivos:
Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.*/
package view;

import java.util.Arrays;
import java.util.List;

public class Main_Desafio_3 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		boolean validacao = numeros.stream().anyMatch(n -> n < 0);
		System.out.println(!validacao ? "Todos os numeros são positivos" : "Nem todos os números são positivos");
	}

}
