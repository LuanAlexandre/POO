package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
  private Coordenada[] caminho;
  private int tamanho;

  public Caminho(int maxTam) {
    this.caminho = new Coordenada[maxTam];
    this.tamanho = 0;
  }

  public int tamanho() {
    return tamanho;
  }

  public void addCoordenada(Coordenada coordenada)
  throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException {

    if (tamanho == 0) {
      caminho[0] = coordenada;
      tamanho++;
    }
    else {
      if (tamanho == caminho.length) throw new TamanhoMaximoExcedidoException();
  
      if (caminho[tamanho-1].distancia(coordenada) > 15.0) throw new DistanciaEntrePontosExcedidaException();
  
      for (int j=0; j < caminho.length; j++) {
        if (caminho[j] == null) {
          caminho[j] = coordenada;
          tamanho++;
          break;
        }
      }
    }

  }

  public void reset() {
    for (int i=0; i < tamanho; i++) {
      caminho[i] = null;
    }

    tamanho = 0;
  }

  @Override
  public String toString() {
    String descricao = "Dados do caminho:\n  " +
    "- Quantidade de pontos: " + tamanho + "\n" +
    "- Pontos:\n  ";

    for (int i=0; i < tamanho; i++) {
      if (i != tamanho - 1)
      descricao += "-> " + caminho[i].getPosX() + ", " + caminho[i].getPosY() + "\n";
      else
      descricao += "-> " + caminho[i].getPosX() + ", " + caminho[i].getPosY();
    }

    return descricao;
  }
}
