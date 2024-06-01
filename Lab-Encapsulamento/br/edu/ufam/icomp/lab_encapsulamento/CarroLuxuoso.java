package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.*;

public class CarroLuxuoso extends Carro implements Localizavel {
  public CarroLuxuoso(String placa) {
    super(placa);
  }

  public Posicao getPosicao() {
    Random random = new Random();
    Posicao posicao;

    double latitude = (-3.16) + ((-2.96 - (-3.16)) * random.nextDouble());
    double longitude = (-60.12) + (-59.82 - (-60.12)) * random.nextDouble();    
    double altitude = (15) + (100 - (15)) * random.nextDouble();    

    posicao = new Posicao(latitude, longitude, altitude);
    return posicao;
  }

  public double getErroLocalizacao() {
    return 15.0;
  }
}
