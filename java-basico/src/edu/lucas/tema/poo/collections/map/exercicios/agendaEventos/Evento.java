package edu.lucas.tema.poo.collections.map.exercicios.agendaEventos;

public class Evento {
	private String nome;
	private String atracao;
	
	public Evento(String evento, String atracao) {
		this.nome = evento;
		this.atracao = atracao;
	}

	public String getNome() {
		return nome;
	}

	public String getAtracao() {
		return atracao;
	}

	@Override
	public String toString() {
		return "Evento [nome='" + nome + "', atracao=" + atracao + "]";
	}	
	
}
