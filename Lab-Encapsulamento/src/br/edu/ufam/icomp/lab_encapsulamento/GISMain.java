package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {
  public static void main(String[] args) {
    Posicao posicao1 = new Posicao(3, 4, 5);

    System.out.println(posicao1);

    Celular celular1 = new Celular(55, 92, 999126369);

    System.out.println(celular1.getPosicao());

    Localizavel vetorLocalizaveis[] = new Localizavel[1];
    // Localizavel carrosLocalizaveis[] = new CarroLuxuoso[1];

    CarroLuxuoso carro1 = new CarroLuxuoso("QZK0G78");

    System.out.println(carro1.getPosicao());

    vetorLocalizaveis[0] = celular1;
    // carrosLocalizaveis[0] = carro1;

    for (int i=0; i < 1; i++) {
      System.out.println(vetorLocalizaveis[i].getPosicao());
      // System.out.println(carrosLocalizaveis[i].getPosicao());
    }
  }
}
