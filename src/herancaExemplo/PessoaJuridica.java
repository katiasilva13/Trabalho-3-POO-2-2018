package herancaExemplo;

/**
 * @author Kátia Marina
 * 
 */

public class PessoaJuridica extends Pessoa {

	private static String dataCriacao;

	public static String getDataCriacao() {
		return dataCriacao;
	}

	public static String setDataCriacao(String dataCriacao) {
		return PessoaJuridica.dataCriacao = dataCriacao;
	}

	public PessoaJuridica(String nome, String dataNascimento, herancaExemplo.estadoOrigem estadoOrigem) {

		super(nome, setDataCriacao(dataNascimento), estadoOrigem);
		dataNascimento = dataCriacao;

	}

	private String cnpj;

	public String exibirCnpjFormatado() {
		String cnpjFormatado = cnpj.toString();
		cnpjFormatado = cnpjFormatado.substring(0, 2) + "." + cnpjFormatado.substring(2, 5) + "."
				+ cnpjFormatado.substring(5, 8) + "/" + cnpjFormatado.substring(8, 12) + "-"
				+ cnpjFormatado.substring(12, 13);
		return cnpjFormatado;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String string) {
		this.cnpj = string;
	}


}
