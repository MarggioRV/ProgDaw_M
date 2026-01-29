package Actividades5.clases;

public class Rectangulo extends Figura {
    protected double b;
    protected double h;

    public Rectangulo() {
    }

    public Rectangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public Rectangulo(String color, double b, double h) {
        super(color);
        this.b = b;
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    double area() {
        // TODO Auto-generated method stub
        return 2*(h+b);
    }

    @Override
    double perímetro() {
        // TODO Auto-generated method stub
        return b*h;
    }

}
