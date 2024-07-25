/*TODO:Desafio 6 - Verificar se a lista contém algum número maior que 10:
Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.*/
package view;

import java.util.Arrays;
import java.util.List;

public class Main_Desafio_6 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		boolean validacao = numeros.stream().anyMatch(n -> n > 10);
		System.out.println(validacao ? "Existe pelo menos um número maior que 10":"Não existe nenhum número maior que 10");
	}
}
