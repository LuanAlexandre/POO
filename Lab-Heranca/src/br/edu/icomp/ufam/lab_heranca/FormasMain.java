package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {
  public static void main(String[] args) {
    Object[] formas = new Object[3];

    Circulo circulo = new Circulo(4, 4, 10);
    Retangulo retangulo = new Retangulo(8, 8, 2, 3);
    Quadrado quadrado = new Quadrado(0, 0, 10);

    formas[0] = circulo;
    formas[1] = retangulo;
    formas[2] = quadrado;

    for(int i=0; i < 3; i++) {
      System.out.println(formas[i]);
    }
  }
}
