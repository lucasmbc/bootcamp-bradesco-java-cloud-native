package edu.lucas.tema.poo.collections.list.exercicios.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> numeros;

	public SomaNumeros() {
		this.numeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		this.numeros.add(numero);
	}
	
	public int calcularSoma() {
		int total = 0;
		if(!numeros.isEmpty()) {
			for(Integer n : numeros) {
				total += n;
			}			
		}
		return total;
	}
	
	public int encontrarMaiorNumero() {		
		int maiorNumero = Integer.MIN_VALUE;
		if(!numeros.isEmpty()) {
			for(Integer numero : numeros) {
				if(numero >= maiorNumero) {
					maiorNumero = numero;
				}
			}
			return maiorNumero;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public int encontrarMenorNumero() {		
		int menorNumero = Integer.MAX_VALUE;
		if(!numeros.isEmpty()) {
			for(Integer n : numeros) {
				if(n <= menorNumero) {
					menorNumero = n;
				}
			}
			return menorNumero;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public void exibirNumeros(){
		if(!numeros.isEmpty()) {
			System.out.println(this.numeros);
		} else {
			System.out.println("A lista está vazia!");
		}
	}
}
