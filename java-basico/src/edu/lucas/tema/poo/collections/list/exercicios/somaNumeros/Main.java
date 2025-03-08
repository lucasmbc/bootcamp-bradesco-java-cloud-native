package edu.lucas.tema.poo.collections.list.exercicios.somaNumeros;

public class Main {

	public static void main(String[] args) {
		SomaNumeros numeros = new SomaNumeros();
		numeros.adicionarNumero(1);
		numeros.adicionarNumero(2);
		numeros.adicionarNumero(3);
		numeros.adicionarNumero(4);
		numeros.adicionarNumero(5);
		numeros.adicionarNumero(-6);
		
		System.out.println("Números adicionados:");
		numeros.exibirNumeros();
		
		System.out.println("A soma total dos números é: " + numeros.calcularSoma());
		
		System.out.println("O maior número da lista é : " + numeros.encontrarMaiorNumero());
		
		System.out.println("O menor número da lista é : " + numeros.encontrarMenorNumero());		

	}

}
