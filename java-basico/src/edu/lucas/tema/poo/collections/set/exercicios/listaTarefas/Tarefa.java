package edu.lucas.tema.poo.collections.set.exercicios.listaTarefas;

public class Tarefa {
	private String descricao;
	private boolean estadoTarefa = false;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;		
	}

	public boolean isEstadoTarefa() {
		return estadoTarefa;
	}

	public void setEstadoTarefa(boolean estadoTarefa) {
		this.estadoTarefa = estadoTarefa;
	}

	public String getDescricao() {
		return descricao;
	}	

	@Override
	public String toString() {
		return "Tarefa: " + "'"+ descricao + "'";
	}	
	
}
