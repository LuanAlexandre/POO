import java.util.*;

public class ListaInvertida {
    private Hashtable <String, LinkedList<String>> tabela;

    public ListaInvertida() {
        this.tabela = new Hashtable <String, LinkedList<String>>();
    }

    public boolean insere(String palavra, String documento) {
        LinkedList<String> palavraExiste = tabela.get(palavra);
        
        if(palavraExiste != null) {
            boolean documentoExiste = palavraExiste.contains(documento);

            if(documentoExiste) return false;
            else {
                palavraExiste.add(documento);
                return true;
            }
        }
        else {
            LinkedList<String> novoDocumento = new LinkedList<String>();
            novoDocumento.add(documento);
            tabela.put(palavra, novoDocumento);
            return true;
        }
    }
}