package exemplo_lista;

import java.util.ArrayList;

public class Figura {
	public static void main(String[] args) {
		Figura f1 = new Figura();
		f1.nome = "Quadrado";
		f1.nrlados = "4";
		f1.tipo = "Quadrilatero";
		
		Figura f2 = new Figura();
		f2.nome = "Triangulo";
		f2.nrlados = "3";
		f2.tipo = "Equilatero";
		
		Figura f3 = new Figura();
		f3.nome = "Retãngulo";
		f3.nrlados = "4";
		f3.tipo = "Equivalente";
		
		Figura f4 = new Figura();
		f4.nome = "Hexagono";
		f4.nrlados = "6";
		f4.tipo = "congruente";
		
		ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
		
		listaFiguras.add(f1);
		listaFiguras.add(f2);
		listaFiguras.add(f3);
		listaFiguras.add(f4);
		
		System.out.println("O nome das figuras é: " + listaFiguras.get());
		
		System.out.println("O número de lados das figuras é : " + listaFiguras.get().nrlados);
		
	}

}
