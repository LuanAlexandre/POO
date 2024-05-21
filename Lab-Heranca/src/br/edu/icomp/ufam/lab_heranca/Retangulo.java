package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica{
    public double altura;
    public double largura;

    public Retangulo(int posX, int posY, double largura, double altura) {
        super(posX, posY);
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double getArea() {
        double area = this.altura * this.largura;
        
        return area;
    }
    
    @Override
    public double getPerimetro() {
        double perimetro = 2*(this.altura + this.largura);

        return perimetro;
    }

    @Override
    public String toString() {
        String posicao = getPosString();
        double area = getArea();
        double perimetro = getPerimetro();
        String description = String.format("Retângulo na %s com largura de %.1fcm e altura de %.1fcm (área=%.1fcm2, perímetro=%.1fcm)",
        posicao, largura, altura, area, perimetro);

        return description;
    }
}
