package lista_trabalho;

import java.util.LinkedList;

public class lista_trabalho {
  public static void main(String[] args) {
    // Criando uma Lista de Strings
    LinkedList<String> lista = new LinkedList<>();

    // Adicionando os primeiros elementos na lista

    lista.add("Elemento 1");
    lista.add("Elemento 2");
    lista.add("Elemento 3"); //esses metodos sao equivalentes ao metodo addLast
    lista.add(2, "Elemento 2.2"); // lado ruim das linkedlist e que se eu quiser adicionar um elemento em uma
                                  // determinada posicao terei que fazer diversas coisas

    // Imprimindo a Lista

    System.out.println("Lista: " + lista);

    // Adicionando um elemento no inicio da lista

    lista.addFirst("Elemento antes do 1"); // Peguei comandos no site https://www.w3schools.com/java/java_linkedlist.asp

    // Adicionando elementos no final da lista

    lista.addLast("Elemento Final");

    // Adicionando o elemento numa posicao desejada na lista

    adicionarNaPosicao(lista, 4, "Novo Elemento 2.5");

    // print da lista apos as adicoes

    System.out.println("Lista: " + lista);

    // removendo os elementos, para poder adicionar elementos na posicao desejada tive que alterar esse codigo para que o remove nao esteja removendo amais  doq deveria

    lista.removeFirst();
    lista.removeLast();

    

    // print depois das remocoes

    System.out.println("lista: " + lista);

  }

  // tive que criar um metodo para posicionar o elemento na posicao desejada
  private static void adicionarNaPosicao(LinkedList<String> lista, int i, String string) {
    // e fazer uma critica para evitar a excecao "IndexOutofBoundsException" e para checar se a posicao e igual o tamanho  da lista adicionar o elemento no final
    if (i >= 0 && i < lista.size()) {
      lista.add(i, string);

    } else if (i >= lista.size()){
      lista.addLast(string);

    } else {
       System.out.println("Posicao invalida");
    }

  }

}
