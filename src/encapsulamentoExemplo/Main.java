package encapsulamentoExemplo;

/**
 * @author Kátia Marina
 *
 */

import java.util.Scanner;

public class Main {

	private static Scanner in;
	private static int numero;

	public static int getNumero() {
		return numero;
	}

	public static void setNumero(int numero) {
		Main.numero = numero;
	}

	public static String ehPrimo() {

		if ((getNumero() == 1) || (getNumero() == 2) || (getNumero() == 3) || (getNumero() == 5)
				|| (getNumero() == 7)) {
			return "O número é primo.";
		} else if (getNumero() % 2 == 0 || getNumero() % 3 == 0 || getNumero() % 5 == 0 || getNumero() % 7 == 0) {
			return "O número não é primo.";
		} else {
			return "O número é primo.";
		}
	}

	private static void recebeInteiro() {
		in = new Scanner(System.in);
		System.out.println("\tÉ primo?\nDigite um número inteiro: ");
		setNumero(in.nextInt());
		System.out.println(ehPrimo());
		System.out.println("Testar outro número?\t(Sim=1; Não=0)");
		setNumero(in.nextInt());

		switch (getNumero()) {
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
