package herancaExemplo;

/**
 * @author Kátia Marina
 * 
 */

public class PessoaFisica extends Pessoa {

	public PessoaFisica(String nome, String dataNascimento, herancaExemplo.estadoOrigem estadoOrigem) {
		super(nome, dataNascimento, estadoOrigem);
	}

	private static String cpf;

	public static String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		PessoaFisica.cpf = cpf;
	}

	public String exibirCpfFormatado() {
		String cpfFormatado = cpf;
		cpfFormatado = cpfFormatado.substring(0, 3) + "." + cpfFormatado.substring(3, 6) + "."
				+ cpfFormatado.substring(6, 9) + "-" + cpfFormatado.substring(9, 10);
		return cpfFormatado;
	}
}
