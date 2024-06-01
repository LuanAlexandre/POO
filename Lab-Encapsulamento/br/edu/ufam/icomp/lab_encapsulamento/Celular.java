package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.*;

public class Celular implements Localizavel {
  private int codPais;
  private int codArea;
  private int numero;

  public Celular(int codPais, int codArea, int numero) {
    setCodPais(codPais);
    setCodArea(codArea);
    setNumero(numero);
  }

  public final void setCodPais(int codPais) {
    if (codPais >= 1 && codPais <= 1999)
    this.codPais = codPais;
    else
    this.codPais = -1;
  }

  public final void setCodArea(int codArea) {
    if (codArea >= 10 && codArea <= 99)
    this.codArea = codArea;
    else
    this.codArea = -1;
  }

  public final void setNumero(int numero) {
    if (numero >= 10000000 && numero <= 999999999)
    this.numero = numero;
    else
    this.numero = -1;
  }

  public int getCodPais() {
    return codPais;
  }

  public int getCodArea() {
    return codArea;
  }

  public int getNumero() {
    return numero;
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
    return 50.0;
  }
}
