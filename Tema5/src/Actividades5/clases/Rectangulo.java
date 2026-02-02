package Actividades5.clases;

public class Rectangulo extends Figura {

    //Atributos
    protected double largo; //ancho es 3D
    protected double alto;

    //Constructores

    public Rectangulo() {
    }

    public Rectangulo(double largo, double alto) {
        this.largo = largo;
        this.alto = alto;
    }

    public Rectangulo(String color, double largo, double alto) {
        super(color);
        this.largo = largo;
        this.alto = alto;
    }

    //Get y Set

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    double area() {
        // TODO Auto-generated method stub
        return  largo * alto;
    }

    @Override
    double perímetro() {
        // TODO Auto-generated method stub
        return 2*largo + 2*alto;
    }
}