package encapsulamentoExemplo;

/**
 * @author K�tia Marina
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
			return "O n�mero � primo.";
		} else if (getNumero() % 2 == 0 || getNumero() % 3 == 0 || getNumero() % 5 == 0 || getNumero() % 7 == 0) {
			return "O n�mero n�o � primo.";
		} else {
			return "O n�mero � primo.";
		}
	}

	private static void recebeInteiro() {
		in = new Scanner(System.in);
		System.out.println("\t� primo?\nDigite um n�mero inteiro: ");
		setNumero(in.nextInt());
		System.out.println(ehPrimo());
		System.out.println("Testar outro n�mero?\t(Sim=1; N�o=0)");
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

			System.out.println("\nHey, era s� 0 ou 1! Muito rulebreaker voc� u.u\nVai voltar pro come�o.\n");
			recebeInteiro();
			break;
		}

	}

	public static void main(String[] args) {

		recebeInteiro();

	}

}
