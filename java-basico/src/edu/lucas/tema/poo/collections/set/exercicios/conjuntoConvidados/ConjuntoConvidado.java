package edu.lucas.tema.poo.collections.set.exercicios.conjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidado() {
		this.convidadoSet = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}

	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		if (!convidadoSet.isEmpty()) {
			for (Convidado c : convidadoSet) {
				if (c.getCodigoConvite() == codigoConvite) {
					convidadoParaRemover = c;
					break;
				}
			}
			convidadoSet.remove(convidadoParaRemover);
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}

	public int contarConvidados() {
		return convidadoSet.size();
	}

	public void exibirConvidados() {
		if (!convidadoSet.isEmpty()) {
			System.out.println(convidadoSet);
		} else {
			System.out.println("O conjunto está vazio!");
		}
	}
}
