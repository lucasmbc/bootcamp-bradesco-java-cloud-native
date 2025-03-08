package edu.lucas.tema.poo.collections.set.exercicios.listaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	private Set<Aluno> alunosSet;

	public GerenciadorAlunos() {
		this.alunosSet = new HashSet<>();
	}

	public void adicionarAluno(String nome, long matricula, double media) {
		alunosSet.add(new Aluno(nome, matricula, media));
	}

	public void removerAluno(long matricula) {
		if (!alunosSet.isEmpty()) {
			for (Aluno a : alunosSet) {
				if (a.getMatricula() == matricula) {
					alunosSet.remove(a);
					break;
				}
			}			
		}
	}

	public Set<Aluno> exibirAlunosPorNome() {
		Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
		if (!alunosSet.isEmpty()) {
			return alunosPorNome;
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}
	
	public Set<Aluno> exibirAlunosPorNota(){
		Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
		if (!alunosSet.isEmpty()) {
			alunosPorNota.addAll(alunosSet);
			return alunosPorNota;
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}
	
	public Set<Aluno> exibirAlunos(){
		return alunosSet;
	}
}
