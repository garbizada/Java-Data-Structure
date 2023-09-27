package esporte;

public class Esporte {
	
	private int qtd_atletas;

	public int getQtd_atletas() {
		return qtd_atletas;
	}

	public void setQtd_atletas(int qtd_atletas) {
		this.qtd_atletas = qtd_atletas;
	}
	
	private String campeonatos;
	
	public String getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(String campeonatos) {
		this.campeonatos = campeonatos;
	}
	
	public String toString() {
		return + + this.qtd_atletas + " - " + this.campeonatos;
	}


	
	

}
