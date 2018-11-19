package herancaExemplo;

/**
 * @author Kátia Marina
 * 
 */

public class Pessoa {

	public Pessoa(String nome, String dataNascimento, herancaExemplo.estadoOrigem estadoOrigem) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.estadoOrigem = estadoOrigem;
	}

	protected String nome;
	protected String dataNascimento;
	protected int idade;
	protected estadoOrigem estadoOrigem;

}