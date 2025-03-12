package edu.lucas.tema.poo.collections.map.exercicios.contagemPalavra;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavra {
	private Map<String, Integer> palavraMap;

	public ContagemPalavra() {
		this.palavraMap = new HashMap<>();
	}

	public void adicionarPalavra(String palavra, Integer contagem) {
		this.palavraMap.put(palavra, contagem);
	}

	public void removerPalavra(String palavra) {
		if (!palavraMap.isEmpty()) {
			palavraMap.remove(palavra);
		} else {
			System.out.println("O map está vazio.");
		}
	}

	public void exibirContagemPalavras() {
		if (!palavraMap.isEmpty()) {
			System.out.println(palavraMap);
		} else {
			System.out.println("O map está vazio.");
		}
	}

	public String encontrarPalavrasMaisFrequente() {
		String linguagemMaisFrequente = null;
		int maiorContagem = 0;
		for (Map.Entry<String, Integer> entry : palavraMap.entrySet()) {
			if (entry.getValue() > maiorContagem) {
				maiorContagem = entry.getValue();
				linguagemMaisFrequente = entry.getKey();
			}
		}
		return linguagemMaisFrequente;
	}

}
