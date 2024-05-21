package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo{
    public Quadrado(int posX, int posY, double lado) {
        super(posX, posY, lado, lado);
    }

    @Override
    public String toString() {
        String posicao = getPosString();
        double lado = altura;
        double area = getArea();
        double perimetro = getPerimetro();

        return String.format("Quadrado na %s com lado de %.1fcm (área=%.1fcm2, perímetro=%.1fcm)",
        posicao, lado, area, perimetro);
    }
}
