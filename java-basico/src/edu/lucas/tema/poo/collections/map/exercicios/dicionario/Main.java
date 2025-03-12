package edu.lucas.tema.poo.collections.map.exercicios.dicionario;

public class Main {

	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();
		
		System.out.println("Adicionando e exibindo as palavras do dicionário:");
		dicionario.adicionarPalavra("Correr", "Ato de se movimentar rápido");
		dicionario.adicionarPalavra("Caminhar", "Ato de se movimentar normalmente");		
		dicionario.exibirPalavras();
		
		String palavraParaRemover = "Caminhar";
		System.out.println("\nRemovendo a palavra: " + palavraParaRemover);
		dicionario.removerPalavra("Caminhar");
		dicionario.exibirPalavras();		
		
		String palavraParaPesquisar = "Correr";
		System.out.println("\n" + palavraParaPesquisar + " significa: " + dicionario.pesquisarPorPalavra(palavraParaPesquisar));
	}

}
