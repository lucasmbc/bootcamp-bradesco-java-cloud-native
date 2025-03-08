package edu.lucas.tema.poo.collections.set.exercicios.listaAlunos;

public class Main {

	public static void main(String[] args) {
		GerenciadorAlunos alunos = new GerenciadorAlunos();
		
		alunos.adicionarAluno("João", 123456L, 7.5);
		alunos.adicionarAluno("Maria", 123457L, 9.0);
		alunos.adicionarAluno("Carlos", 123458L, 5.0);
		alunos.adicionarAluno("Ana", 123459L, 8.8);
		alunos.adicionarAluno("Ana", 123459L, 6.8);
		
		System.out.println("Lista de alunos: \n" + alunos.exibirAlunos());
		
		alunos.removerAluno(000);
		alunos.removerAluno(123458);
		System.out.println("\nLista de alunos: \n" + alunos.exibirAlunos());
		
		System.out.println("\nAlunos ordenados por nome: \n" + alunos.exibirAlunosPorNome());
		System.out.println("\nAlunos ordenados por nota: \n" + alunos.exibirAlunosPorNota());
	}

}
