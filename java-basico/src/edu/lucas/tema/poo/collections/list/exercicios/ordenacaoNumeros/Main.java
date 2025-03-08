package edu.lucas.tema.poo.collections.list.exercicios.ordenacaoNumeros;

public class Main {

	public static void main(String[] args) {
		OrdenacaoNumeros numeros = new OrdenacaoNumeros();
		numeros.adicionarNumero(350);
		numeros.adicionarNumero(225);
		numeros.adicionarNumero(999);
		numeros.adicionarNumero(200);
		numeros.adicionarNumero(101);
		
		numeros.exibirNumeros();
		
		System.out.println("Lista ascendente: " + numeros.ordenarAscendente());
		System.out.println("Lista descendente: " + numeros.ordenarDescendente());

	}

}
