package aula10;

public class Principal {
	
	public static void main(String[] args) {
		PF pf1 = new PF();
		pf1.idade = 40;
		pf1.setCpf("94578389-06");
		pf1.setNome("Caue");
		pf1.data = "05/03/1983";
		
		PJ pj1 = new PJ();
		pj1.cnpj = "020.039.000/00";
		pj1.setNome("Wizard");
		pj1.idade = 50;
		pj1.data = "01/01/1973";
		
		
		System.out.println(pf1.getNome());
		System.out.println(pj1.getNome());

	}

}
