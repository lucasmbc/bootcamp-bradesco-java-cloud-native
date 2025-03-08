package edu.lucas.tema.poo.collections.set.exercicios.palavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	private Set<String> palavrasUnicas;

	public ConjuntoPalavrasUnicas() {
		this.palavrasUnicas = new HashSet<>();
	}

	public void adicionarPalavra(String palavra) {
		palavrasUnicas.add(palavra);
	}

	public void removerPalavra(String palavra) {
		if (!palavrasUnicas.isEmpty()) {
			if (palavrasUnicas.contains(palavra)) {
				palavrasUnicas.remove(palavra);
			} else {
				System.out.println("Palavra não encontrada no conjunto!");
			}
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}

	public void verificarPalavra(String palavra) {
		if (!palavrasUnicas.isEmpty()) {
			if (palavrasUnicas.contains(palavra)) {
				System.out.println("A palavra: " + palavra + " está no set.");
			} else {
				System.out.println("A palavra: " + palavra + " não está no set.");
			}
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}

	public void exibirPalavrasUnicas() {
		if (!palavrasUnicas.isEmpty()) {
			System.out.println(palavrasUnicas);
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}
}
