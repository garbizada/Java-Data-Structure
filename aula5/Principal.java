package aula5;
import java.util.Scanner;
import javax.swing.JOptionPane;





public class Principal {

	public static void main(String[] args) {
		
//		Mercadoria m1 = new Mercadoria();
//		m1.nome = "Televisão";
//		m1.codigo = 123;
//		m1.preco = 1000.50;
		
//		Scanner in = new Scanner(System.in);
//		Mercadoria m2 = new Mercadoria();
//		
//		System.out.println("Informe o nome do produto: ");
//		m2.nome = in.next();
//		System.out.println("Informe o código do produto: ");
//		m2.codigo = in.nextInt();
//		System.out.println("Informe o preço do produto: ");
//		m2.preco = in.nextDouble();
//		
//		System.out.println(m2.nome);
//		System.out.println(m2.codigo);
//		System.out.println(m2.preco);
		
		Mercadoria m3 = new Mercadoria();
		m3.nome = JOptionPane.showInputDialog("Informe o nome:");		//JOptionPane.showInputDialog == PARA STRING //
		m3.codigo = Integer.valueOf(JOptionPane.showInputDialog("Informe o código:"));			
								//Integer.valueOf(JOptionPane.showInputDialog("Informe o código:")); == PARA INT//
		m3.preco = Double.valueOf(JOptionPane.showInputDialog("Informe o preço:"));
		//Double.valuoOf para double//
		
		JOptionPane.showMessageDialog(null, m3.toString());
		
		System.out.println(m3.nome);
		System.out.println(m3.codigo);
		System.out.println(m3.preco);
		
		
	}
	
}
