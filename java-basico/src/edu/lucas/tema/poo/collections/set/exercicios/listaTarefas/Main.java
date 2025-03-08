package edu.lucas.tema.poo.collections.set.exercicios.listaTarefas;

public class Main {

	public static void main(String[] args) {
		ListaTarefas tarefas = new ListaTarefas();
		
		tarefas.adicionarTarefa("Estudar");
		tarefas.adicionarTarefa("Jogar bola");
		tarefas.adicionarTarefa("Andar de bicicleta");
		tarefas.adicionarTarefa("Correr");
		
		tarefas.exibirTarefas();
		System.out.println("\nTotal de tarefas: " + tarefas.contarTarefas());
		
		tarefas.marcarTarefaConcluida("Estudar");
		tarefas.marcarTarefaConcluida("Correr");
//		tarefas.marcarTarefaPendente("estudar");
		
		System.out.println("\nConcluídas: " + tarefas.obterTarefasConcluidas());
		
		System.out.println("\nPendentes: " + tarefas.obterTarefasPendentes());
		
		tarefas.limparListaTarefas();
		tarefas.exibirTarefas();
	}

}
