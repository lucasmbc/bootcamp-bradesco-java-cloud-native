package edu.lucas.tema.poo.exercicios.cinema;

public class Main {

	public static void main(String[] args) {
		MeiaEntrada meiaIngresso = new MeiaEntrada();

		meiaIngresso.setValor(24);
		meiaIngresso.setNomeFilme("Pou Assassino");
		meiaIngresso.setDubladoLegendado(true);

		System.out.println("MEIA ENTRADA\nValor da entrada: R$ " + meiaIngresso.valorIngresso(meiaIngresso.getValor())
				+ "\nNome do filme: " + meiaIngresso.getNomeFilme() + "\nDublado ou legendado: "
				+ meiaIngresso.isDubladoLegendado());

		IngressoFamilia familiaIngresso = new IngressoFamilia();
		familiaIngresso.setValor(10);
		familiaIngresso.setqtdPessoas(4);
		familiaIngresso.setNomeFilme("A procura de um milagre");
		familiaIngresso.setDubladoLegendado(true);
		
		System.out.println("\n\nINGRESSO FAMÍLIA\nValor da entrada: R$ " + familiaIngresso.valorIngresso(familiaIngresso.getValor())
		+ "\nNome do filme: " + familiaIngresso.getNomeFilme() + "\nDublado ou legendado: "
		+ meiaIngresso.isDubladoLegendado());
	}

}
