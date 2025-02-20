package edu.lucas.tema.poo.heranca;

public abstract class Veiculo {
	private String chassi;
	
	public String getChassi() {
		return chassi;
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
//	Um método abstrato, obriga as classes a implementarem esse método
	public abstract void ligar();
}
