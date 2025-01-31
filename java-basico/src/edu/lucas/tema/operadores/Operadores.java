package edu.lucas.tema.operadores;

public class Operadores {

	public static void main(String[] args) {
//		Concatenação
		 String nomeCompleto = "LINGUAGEM " + "JAVA";
		 
		 System.out.println(nomeCompleto);
		 
//		 Incremento e decremento
		 int numero = 5;
		 numero++;
		 System.out.println(numero);
		 
		 numero--;
		 System.out.println(numero);
		 
//		 Negação
		 boolean variavel = true;
		 variavel = !variavel;
		 System.out.println(variavel);
		 
//		 Operador ternário <Expressão Condicional> ? <Caso seja true> : <Caso seja false>
		 int a, b;
		 a = 6;
		 b = 6;
		 
		 String resultado = a == b ? "verdadeiro" : "falso";
		 		 
		 System.out.println(resultado);
		 
//		 Operadores lógicos
		 boolean condicao1 = true;
		 boolean condicao2 = false;
		 
		 if(condicao1 && condicao2) {
			 System.out.println("As duas condições são verdadeiras");			 
		 }
		 
		 if(condicao1 || condicao2) {
			 System.out.println("Uma das condições é verdadeira");
		 }

	}

}
