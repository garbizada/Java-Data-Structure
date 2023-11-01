package polimofirsmo;

public class Pessoa {

	public void apresentarNome() {
		System.out.println("Caue");
	}
	
	
	public void apresentarNome(String sobreNome) {
		System.out.println("Caue " + sobreNome);
	}
	
	public void apresentarNome(String sobreNome, boolean tornaMaiusculo) {
		if(tornaMaiusculo) {
			System.out.println(("Caue " + sobreNome).toUpperCase());
		} else {
			apresentarNome(sobreNome);
		}
	}
	
}
