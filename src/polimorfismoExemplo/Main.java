package polimorfismoExemplo;

/**
 * @author Kátia Marina
 * 
 */

public class Main {

	public void fazerSom(Animal animal) {
		animal.barulho();
	}

	public static void main(String[] args) {
		Main teste = new Main();
		teste.fazerSom(new Animal());
		teste.fazerSom(new Cachorro());
		teste.fazerSom(new Galinha());
	}

}
