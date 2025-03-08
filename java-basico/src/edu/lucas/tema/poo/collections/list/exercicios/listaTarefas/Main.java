package edu.lucas.tema.poo.collections.list.exercicios.listaTarefas;

public class Main {

	public static void main(String[] args) {
		 ListaTarefa listaTarefa = new ListaTarefa();
		 
		 System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		 
		 listaTarefa.adicionarTarefa("Tarefa 1");
		 listaTarefa.adicionarTarefa("Tarefa 2");
		 listaTarefa.removerTarefa("Tarefa 2");
		 listaTarefa.obterDescricoesTarefas();
		 
		 System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

	}

}
