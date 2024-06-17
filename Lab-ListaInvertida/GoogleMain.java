import java.util.*;

public class GoogleMain {
  public static void main(String args[]) {
    ListaInvertida nTabela = new ListaInvertida();

    boolean documentoNovo = nTabela.insere("tempo", "documento.txt");
    boolean documentoDuplicado = nTabela.insere("tempo", "documento.txt");

    System.out.println(documentoNovo);
    System.out.println(documentoDuplicado);

    LinkedList<String> palavra = nTabela.busca("tempo");

    System.out.println(palavra);

    String descricao = nTabela.toString();

    System.out.println(descricao);
  }
}
