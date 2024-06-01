package br.edu.ufam.icomp.lab_encapsulamento;

public class Posicao {
  private double latitude;
  private double longitude;
  private double altitude;

  public Posicao(double latitude, double longitude, double altitude) {
    this.latitude = latitude;
    this.longitude = longitude;
    this.altitude = altitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  public void setAltitude(double altitude) {
    this.altitude = altitude;
  }

  public double getLatitude() {
    return latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public double getAltitude() {
    return altitude;
  }

  @Override
  public String toString() {
    return "Posição: " + latitude + ", " + longitude + ", " + altitude;
  }
}
