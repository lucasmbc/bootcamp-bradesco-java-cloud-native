package edu.lucas.tema.poo.collections.list.exercicios.carrinhoCompras;

public class Main {

	public static void main(String[] args) {
		CarrinhoCompras carrinho = new CarrinhoCompras();
		
		carrinho.adicionarItem("Lápis", 2, 3);
		carrinho.adicionarItem("Lápis", 2, 3);
		carrinho.adicionarItem("Caderno", 35, 1);
		carrinho.adicionarItem("Borracha", 2, 2);
		
		carrinho.exibirItens();
		
		carrinho.removerItem("Lápis");
		
		carrinho.exibirItens();
		
		System.out.println("O valor total da compra é: R$ " + carrinho.calcularValorTotal());
	}

}
