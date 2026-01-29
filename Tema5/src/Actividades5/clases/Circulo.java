package Actividades5.clases;

public class Circulo extends Figura {
    protected final double PI = 3.14;
    protected double diametro;

    public Circulo() {
    }

    public Circulo(String color, double diametro) {
        super(color);
        this.diametro = diametro;
    }

    @Override
    double area() {
        // TODO Auto-generated method stub
        return PI * PI;
    }

    @Override
    double perímetro() {
        // TODO Auto-generated method stub
        return diametro * PI;
    }
}
