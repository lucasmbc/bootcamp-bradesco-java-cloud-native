package edu.lucas.tema.poo.collections.set.exercicios.cadastroProdutos;

public class Main {

	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		// Adicionando produtos ao cadastro
	    cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
	    cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
	    cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
	    cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);
	    
	    // Exibindo todos os produtos no cadastro
	    System.out.println(cadastroProdutos.getProdutoSet());

	    // Exibindo produtos ordenados por nome
	    System.out.println("\nProdutos ordenados por nome: " + cadastroProdutos.exibirProdutosPorNome());

	    // Exibindo produtos ordenados por preço
	    System.out.println("\nProdutos ordenados por preço: " +cadastroProdutos.exibirProdutosPorPreco());
	}

}
