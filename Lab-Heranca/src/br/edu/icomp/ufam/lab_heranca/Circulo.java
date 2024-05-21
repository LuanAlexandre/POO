package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica {
    public double raio;

    public Circulo(int posX, int posY, double raio) {
        super(posX, posY);
        this.raio = raio;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.raio, 2.0);
    }

    public double getPerimetro() {
        return 2.0 * Math.PI * this.raio;
    }

    public String toString() {
        String posicao = super.getPosString();
        double area = this.getArea();
        double perimetro = this.getPerimetro();

        return "Círculo na " + posicao + " com raio de " + this.raio + "cm (área=" + area + "cm2, perímetro=" + perimetro + "cm)";
    }
}