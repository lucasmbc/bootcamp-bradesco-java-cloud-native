package edu.lucas.tema.poo.exercicios.cinema;

public abstract class Ingresso {
	private double valor;
	private String nomeFilme;
	private boolean dubladoLegendado;
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getNomeFilme() {
		return nomeFilme;
	}
	
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	
	public String isDubladoLegendado() {
		if (dubladoLegendado) {
			return "Dublado";
		}
		return "Legendado";
	}
	
	public void setDubladoLegendado(boolean dubladoLegendado) {
		this.dubladoLegendado = dubladoLegendado;
	}
	
	abstract double valorIngresso(double valor);
	
}
