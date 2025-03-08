package edu.lucas.tema.poo.collections.set.exercicios.palavrasUnicas;

public class Main {

	public static void main(String[] args) {
		ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();
		
		palavrasUnicas.adicionarPalavra("Teste1");
		palavrasUnicas.adicionarPalavra("Teste2");
		palavrasUnicas.adicionarPalavra("Teste3");
		palavrasUnicas.adicionarPalavra("Teste4");
		
		palavrasUnicas.exibirPalavrasUnicas();
		
		palavrasUnicas.removerPalavra("Teste4");
		
		palavrasUnicas.exibirPalavrasUnicas();
		
		palavrasUnicas.verificarPalavra("Teste3");
	}

}
