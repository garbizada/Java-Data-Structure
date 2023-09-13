package studing;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		
		Revisao r1 = new Revisao();
		r1.nome = "Estrutura de dados";
		r1.codigo = 123;
		r1.quantidade = 20;
		
		Revisao r2 = new Revisao();
		r2.nome = "Banco de dados";
		r2.codigo = 456;
		r2.quantidade = 30;
		
		Revisao r3 = new Revisao();
		r3.nome = "Algebra linear";
		r3.codigo = 789;
		r3.quantidade = 40;
		
		Revisao r4 = new Revisao();
		r4.nome = "Sistemas Operacionais";
		r4.codigo = 101;
		r4.quantidade = 200;
		
		ArrayList<Revisao> segundoSemestre = 
				new ArrayList<>();
		
		segundoSemestre.add(r1);
		segundoSemestre.add(r2);
		segundoSemestre.add(r3);
		
		for(int i = 0; i < segundoSemestre.size(); i++) {
			if (segundoSemestre.get(i).quantidade >= 20) {
			System.out.println(segundoSemestre.get(i).toString());
		       }
		}
		
		System.out.println(segundoSemestre.get(1).nome);
						

		
				
				
			
				
	}
	
}
