package edu.lucas.tema.poo.exercicios.petshop;

public class Pet {
	private final String name;
	private boolean clean;
	
//	Construtor
	public Pet(String name) {
		this.name = name;
		this.clean = false;
	}

	public boolean isClean() {
		return clean;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}

	public String getName() {
		return name;
	}
	
	
}
