package aula5;

public class Mercadoria {
	public String nome;
	public double preco;
	public int codigo;
	
	@Override
	public String toString() {
		return this.nome + " - " + this.preco;
	}
}
