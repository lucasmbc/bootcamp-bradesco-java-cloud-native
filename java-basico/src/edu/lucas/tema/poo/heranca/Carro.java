package edu.lucas.tema.poo.heranca;

// Herança
public class Carro extends Veiculo {
		
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("CARRO LIGADO");
	}

	private void confereCombustivel() {
		System.out.println("conferindo combustível");		
	}

	private void confereCambio() {
		System.out.println("conferindo cambio");		
	}
}
