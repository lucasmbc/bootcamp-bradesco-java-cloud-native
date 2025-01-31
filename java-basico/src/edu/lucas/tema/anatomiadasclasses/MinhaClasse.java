package edu.lucas.tema.anatomiadasclasses;

public class MinhaClasse {

	public static void main(String [] args) {
        String meuNome = "Lucas";
        String segundoNome = "Carvalho";
        int anoFabricacao = 2025;
        boolean verdadeira = true;

        String nomeCompleto = nomeCompleto(meuNome, segundoNome);

        System.out.print("Olá turma, sejam bem-vindos! ");
        System.out.println(nomeCompleto);
	}

	public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
	}

}
