package codigo_trabalho;

import java.util.LinkedList ;

public class lista_trabalho {
  public static void main(String[] args) {
    //Criando uma Lista de Strings
    LinkedList <String> lista = new LinkedList<>();

    //Adicionando os primeiros elementos na lista

    lista.add("Elemento 1");
    lista.add("Elemento 2");
    lista.add("Elemento 3");


    //Imprimindo a Lista 

    System.out.println("Lista: " + lista);


    //Adicionando um elemento no inicio da lista

    lista.addFirst("Elemento antes do 1");          // Peguei comandos no site https://www.w3schools.com/java/java_linkedlist.asp

    //Adicionando um elemento no final da lista

    lista.addLast("Elemento Final");


    //print da lista apos as adicoes

    System.out.println("Lista: " + lista);

    //removendo os elementos 

    lista.removeFirst();
    lista.removeLast();

    //print depois das remocoes

    System.out.println("lista: " + lista);


   

    










  }


}


