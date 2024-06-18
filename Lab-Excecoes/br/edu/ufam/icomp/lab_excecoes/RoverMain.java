package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
  public void main(String args[]) {
    Caminho caminho = new Caminho(6);

    Coordenada c1 = null;
    Coordenada c2 = null;
    Coordenada c3 = null;
    Coordenada c4 = null;
    Coordenada c5 = null;
    Coordenada c6 = null;

    try {
      c1 = new Coordenada(32, 30, 1);
      c2 = new Coordenada(35, 40, 2);
      c3 = new Coordenada(38, 30, 3);
      c4 = new Coordenada(30, 36, 4);
      c5 = new Coordenada(40, 36, 5);
      c6 = new Coordenada(33, 31, 6);
    }
    catch (CoordenadaNegativaException erroCoordNegativa) {
      System.out.println(erroCoordNegativa.getMessage());
    }
    catch (CoordenadaForaDosLimitesException erroDeLimite) {
      System.out.println(erroDeLimite.getMessage());
    }
    catch (DigitoInvalidoException erroDigito) {
      System.out.println(erroDigito.getMessage());
    }
    finally {

    }
    
    caminho.addCoordenada(c1);

    try {
      caminho.addCoordenada(c2);
      caminho.addCoordenada(c3);
      caminho.addCoordenada(c4);
      caminho.addCoordenada(c5);
      caminho.addCoordenada(c6);
    }
    catch (TamanhoMaximoExcedidoException erroTamanho) {
      System.out.println(erroTamanho.getMessage());
    }
    catch (DistanciaEntrePontosExcedidaException erroDeDistancia) {
      System.out.println(erroDeDistancia.getMessage());
    }
    finally {

    }

    System.out.println(caminho.toString());
  }
}