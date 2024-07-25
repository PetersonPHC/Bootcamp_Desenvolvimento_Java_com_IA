/*Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.*/
package view;

import java.util.Arrays;
import java.util.List;

public class Main_Desafio_15 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		boolean validacao = numeros.stream().anyMatch(n -> n < 0);
		System.out.println(validacao ? "Existe pelo menos número negativo na lista" : "Não existe número negativo na lista");
	}

}
