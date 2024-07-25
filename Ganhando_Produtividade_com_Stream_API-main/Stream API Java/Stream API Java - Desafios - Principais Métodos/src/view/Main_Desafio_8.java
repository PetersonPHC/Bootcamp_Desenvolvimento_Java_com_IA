/*TODO:Desafio 8 - Somar os dígitos de todos os números da lista:
Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.*/
package view;

import java.util.Arrays;
import java.util.List;

public class Main_Desafio_8 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		long somaDosDigitos = numeros.stream()
	            .map(n -> n.toString().split(""))  // Transforma cada número em uma string e quebra em dígitos
	            .flatMap(array -> Arrays.stream(array))  // Achata o stream de arrays de strings em um único stream de strings
	            .mapToInt(Integer::parseInt)  // Converte cada string para inteiro
	            .sum();  

	        System.out.println("A soma dos dígitos de todos os números da lista é: " + somaDosDigitos);
	    }
}
