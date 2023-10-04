package aula2;

import java.util.ArrayList; 

public class Principal {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Francisco Molina";
		p1.ra = "1234567";
		p1.idade = 40;
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Joâo";
		
		
		ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		System.out.println ("O tamanho da lista é : " + listaPessoas.size());
		
		listaPessoas.add(p1);
		listaPessoas.add(p2);
		
		System.out.println("O tamanho da lista é: " + listaPessoas.size() );
	}

}
