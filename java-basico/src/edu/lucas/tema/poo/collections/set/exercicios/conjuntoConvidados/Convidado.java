package edu.lucas.tema.poo.collections.set.exercicios.conjuntoConvidados;

import java.util.Objects;

public class Convidado {
	private String nome;
	private int codigoConvite;
	
	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigoConvite() {
		return codigoConvite;
	}	

	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Convidado))
			return false;
		Convidado other = (Convidado) obj;
		return codigoConvite == other.codigoConvite;
	}

	@Override
	public String toString() {
		return "\nConvidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "\n]";
	}	
	
}
