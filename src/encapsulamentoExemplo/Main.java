package encapsulamentoExemplo;

/**
 * @author Kátia Marina
 *
 */

import java.util.Scanner;

public class Main {

	private static Scanner in;
	private static int numero;

	public static String ehPrimo() {
		if ((numero == 1) || (numero == 2) || (numero == 3) || (numero == 5) || (numero == 7)) {
			return "O número é primo.";
		} else if (numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 || numero % 7 == 0) {
			return "O número não é primo.";
		} else {
			return "O número é primo.";
		}
	}

	private static void recebeInteiro() {
		in = new Scanner(System.in);
		System.out.println("\tÉ primo?\nDigite um número inteiro: ");
		numero = in.nextInt();
		System.out.println(ehPrimo());
		System.out.println("Testar outro número?\t(Sim=1; não=0)");
		numero = in.nextInt();

		switch (numero) {
		case 0: 
			System.out.println("\nOkay, tenha um bom dia/tarde/noite!");
			in.close();
			break;
		case 1:
			recebeInteiro();
			break;
		default:
			
			System.out.println("\nHey, era só 0 ou 1! Muito rulebreaker você u.u\nVai voltar pro começo.\n");
			recebeInteiro();
			break;
		}

	}

	public static void main(String[] args) {

		recebeInteiro();

	}

}
