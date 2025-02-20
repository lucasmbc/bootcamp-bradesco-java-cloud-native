package edu.lucas.tema.poo.exercicios.cinema;

public class IngressoFamilia extends Ingresso {
	private int qtdPessoas;	

	public int getqtdPessoas() {
		return qtdPessoas;
	}

	public void setqtdPessoas(int pessoas) {
		this.qtdPessoas = pessoas;
	}
	
	@Override
	double valorIngresso(double valor) {
		if (this.qtdPessoas > 3) {
			return valor * this.qtdPessoas * 0.95;
		}
		
		return valor * this.qtdPessoas;
	}
}
