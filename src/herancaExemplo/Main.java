package herancaExemplo;

/**
 * @author Kátia Marina
 * 
 */

public class Main {

	public static void main(String[] args) {

		PessoaFisica pf1 = new PessoaFisica("João da Silva", "10/10/1975", estadoOrigem.PE);
		pf1.setCpf("1077752321");

		System.out.println(pf1.nome);
		System.out.println(pf1.dataNascimento);
		System.out.println(pf1.estadoOrigem);
		System.out.println(pf1.exibirCpfFormatado());

		System.out.println("\n");

		PessoaJuridica pj1 = new PessoaJuridica("Cyber Corporation", "10/03/1993", estadoOrigem.PR);		
		pj1.setCnpj("18256335100223");

		System.out.println(pj1.nome);
		System.out.println(pj1.dataNascimento);
		System.out.println(pj1.estadoOrigem);
		System.out.println(pj1.exibirCnpjFormatado());

		System.out.println("\n");

	}

}
