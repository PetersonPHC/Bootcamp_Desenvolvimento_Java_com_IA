package view;

import model.CarrinhoDeCompras;

public class Main {

	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem("Laptop", 3500.99, 5);
		carrinho.adicionarItem("Mouse Bluetooth", 149.99, 3);
		carrinho.adicionarItem("Teclado Gamer", 400, 3);
		
		System.out.println("\nPrimeira Compra");
		System.out.println("O Valor da Compra é: " + carrinho.calcularValorTotal());
		
		carrinho.adicionarItem("Laptop", 2000.99, 5);
		
		System.out.println("\nSegunda Compra");
		System.out.println("O Valor da Compra é: " + carrinho.calcularValorTotal());
		
		System.out.println();
		carrinho.exibirItens();
		
		System.out.println();
		carrinho.removerItem("Laptop");
		
		System.out.println();
		carrinho.exibirItens();
	}

}
