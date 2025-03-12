package edu.lucas.tema.poo.collections.map.exercicios.contagemPalavra;

public class Main {

	public static void main(String[] args) {
		ContagemPalavra palavra = new ContagemPalavra();
		
		palavra.exibirContagemPalavras();
		
		palavra.adicionarPalavra("Mais", 2);
		palavra.adicionarPalavra("Menos", 4);
		palavra.adicionarPalavra("sim", 12);
		palavra.adicionarPalavra("não", 1);
		palavra.adicionarPalavra("sei", 6);
		
		palavra.exibirContagemPalavras();
		
		palavra.removerPalavra("sei");
		palavra.exibirContagemPalavras();
		
		System.out.println("\nA palavra mais frequente é: " + palavra.encontrarPalavrasMaisFrequente());

	}

}
