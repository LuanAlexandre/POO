package br.edu.icomp.ufam.lab_heranca;

abstract public class FormaGeometrica {
    public int posX;
    public int posY;

    public FormaGeometrica(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    abstract public double getArea();

    abstract public double getPerimetro();

    public String getPosString() {
        return String.format("posição (%d, %d)", this.posX, this.posY);
    }
}