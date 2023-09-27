package esporte;

public class Principal extends Esporte{
	
	public static void main(String[] args) {
		
		Futebol f1 = new Futebol();
		f1.setQtd_atletas(22);
		f1.getQtd_atletas();
		f1.setQtd_tempos(2);
		f1.getQtd_tempos();
		f1.setCampeonatos("Champions League");
		f1.getCampeonatos();
		
		Volei v1 = new Volei();
		v1.setCampeonatos("Olimpiadas");
		v1.getCampeonatos();
		v1.setQtd_atletas(7);
		v1.getQtd_atletas();
		v1.setQtd_sets(5);
		v1.getQtd_sets();
		
		
		Formula_1 fr1 = new Formula_1();
		fr1.setCampeonatos("Interlagos");
		fr1.getCampeonatos();
		fr1.setMarca_carro("Ferrari");
		fr1.getMarca_carro();
		fr1.setQtd_atletas(1);
		fr1.getQtd_atletas();
		
		
		natacao n1 = new natacao();
		n1.setCampeonatos("Olimpiadas");
		n1.getCampeonatos();
		n1.setDistancia_prova(50);
		n1.getDistancia_prova();
		n1.setQtd_atletas(1);
		n1.getQtd_atletas();
		
		
		System.out.println("Natação - " + n1.toString());
		System.out.println("Formula 1 - " + fr1.toString());
		System.out.println("Vôlei - " + v1.toString());
		System.out.println("Futebol - " + f1.toString());


		
		
		
		
		
	}

}
