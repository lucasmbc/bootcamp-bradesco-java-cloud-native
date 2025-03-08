package edu.lucas.tema.poo.collections.list.exercicios.ordenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	private List<Integer> numeros;

	public OrdenacaoNumeros() {
		this.numeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		this.numeros.add(numero);
	}
	
	public List<Integer> ordenarAscendente() {
		List<Integer> numerosOrdemAscendente = new ArrayList<>(numeros);
		if(!numeros.isEmpty()) {
			Collections.sort(numerosOrdemAscendente);			
			return numerosOrdemAscendente;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public List<Integer> ordenarDescendente() {
	    List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
	    if (!numeros.isEmpty()) {
	      numerosAscendente.sort(Collections.reverseOrder());
	      return numerosAscendente;
	    } else {
	      throw new RuntimeException("A lista está vazia!");
	    }
	  }
	
	public void exibirNumeros() {
	    if (!numeros.isEmpty()) {
	      System.out.println(this.numeros);
	    } else {
	      System.out.println("A lista está vazia!");
	    }
	  }
}
