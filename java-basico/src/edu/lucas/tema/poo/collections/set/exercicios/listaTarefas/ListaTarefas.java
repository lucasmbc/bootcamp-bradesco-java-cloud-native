package edu.lucas.tema.poo.collections.set.exercicios.listaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	private Set<Tarefa> tarefasSet;

	public ListaTarefas() {
		this.tarefasSet = new HashSet<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefasSet.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		if (!tarefasSet.isEmpty()) {
			for (Tarefa t : tarefasSet) {
				if (t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaParaRemover = t;
					break;
				}
			}
			tarefasSet.remove(tarefaParaRemover);
		} else {
			System.out.println("O conjunto está vazio!");
		}

		if (tarefaParaRemover == null) {
			System.out.println("Tarefa não encontrada!");
		}
	}

	public void exibirTarefas() {
		if (!tarefasSet.isEmpty()) {
			System.out.println("Lista de tarefas: " + tarefasSet);
		} else {
			System.out.println("Tarefa não encontrada!");
		}
	}

	public int contarTarefas() {
		return tarefasSet.size();
	}

	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		if (!tarefasSet.isEmpty()) {
			for (Tarefa t : tarefasSet) {
				if (t.isEstadoTarefa()) {
					tarefasConcluidas.add(t);
				}
			}

		} else {
			System.out.println("O conjunto está vazio!");
		}
		return tarefasConcluidas;
	}

	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		if (!tarefasSet.isEmpty()) {
			for (Tarefa t : tarefasSet) {
				if (!t.isEstadoTarefa()) {
					tarefasPendentes.add(t);
				}
			}

		} else {
			System.out.println("O conjunto está vazio!");
		}
		return tarefasPendentes;
	}

	public void marcarTarefaConcluida(String descricao) {
		for (Tarefa t : tarefasSet) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setEstadoTarefa(true);
			}
		}
	}

	public void marcarTarefaPendente(String descricao) {
		Tarefa tarefaPendente = null;
		if (!tarefasSet.isEmpty()) {
			for (Tarefa t : tarefasSet) {
				if (t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setEstadoTarefa(false);
					tarefaPendente = t;
					break;
				}
			}
			tarefasSet.remove(tarefaPendente);
			tarefasSet.add(tarefaPendente);
		}
	}

	public void limparListaTarefas() {
		if (tarefasSet.isEmpty()) {
			System.out.println("A lista já está vazia!");
		} else {
			tarefasSet.clear();
		}
	}
}
