package edu.lucas.tema.poo.exercicios.calculadora;

import java.util.Scanner;

public class Main {
	private final static Scanner scanner = new Scanner(System.in);
	private final static OperacoesMatematicas operacoes = new OperacoesMatematicas();

	public static void main(String[] args) {		
		var option = -1;
		
		do {
			System.out.println("===Escolha uma das opções===");
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("0 - Sair");
			option = scanner.nextInt();
			
			switch (option) {
			case 1 -> somar();
			case 2 -> subtrair();
			case 3 -> multiplicar();
			case 4 -> dividir();
			case 0 -> System.exit(0);
			
			
			
			default -> System.out.println("Opção inválida");
			
			}
			
		} while (true);
		
		

	}

	private static void dividir() {
		System.out.println("Digite o primeiro número");
		int num1 = scanner.nextInt();
		System.out.println("Digite o segundo número");
		int num2 = scanner.nextInt();		
		System.out.println(num1 + " / " + num2 + " = " + operacoes.dividir(num1, num2));
	}

	private static void multiplicar() {
		System.out.println("Digite o primeiro número");
		int num1 = scanner.nextInt();
		System.out.println("Digite o segundo número");
		int num2 = scanner.nextInt();		
		System.out.printf("%d x %d = %d \n", num1, num2, operacoes.multiplicar(num1, num2));	
	}

	private static void subtrair() {
		System.out.println("Digite o primeiro número");
		int num1 = scanner.nextInt();
		System.out.println("Digite o segundo número");
		int num2 = scanner.nextInt();		
		System.out.printf("%d - %d = %d \n", num1, num2, operacoes.subtrair(num1, num2));	
	}

	private static void somar() {
		System.out.println("Digite o primeiro número");
		int num1 = scanner.nextInt();
		System.out.println("Digite o segundo número");
		int num2 = scanner.nextInt();		
		System.out.printf("%d + %d = %d \n", num1, num2, operacoes.somar(num1, num2));		
	}

}
